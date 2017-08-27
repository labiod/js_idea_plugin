// This is a generated file. Not intended for manual editing.
package com.kgb.js.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface JSFunctionDef extends JSClassDef, JSMethod {

  @NotNull
  List<JSCall> getCallList();

  @NotNull
  List<JSClassDef> getClassDefList();

  @NotNull
  List<JSDoWhileStatement> getDoWhileStatementList();

  @NotNull
  List<JSForStatement> getForStatementList();

  @NotNull
  JSFunArgs getFunArgs();

  @NotNull
  List<JSIfStatement> getIfStatementList();

  @NotNull
  List<JSReturnStatement> getReturnStatementList();

  @NotNull
  List<JSSwitchDef> getSwitchDefList();

  @NotNull
  List<JSWhileStatement> getWhileStatementList();

  @Nullable
  PsiElement getVname();

  PsiElement getNameIdentifier();

  int getArgsLength();

  ItemPresentation getPresentation();

  JSMethod[] getMethodsInner();

}
