/*
 * generated by Xtext 2.12.0
 */
package com.kaleidoscope.usecase.showcase.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PersonDslStandaloneSetup extends PersonDslStandaloneSetupGenerated {

	def static void doSetup() {
		new PersonDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
