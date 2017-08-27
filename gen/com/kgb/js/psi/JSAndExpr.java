// This is a generated file. Not intended for manual editing.
package com.kgb.js.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JSAndExpr extends JSPsiBase {

  @Nullable
  JSAndExpr getAndExpr();

  @Nullable
  JSCond getCond();

  @NotNull
  List<JSCondExpr> getCondExprList();

  @Nullable
  JSExpr getExpr();

}
