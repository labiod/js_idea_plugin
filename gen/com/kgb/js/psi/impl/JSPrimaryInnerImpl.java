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

public class JSPrimaryInnerImpl extends JSPsiBaseImpl implements JSPrimaryInner {

  public JSPrimaryInnerImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JSVisitor visitor) {
    visitor.visitPrimaryInner(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JSVisitor) accept((JSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JSArrayValue getArrayValue() {
    return findChildByClass(JSArrayValue.class);
  }

  @Override
  @Nullable
  public JSCond getCond() {
    return findChildByClass(JSCond.class);
  }

  @Override
  @Nullable
  public JSExpr getExpr() {
    return findChildByClass(JSExpr.class);
  }

  @Override
  @Nullable
  public JSPropertyObject getPropertyObject() {
    return findChildByClass(JSPropertyObject.class);
  }

  @Override
  @Nullable
  public JSTypeDef getTypeDef() {
    return findChildByClass(JSTypeDef.class);
  }

}
