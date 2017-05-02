package com.kgb.js.psi.impl;

import com.intellij.lang.ASTNode;
import com.kgb.js.psi.JSProperty;
import com.kgb.js.psi.JSPropertySpace;
import org.jetbrains.annotations.NotNull;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/28/17.
 */
public abstract class JSPropertyImpl extends JSClassImpl implements JSProperty {

    public JSPropertyImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public JSProperty getParentProperty() {
        return null;
    }

    @Override
    public JSPropertySpace getNamespace() {
        return findChildByClass(JSPropertySpace.class);
    }
}
