/*
 * generated by Xtext 2.12.0
 */
package com.kaleidoscope.usecase.showcase.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EmployeeDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/kaleidoscope/usecase/showcase/xtext/parser/antlr/internal/InternalEmployeeDsl.tokens");
	}
}