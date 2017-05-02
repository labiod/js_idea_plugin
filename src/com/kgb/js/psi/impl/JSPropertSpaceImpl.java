package com.kgb.js.psi.impl;

import com.intellij.lang.ASTNode;
import com.kgb.js.psi.JSMethod;
import com.kgb.js.psi.JSPropertySpace;
import org.jetbrains.annotations.NotNull;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 5/2/17.
 */
public class JSPropertSpaceImpl extends JSPropertyImpl implements JSPropertySpace {
    public JSPropertSpaceImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public JSMethod[] getMethodsInner() {
        return new JSMethod[0];
    }
}
