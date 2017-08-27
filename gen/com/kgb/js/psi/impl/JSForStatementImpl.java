// This is a generated file. Not intended for manual editing.
package com.kgb.js.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kgb.js.psi.JSTypes.*;
import com.kgb.js.psi.*;
import com.kgb.js.psi.utils.JSPsiImplUtil;

public class JSForStatementImpl extends JSPsiBaseImpl implements JSForStatement {

  public JSForStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JSVisitor visitor) {
    visitor.visitForStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JSVisitor) accept((JSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JSCall> getCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JSCall.class);
  }

  @Override
  @NotNull
  public List<JSClassDef> getClassDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JSClassDef.class);
  }

  @Override
  @NotNull
  public JSCond getCond() {
    return findNotNullChildByClass(JSCond.class);
  }

  @Override
  @NotNull
  public List<JSDoWhileStatement> getDoWhileStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JSDoWhileStatement.class);
  }

  @Override
  @NotNull
  public List<JSForStatement> getForStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JSForStatement.class);
  }

  @Override
  @NotNull
  public List<JSIfStatement> getIfStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JSIfStatement.class);
  }

  @Override
  @NotNull
  public List<JSReturnStatement> getReturnStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JSReturnStatement.class);
  }

  @Override
  @NotNull
  public List<JSSwitchDef> getSwitchDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JSSwitchDef.class);
  }

  @Override
  @NotNull
  public List<JSVarIncDec> getVarIncDecList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JSVarIncDec.class);
  }

  @Override
  @NotNull
  public List<JSWhileStatement> getWhileStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JSWhileStatement.class);
  }

}
