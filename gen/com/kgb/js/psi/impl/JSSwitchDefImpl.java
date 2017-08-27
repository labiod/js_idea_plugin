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

public class JSSwitchDefImpl extends JSPsiBaseImpl implements JSSwitchDef {

  public JSSwitchDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JSVisitor visitor) {
    visitor.visitSwitchDef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JSVisitor) accept((JSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JSCaseBlock> getCaseBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JSCaseBlock.class);
  }

  @Override
  @Nullable
  public JSDefaultBlock getDefaultBlock() {
    return findChildByClass(JSDefaultBlock.class);
  }

  @Override
  @NotNull
  public JSPropertyObject getPropertyObject() {
    return findNotNullChildByClass(JSPropertyObject.class);
  }

}
