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

public class JSCondImpl extends JSPsiBaseImpl implements JSCond {

  public JSCondImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JSVisitor visitor) {
    visitor.visitCond(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JSVisitor) accept((JSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JSAndExpr getAndExpr() {
    return findChildByClass(JSAndExpr.class);
  }

  @Override
  @Nullable
  public JSCond getCond() {
    return findChildByClass(JSCond.class);
  }

  @Override
  @Nullable
  public JSCondExpr getCondExpr() {
    return findChildByClass(JSCondExpr.class);
  }

  @Override
  @Nullable
  public JSExpr getExpr() {
    return findChildByClass(JSExpr.class);
  }

  @Override
  @Nullable
  public JSOrExpr getOrExpr() {
    return findChildByClass(JSOrExpr.class);
  }

}