package com.kgb.js.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;

/**
 * @author labiod : <labiod@wp.pl>;
 * @version 0.0.1; created:04.02.2017
 *          Class com.kgb.js.psi.JSObject
 */
public interface JSObject extends JSPsiElement {
    PsiElement getParent();
}
