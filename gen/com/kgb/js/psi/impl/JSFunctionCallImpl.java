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

public class JSFunctionCallImpl extends JSPsiBaseImpl implements JSFunctionCall {

  public JSFunctionCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JSVisitor visitor) {
    visitor.visitFunctionCall(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JSVisitor) accept((JSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JSFunParams getFunParams() {
    return findNotNullChildByClass(JSFunParams.class);
  }

  @Override
  @NotNull
  public PsiElement getVname() {
    return findNotNullChildByType(VNAME);
  }

}
