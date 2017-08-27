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
        return getNamespace();
    }

    @Override
    public JSProperty getNamespace() {
        return findChildByClass(JSPropertySpace.class);
    }

    @Override
    public void setNameSpace(JSProperty property) {

    }

    @Override
    public String getFullName() {
        return getCorrectNameSpace() + getName();
    }

    private String getCorrectNameSpace() {
        return getNamespace() != null ?
                getNamespace().getText().endsWith(".") ?
                        getNamespace().getText()
                        : getNamespace().getText() + "."
                : "";
    }
}