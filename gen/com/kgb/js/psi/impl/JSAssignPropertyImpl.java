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
import com.intellij.navigation.ItemPresentation;

public class JSAssignPropertyImpl extends JSClassDefImpl implements JSAssignProperty {

  public JSAssignPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JSVisitor visitor) {
    visitor.visitAssignProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JSVisitor) accept((JSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JSPropertyObject getPropertyObject() {
    return findNotNullChildByClass(JSPropertyObject.class);
  }

  @Override
  @NotNull
  public JSValue getValue() {
    return findNotNullChildByClass(JSValue.class);
  }

  public PsiElement getNameIdentifier() {
    return JSPsiImplUtil.getNameIdentifier(this);
  }

  public boolean isFunctionRef() {
    return JSPsiImplUtil.isFunctionRef(this);
  }

  public ItemPresentation getPresentation() {
    return JSPsiImplUtil.getPresentation(this);
  }

  public JSMethod[] getMethodsInner() {
    return JSPsiImplUtil.getMethodsInner(this);
  }

}
