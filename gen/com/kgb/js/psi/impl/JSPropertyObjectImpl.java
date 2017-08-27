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

public class JSPropertyObjectImpl extends JSPropertyImpl implements JSPropertyObject {

  public JSPropertyObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JSVisitor visitor) {
    visitor.visitPropertyObject(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JSVisitor) accept((JSVisitor)visitor);
    else super.accept(visitor);
  }

  public PsiElement getNameIdentifier() {
    return JSPsiImplUtil.getNameIdentifier(this);
  }

  public JSMethod[] getMethodsInner() {
    return JSPsiImplUtil.getMethodsInner(this);
  }

  public ItemPresentation getPresentation() {
    return JSPsiImplUtil.getPresentation(this);
  }

  public JSPropertySpace getNamespace() {
    return JSPsiImplUtil.getNamespace(this);
  }

}
