package com.kgb.js.psi.impl;

import com.intellij.lang.ASTNode;
import com.kgb.js.psi.JSPropertySpace;
import com.kgb.js.psi.JSType;
import org.jetbrains.annotations.NotNull;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/25/17.
 */
public abstract class JSTypeImpl extends JSClassImpl implements JSType {
    public JSTypeImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public JSPropertySpace getNamespace() {
        return null;
    }
}
