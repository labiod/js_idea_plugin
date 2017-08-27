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

public class JSPropertyBaseImpl extends JSPropertyImpl implements JSPropertyBase {

  public JSPropertyBaseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JSVisitor visitor) {
    visitor.visitPropertyBase(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JSVisitor) accept((JSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JSFunctionCall getFunctionCall() {
    return findChildByClass(JSFunctionCall.class);
  }

  @Override
  @Nullable
  public JSPropertyArray getPropertyArray() {
    return findChildByClass(JSPropertyArray.class);
  }

  @Override
  @Nullable
  public PsiElement getVname() {
    return findChildByType(VNAME);
  }

  public JSMethod[] getMethodsInner() {
    return JSPsiImplUtil.getMethodsInner(this);
  }

  public ItemPresentation getPresentation() {
    return JSPsiImplUtil.getPresentation(this);
  }

}
