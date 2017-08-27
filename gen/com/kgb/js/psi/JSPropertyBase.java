// This is a generated file. Not intended for manual editing.
package com.kgb.js.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface JSPropertyBase extends JSProperty {

  @Nullable
  JSFunctionCall getFunctionCall();

  @Nullable
  JSPropertyArray getPropertyArray();

  @Nullable
  PsiElement getVname();

  JSMethod[] getMethodsInner();

  ItemPresentation getPresentation();

}
