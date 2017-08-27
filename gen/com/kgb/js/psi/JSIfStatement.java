// This is a generated file. Not intended for manual editing.
package com.kgb.js.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JSIfStatement extends JSPsiBase {

  @NotNull
  List<JSCall> getCallList();

  @NotNull
  List<JSClassDef> getClassDefList();

  @Nullable
  JSCond getCond();

  @NotNull
  List<JSDoWhileStatement> getDoWhileStatementList();

  @NotNull
  List<JSElseIfStatement> getElseIfStatementList();

  @NotNull
  List<JSForStatement> getForStatementList();

  @NotNull
  List<JSIfStatement> getIfStatementList();

  @NotNull
  List<JSReturnStatement> getReturnStatementList();

  @NotNull
  List<JSSwitchDef> getSwitchDefList();

  @Nullable
  JSTernaryBlock getTernaryBlock();

  @NotNull
  List<JSWhileStatement> getWhileStatementList();

}
