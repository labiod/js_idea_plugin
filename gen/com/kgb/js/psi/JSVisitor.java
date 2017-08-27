// This is a generated file. Not intended for manual editing.
package com.kgb.js.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class JSVisitor extends PsiElementVisitor {

  public void visitAndExpr(@NotNull JSAndExpr o) {
    visitPsiBase(o);
  }

  public void visitArrayParam(@NotNull JSArrayParam o) {
    visitPsiBase(o);
  }

  public void visitArrayParams(@NotNull JSArrayParams o) {
    visitPsiBase(o);
  }

  public void visitArrayValue(@NotNull JSArrayValue o) {
    visitPsiBase(o);
  }

  public void visitAssignProperty(@NotNull JSAssignProperty o) {
    visitClassDef(o);
  }

  public void visitBooleanType(@NotNull JSBooleanType o) {
    visitTypeDef(o);
  }

  public void visitCall(@NotNull JSCall o) {
    visitPsiBase(o);
  }

  public void visitCaseBlock(@NotNull JSCaseBlock o) {
    visitPsiBase(o);
  }

  public void visitClassDef(@NotNull JSClassDef o) {
    visitClass(o);
  }

  public void visitCond(@NotNull JSCond o) {
    visitPsiBase(o);
  }

  public void visitCondExpr(@NotNull JSCondExpr o) {
    visitPsiBase(o);
  }

  public void visitDefProperty(@NotNull JSDefProperty o) {
    visitClassDef(o);
  }

  public void visitDefaultBlock(@NotNull JSDefaultBlock o) {
    visitPsiBase(o);
  }

  public void visitDoWhileStatement(@NotNull JSDoWhileStatement o) {
    visitPsiBase(o);
  }

  public void visitDotSeparatedList(@NotNull JSDotSeparatedList o) {
    visitPsiBase(o);
  }

  public void visitElseIfStatement(@NotNull JSElseIfStatement o) {
    visitPsiBase(o);
  }

  public void visitElseStatement(@NotNull JSElseStatement o) {
    visitPsiBase(o);
  }

  public void visitExpr(@NotNull JSExpr o) {
    visitExpression(o);
  }

  public void visitForStatement(@NotNull JSForStatement o) {
    visitPsiBase(o);
  }

  public void visitFunArg(@NotNull JSFunArg o) {
    visitPsiBase(o);
  }

  public void visitFunArgs(@NotNull JSFunArgs o) {
    visitPsiBase(o);
  }

  public void visitFunParam(@NotNull JSFunParam o) {
    visitPsiBase(o);
  }

  public void visitFunParams(@NotNull JSFunParams o) {
    visitPsiBase(o);
  }

  public void visitFunctionCall(@NotNull JSFunctionCall o) {
    visitPsiBase(o);
  }

  public void visitFunctionDef(@NotNull JSFunctionDef o) {
    visitClassDef(o);
    // visitMethod(o);
  }

  public void visitIfStatement(@NotNull JSIfStatement o) {
    visitPsiBase(o);
  }

  public void visitNullType(@NotNull JSNullType o) {
    visitTypeDef(o);
  }

  public void visitNumberType(@NotNull JSNumberType o) {
    visitTypeDef(o);
  }

  public void visitOrExpr(@NotNull JSOrExpr o) {
    visitPsiBase(o);
  }

  public void visitPrimaryInner(@NotNull JSPrimaryInner o) {
    visitPsiBase(o);
  }

  public void visitPropArrayInner(@NotNull JSPropArrayInner o) {
    visitPsiBase(o);
  }

  public void visitPropertyArray(@NotNull JSPropertyArray o) {
    visitProperty(o);
  }

  public void visitPropertyBase(@NotNull JSPropertyBase o) {
    visitProperty(o);
  }

  public void visitPropertyObject(@NotNull JSPropertyObject o) {
    visitProperty(o);
  }

  public void visitReturnStatement(@NotNull JSReturnStatement o) {
    visitPsiBase(o);
  }

  public void visitStringType(@NotNull JSStringType o) {
    visitTypeDef(o);
  }

  public void visitSwitchDef(@NotNull JSSwitchDef o) {
    visitPsiBase(o);
  }

  public void visitTernaryBlock(@NotNull JSTernaryBlock o) {
    visitPsiBase(o);
  }

  public void visitTypeDef(@NotNull JSTypeDef o) {
    visitType(o);
  }

  public void visitValue(@NotNull JSValue o) {
    visitPsiBase(o);
  }

  public void visitVarIncDec(@NotNull JSVarIncDec o) {
    visitPsiBase(o);
  }

  public void visitWhileStatement(@NotNull JSWhileStatement o) {
    visitPsiBase(o);
  }

  public void visitClass(@NotNull JSClass o) {
    visitPsiBase(o);
  }

  public void visitExpression(@NotNull JSExpression o) {
    visitPsiBase(o);
  }

  public void visitProperty(@NotNull JSProperty o) {
    visitPsiBase(o);
  }

  public void visitType(@NotNull JSType o) {
    visitPsiBase(o);
  }

  public void visitPsiBase(@NotNull JSPsiBase o) {
    visitElement(o);
  }

}
