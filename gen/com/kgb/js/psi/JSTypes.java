// This is a generated file. Not intended for manual editing.
package com.kgb.js.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.kgb.js.psi.impl.*;

public interface JSTypes {

  IElementType AND_EXPR = new JSElementType("AND_EXPR");
  IElementType ARRAY_PARAM = new JSElementType("ARRAY_PARAM");
  IElementType ARRAY_PARAMS = new JSElementType("ARRAY_PARAMS");
  IElementType ARRAY_VALUE = new JSElementType("ARRAY_VALUE");
  IElementType ASSIGN_PROPERTY = new JSElementType("ASSIGN_PROPERTY");
  IElementType BOOLEAN_TYPE = new JSElementType("BOOLEAN_TYPE");
  IElementType CALL = new JSElementType("CALL");
  IElementType CASE_BLOCK = new JSElementType("CASE_BLOCK");
  IElementType CLASS_DEF = new JSElementType("CLASS_DEF");
  IElementType COND = new JSElementType("COND");
  IElementType COND_EXPR = new JSElementType("COND_EXPR");
  IElementType DEFAULT_BLOCK = new JSElementType("DEFAULT_BLOCK");
  IElementType DEF_PROPERTY = new JSElementType("DEF_PROPERTY");
  IElementType DOT_SEPARATED_LIST = new JSElementType("DOT_SEPARATED_LIST");
  IElementType DO_WHILE_STATEMENT = new JSElementType("DO_WHILE_STATEMENT");
  IElementType ELSE_IF_STATEMENT = new JSElementType("ELSE_IF_STATEMENT");
  IElementType ELSE_STATEMENT = new JSElementType("ELSE_STATEMENT");
  IElementType EXPR = new JSElementType("EXPR");
  IElementType FOR_STATEMENT = new JSElementType("FOR_STATEMENT");
  IElementType FUNCTION_CALL = new JSElementType("FUNCTION_CALL");
  IElementType FUNCTION_DEF = new JSElementType("FUNCTION_DEF");
  IElementType FUN_ARG = new JSElementType("FUN_ARG");
  IElementType FUN_ARGS = new JSElementType("FUN_ARGS");
  IElementType FUN_PARAM = new JSElementType("FUN_PARAM");
  IElementType FUN_PARAMS = new JSElementType("FUN_PARAMS");
  IElementType IF_STATEMENT = new JSElementType("IF_STATEMENT");
  IElementType NULL_TYPE = new JSElementType("NULL_TYPE");
  IElementType NUMBER_TYPE = new JSElementType("NUMBER_TYPE");
  IElementType OR_EXPR = new JSElementType("OR_EXPR");
  IElementType PRIMARY_INNER = new JSElementType("PRIMARY_INNER");
  IElementType PROPERTY_ARRAY = new JSElementType("PROPERTY_ARRAY");
  IElementType PROPERTY_BASE = new JSElementType("PROPERTY_BASE");
  IElementType PROPERTY_OBJECT = new JSElementType("PROPERTY_OBJECT");
  IElementType PROP_ARRAY_INNER = new JSElementType("PROP_ARRAY_INNER");
  IElementType RETURN_STATEMENT = new JSElementType("RETURN_STATEMENT");
  IElementType STRING_TYPE = new JSElementType("STRING_TYPE");
  IElementType SWITCH_DEF = new JSElementType("SWITCH_DEF");
  IElementType TERNARY_BLOCK = new JSElementType("TERNARY_BLOCK");
  IElementType TYPE_DEF = new JSElementType("TYPE_DEF");
  IElementType VALUE = new JSElementType("VALUE");
  IElementType VAR_INC_DEC = new JSElementType("VAR_INC_DEC");
  IElementType WHILE_STATEMENT = new JSElementType("WHILE_STATEMENT");

