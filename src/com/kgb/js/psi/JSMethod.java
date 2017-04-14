package com.kgb.js.psi;

import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.PsiTarget;

/**
 * @author labiod : <labiod@wp.pl>;
 * @version 0.0.1; created:03.02.2017
 *          Class com.kgb.js.psi.JSMethod
 */
public interface JSMethod extends JSClass {
    default int getArgsLength() {
        return 0;
    }
}
