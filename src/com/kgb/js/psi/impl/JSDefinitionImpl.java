package com.kgb.js.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/14/17.
 */
public class JSDefinitionImpl extends ASTWrapperPsiElement {

    public JSDefinitionImpl(@NotNull ASTNode node) {
        super(node);
    }
}
