// This is a generated file. Not intended for manual editing.
package com.kgb.js.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface JSAssignProperty extends JSClassDef {

  @NotNull
  JSPropertyObject getPropertyObject();

  @NotNull
  JSValue getValue();

  PsiElement getNameIdentifier();

  boolean isFunctionRef();

  ItemPresentation getPresentation();

  JSMethod[] getMethodsInner();

}
