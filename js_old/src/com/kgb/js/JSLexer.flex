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

NUMBER=[0-9]+(\.[0-9]*)?
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
NEWLINE=\n
SPACE=[\s\t]+
COMMENT="//".*
MULTILINE_COMMENT="/"\*.*\n\t\r\*"/"
VNAME=[:letter:][a-zA-Z_0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}            { return WHITE_SPACE; }

  "="                      { return EQ; }
  "=="                     { return EQ2; }
  "==="                    { return EQ3; }
  "!="                     { return DEQ; }
  "!=="                    { return DEQ2; }
  "+="                     { return PLUSEQ; }
  "-="                     { return MINUSEQ; }
  "*="                     { return MULEQ; }
  "/="                     { return DIVEQ; }
  "{"                      { return LP; }
  "}"                      { return RP; }
  "("                      { return LP2; }
  ")"                      { return RP2; }
  "["                      { return LP3; }
  "]"                      { return RP3; }
  "+"                      { return OP_1; }
  "-"                      { return OP_2; }
  "*"                      { return OP_3; }
  "/"                      { return OP_4; }
  "!"                      { return OP_5; }
  "%"                      { return OP_10; }
  ">"                      { return OP_6; }
  ">="                     { return OP_7; }
  "<"                      { return OP_8; }
  "<="                     { return OP_9; }
  "&&"                     { return AND; }
  "||"                     { return OR; }
  ";"                      { return SEMI; }
  ":"                      { return COLON; }
  ","                      { return COMMA; }
  "."                      { return DOT; }
  "++"                     { return INCREMENT; }
  "--"                     { return DECREMENT; }
  "true"                   { return TRUE; }
  "false"                  { return FALSE; }
  "null"                   { return NULL; }
  "var"                    { return VAR; }
  "function"               { return FUNCTION; }
  "if"                     { return IF; }
  "?"                      { return T_IF; }
  "else"                   { return ELSE; }
  "for"                    { return FOR; }
  "switch"                 { return SWITCH; }
  "case"                   { return CASE; }
  "break"                  { return BREAK; }
  "default"                { return DEFAULT; }
  "return"                 { return RETURN; }
  "while"                  { return WHILE; }
  "do"                     { return DO; }

  {NUMBER}                 { return NUMBER; }
  {STRING}                 { return STRING; }
  {NEWLINE}                { return NEWLINE; }
  {SPACE}                  { return SPACE; }
  {COMMENT}                { return COMMENT; }
  {MULTILINE_COMMENT}      { return MULTILINE_COMMENT; }
  {VNAME}                  { return VNAME; }

}

[^] { return BAD_CHARACTER; }
