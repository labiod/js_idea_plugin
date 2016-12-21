package com.kgb.js.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.grammar.psi.BnfTypes;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.kgb.js.psi.JSTypes.*;

%%

%{
  public JSLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class JSLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[\s\t]+
COMMENT="//".*
NUMBER=[0-9]+(\.[0-9]*)?
STRING=(\"([^\"\\]|\\.)*\")
VNAME=[a-zA-Z][a-zA-Z_\-0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "{"                { return LP; }
  "}"                { return RP; }
  "true"             { return TRUE; }
  "false"            { return FALSE; }
  "null"             { return NULL; }
  "="                { return EQ_SEPARATOR; }
  "var"              { return VAR; }
  "EOL"              { return EOL; }

  {SPACE}            { return SPACE; }
  {COMMENT}          { return COMMENT; }
  {NUMBER}           { return NUMBER; }
  {STRING}           { return STRING; }
  {VNAME}            { return VNAME; }

}

[^] { return BAD_CHARACTER; }
