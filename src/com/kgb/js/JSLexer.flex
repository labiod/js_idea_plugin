package com.kgb.js.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

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
MULTILINE_COMMENT="/"\*.*\n\t\r\*"/"
NUMBER=[0-9]+(\.[0-9]*)?
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
VNAME=[:letter:][a-zA-Z_0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}            { return WHITE_SPACE; }

  ";"                      { return SEMI; }
  "="                      { return EQ; }
  "{"                      { return LP; }
  "}"                      { return RP; }
  "("                      { return LP2; }
  ")"                      { return RP2; }
  "+"                      { return OP_1; }
  "-"                      { return OP_2; }
  "*"                      { return OP_3; }
  "/"                      { return OP_4; }
  "!"                      { return OP_5; }
  ">"                      { return OP_6; }
  "<"                      { return OP_7; }
  "true"                   { return TRUE; }
  "false"                  { return FALSE; }
  "null"                   { return NULL; }
  "."                      { return VDOT; }
  "var"                    { return VAR; }
  "function"               { return FUNCTION; }
  "if"                     { return IF; }
  "else"                   { return ELSE; }
  "return"                 { return RETURN; }

  {SPACE}                  { return SPACE; }
  {COMMENT}                { return COMMENT; }
  {MULTILINE_COMMENT}      { return MULTILINE_COMMENT; }
  {NUMBER}                 { return NUMBER; }
  {STRING}                 { return STRING; }
  {VNAME}                  { return VNAME; }

}

[^] { return BAD_CHARACTER; }
