/*
 * generated by Xtext 2.12.0
 */
grammar InternalPersonDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package com.kaleidoscope.usecase.showcase.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.kaleidoscope.usecase.showcase.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.kaleidoscope.usecase.showcase.xtext.services.PersonDslGrammarAccess;

}
@parser::members {
	private PersonDslGrammarAccess grammarAccess;

	public void setGrammarAccess(PersonDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRulePersonContainer
entryRulePersonContainer
:
{ before(grammarAccess.getPersonContainerRule()); }
	 rulePersonContainer
{ after(grammarAccess.getPersonContainerRule()); } 
	 EOF 
;

// Rule PersonContainer
rulePersonContainer 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPersonContainerAccess().getPersonsAssignment()); }
		(rule__PersonContainer__PersonsAssignment)*
		{ after(grammarAccess.getPersonContainerAccess().getPersonsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePerson
entryRulePerson
:
{ before(grammarAccess.getPersonRule()); }
	 rulePerson
{ after(grammarAccess.getPersonRule()); } 
	 EOF 
;

// Rule Person
rulePerson 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPersonAccess().getGroup()); }
		(rule__Person__Group__0)
		{ after(grammarAccess.getPersonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEInt
entryRuleEInt
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntAccess().getGroup()); }
		(rule__EInt__Group__0)
		{ after(grammarAccess.getEIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__0__Impl
	rule__Person__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getPersonAction_0()); }
	()
	{ after(grammarAccess.getPersonAccess().getPersonAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__1__Impl
	rule__Person__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getPersonKeyword_1()); }
	'Person'
	{ after(grammarAccess.getPersonAccess().getPersonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__2__Impl
	rule__Person__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getIDAssignment_2()); }
	(rule__Person__IDAssignment_2)
	{ after(grammarAccess.getPersonAccess().getIDAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__3__Impl
	rule__Person__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__4__Impl
	rule__Person__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getGroup_4()); }
	(rule__Person__Group_4__0)?
	{ after(grammarAccess.getPersonAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Person__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group_4__0__Impl
	rule__Person__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getNameKeyword_4_0()); }
	'name'
	{ after(grammarAccess.getPersonAccess().getNameKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getNameAssignment_4_1()); }
	(rule__Person__NameAssignment_4_1)
	{ after(grammarAccess.getPersonAccess().getNameAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PersonContainer__PersonsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPersonContainerAccess().getPersonsPersonParserRuleCall_0()); }
		rulePerson
		{ after(grammarAccess.getPersonContainerAccess().getPersonsPersonParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__IDAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPersonAccess().getIDEIntParserRuleCall_2_0()); }
		ruleEInt
		{ after(grammarAccess.getPersonAccess().getIDEIntParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__NameAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_4_1_0()); }
		ruleEString
		{ after(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