  IElementType AND = new JSTokenType("&&");
  IElementType BREAK = new JSTokenType("break");
  IElementType CASE = new JSTokenType("case");
  IElementType COLON = new JSTokenType(":");
  IElementType COMMA = new JSTokenType(",");
  IElementType COMMENT = new JSTokenType("comment");
  IElementType DECREMENT = new JSTokenType("--");
  IElementType DEFAULT = new JSTokenType("default");
  IElementType DEQ = new JSTokenType("!=");
  IElementType DEQ2 = new JSTokenType("!==");
  IElementType DIVEQ = new JSTokenType("/=");
  IElementType DO = new JSTokenType("do");
  IElementType DOT = new JSTokenType(".");
  IElementType ELSE = new JSTokenType("else");
  IElementType EQ = new JSTokenType("=");
  IElementType EQ2 = new JSTokenType("==");
  IElementType EQ3 = new JSTokenType("===");
  IElementType FALSE = new JSTokenType("false");
  IElementType FOR = new JSTokenType("for");
  IElementType FUNCTION = new JSTokenType("function");
  IElementType IF = new JSTokenType("if");
  IElementType INCREMENT = new JSTokenType("++");
  IElementType LP = new JSTokenType("{");
  IElementType LP2 = new JSTokenType("(");
  IElementType LP3 = new JSTokenType("[");
  IElementType MINUSEQ = new JSTokenType("-=");
  IElementType MULEQ = new JSTokenType("*=");
  IElementType MULTILINE_COMMENT = new JSTokenType("multiline_comment");
  IElementType NEW = new JSTokenType("new");
  IElementType NULL = new JSTokenType("null");
  IElementType NUMBER = new JSTokenType("number");
  IElementType OP_1 = new JSTokenType("+");
  IElementType OP_10 = new JSTokenType("%");
  IElementType OP_2 = new JSTokenType("-");
  IElementType OP_3 = new JSTokenType("*");
  IElementType OP_4 = new JSTokenType("/");
  IElementType OP_5 = new JSTokenType("!");
  IElementType OP_6 = new JSTokenType(">");
  IElementType OP_7 = new JSTokenType(">=");
  IElementType OP_8 = new JSTokenType("<");
  IElementType OP_9 = new JSTokenType("<=");
  IElementType OR = new JSTokenType("||");
  IElementType PLUSEQ = new JSTokenType("+=");
  IElementType RETURN = new JSTokenType("return");
  IElementType RP = new JSTokenType("}");
  IElementType RP2 = new JSTokenType(")");
  IElementType RP3 = new JSTokenType("]");
  IElementType SEMI = new JSTokenType(";");
  IElementType STRING = new JSTokenType("string");
  IElementType SWITCH = new JSTokenType("switch");
  IElementType THIS = new JSTokenType("this");
  IElementType TRUE = new JSTokenType("true");
  IElementType T_IF = new JSTokenType("?");
  IElementType VAR = new JSTokenType("var");
  IElementType VNAME = new JSTokenType("vname");
  IElementType WHILE = new JSTokenType("while");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == AND_EXPR) {
        return new JSAndExprImpl(node);
      }
      else if (type == ARRAY_PARAM) {
        return new JSArrayParamImpl(node);
      }
      else if (type == ARRAY_PARAMS) {
        return new JSArrayParamsImpl(node);
      }
      else if (type == ARRAY_VALUE) {
        return new JSArrayValueImpl(node);
      }
      else if (type == ASSIGN_PROPERTY) {
        return new JSAssignPropertyImpl(node);
      }
      else if (type == BOOLEAN_TYPE) {
        return new JSBooleanTypeImpl(node);
      }
      else if (type == CALL) {
        return new JSCallImpl(node);
      }
      else if (type == CASE_BLOCK) {
        return new JSCaseBlockImpl(node);
      }
      else if (type == CLASS_DEF) {
        return new JSClassDefImpl(node);
      }
      else if (type == COND) {
        return new JSCondImpl(node);
      }
      else if (type == COND_EXPR) {
        return new JSCondExprImpl(node);
      }
      else if (type == DEFAULT_BLOCK) {
        return new JSDefaultBlockImpl(node);
      }
      else if (type == DEF_PROPERTY) {
        return new JSDefPropertyImpl(node);
      }
      else if (type == DOT_SEPARATED_LIST) {
        return new JSDotSeparatedListImpl(node);
      }
      else if (type == DO_WHILE_STATEMENT) {
        return new JSDoWhileStatementImpl(node);
      }
      else if (type == ELSE_IF_STATEMENT) {
        return new JSElseIfStatementImpl(node);
      }
      else if (type == ELSE_STATEMENT) {
        return new JSElseStatementImpl(node);
      }
      else if (type == EXPR) {
        return new JSExprImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new JSForStatementImpl(node);
      }
      else if (type == FUNCTION_CALL) {
        return new JSFunctionCallImpl(node);
      }
      else if (type == FUNCTION_DEF) {
        return new JSFunctionDefImpl(node);
      }
      else if (type == FUN_ARG) {
        return new JSFunArgImpl(node);
      }
      else if (type == FUN_ARGS) {
        return new JSFunArgsImpl(node);
      }
      else if (type == FUN_PARAM) {
        return new JSFunParamImpl(node);
      }
      else if (type == FUN_PARAMS) {
        return new JSFunParamsImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new JSIfStatementImpl(node);
      }
      else if (type == NULL_TYPE) {
        return new JSNullTypeImpl(node);
      }
      else if (type == NUMBER_TYPE) {
        return new JSNumberTypeImpl(node);
      }
      else if (type == OR_EXPR) {
        return new JSOrExprImpl(node);
      }
      else if (type == PRIMARY_INNER) {
        return new JSPrimaryInnerImpl(node);
      }
      else if (type == PROPERTY_ARRAY) {
        return new JSPropertyArrayImpl(node);
      }
      else if (type == PROPERTY_BASE) {
        return new JSPropertyBaseImpl(node);
      }
      else if (type == PROPERTY_OBJECT) {
        return new JSPropertyObjectImpl(node);
      }
      else if (type == PROP_ARRAY_INNER) {
        return new JSPropArrayInnerImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new JSReturnStatementImpl(node);
      }
      else if (type == STRING_TYPE) {
        return new JSStringTypeImpl(node);
      }
      else if (type == SWITCH_DEF) {
        return new JSSwitchDefImpl(node);
      }
      else if (type == TERNARY_BLOCK) {
        return new JSTernaryBlockImpl(node);
      }
      else if (type == TYPE_DEF) {
        return new JSTypeDefImpl(node);
      }
      else if (type == VALUE) {
        return new JSValueImpl(node);
      }
      else if (type == VAR_INC_DEC) {
        return new JSVarIncDecImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new JSWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
