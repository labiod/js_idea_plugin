package com.kgb.js.psi;

import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author labiod : <labiod@wp.pl>;
 * @version 0.0.1; created:04.02.2017
 *          Class com.kgb.js.psi.JSClass
 */
public interface JSClass extends JSPsiBase {
    PsiElement getParent();

    @Nullable
    JSClass getSuperClass();

    @NotNull
    JSMethod[] getMethods();

    @NotNull
    JSField[] getAllFields();

    @NotNull
    JSMethod[] getAllMethods();

    JSPropertySpace getNamespace();
}
