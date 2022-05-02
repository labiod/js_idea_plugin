package com.kgb.js.psi.impl;

import com.intellij.psi.tree.IElementType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.betlej on 12/19/16.
 */
public class JSPsiImplUtil {
    public static List<IElementType> getSubElements(IElementType type) {
        System.out.println(type.toString());
        return new ArrayList<>();
    }
}
