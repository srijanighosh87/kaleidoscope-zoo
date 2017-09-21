package com.kaleidoscope.usecase.showcase.third;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.auxiliary.xmi.artefactadapter.XMIArtefactAdapter;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Dest;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaAdapter;
import com.kaleidoscope.core.framework.workflow.controllers.deltabased.PersistentDeltaBasedController;

import Employees.EmployeeContainer;
import Employees.EmployeesFactory;
import Persons.PersonContainer;
import Persons.PersonsFactory;

public class ControllerModule extends AbstractModule{

	private Path sourceArtefactAdapterPath;
	private Path targetArtefactAdapterPath;
	private Path destination;
	
	private PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, Path, Path, Path>  controller = null;
	
	public ControllerModule(Path projectPath, Path destination) {
		
		this.sourceArtefactAdapterPath = projectPath.resolve(Paths.get("models", "src.xmi"));
		this.targetArtefactAdapterPath = projectPath.resolve(Paths.get("models", "trg.xmi"));	
		this.destination = destination;
		
	}
	
	@Provides @Src
	DeltaAdapter<OperationalDelta, Path, PersonContainer>provideSourceDeltaAdapter(){
		return new XMIdeltaAdapter<PersonContainer>();
	}
	
	@Provides @Trg
	DeltaAdapter<OperationalDelta, Path, EmployeeContainer>provideTargetDeltaAdapter(){
		return new XMIdeltaAdapter<EmployeeContainer>();
	}
	
	@Provides @Src
	ArtefactAdapter<PersonContainer, Path> provideSourceArtefactAdapter() {		
		return new XMIArtefactAdapter<PersonContainer>(sourceArtefactAdapterPath);
	}

	@Provides @Trg
	ArtefactAdapter<EmployeeContainer, Path> provideTargetArtefactAdapter() {	
		
		return new XMIArtefactAdapter<EmployeeContainer>(targetArtefactAdapterPath);
	}

	@Provides
	PersistentSynchroniser<PersonContainer, EmployeeContainer, String, OperationalDelta, OperationalDelta, Path> provideSynchroniser(){
		
		PersonContainer sourceModel = PersonsFactory.eINSTANCE.createPersonContainer();
		EmployeeContainer targetModel = EmployeesFactory.eINSTANCE.createEmployeeContainer();
		 
		PersistentSynchroniser<PersonContainer, EmployeeContainer, String, OperationalDelta, OperationalDelta, Path> tool = 
				new SynchroniserImpl(sourceModel, targetModel);
	
		tool.initialize();
		return tool;
	}
	@Override
	protected void configure() {
		bind(Path.class).annotatedWith(Dest.class).toInstance(destination);
	}
	
	public PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, Path, Path, Path> getControllerInstance() {
		
		Injector injector = Guice.createInjector(this);
		controller = 
			injector.getInstance(Key.get(new TypeLiteral<PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, Path, Path, Path>>(){}));
		
		return controller;
	}
	
}