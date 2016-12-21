package com.kgb.js;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.kgb.js.psi.JSTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by k.betlej on 12/19/16.
 */
public class JSBraceMatcher implements PairedBraceMatcher {
    private static BracePair[] PAIR = new BracePair[] {
            new BracePair(JSTypes.LP, JSTypes.RP, false),
    };
    @Override
    public BracePair[] getPairs() {
        return PAIR;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType iElementType, @Nullable IElementType iElementType1) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile psiFile, int i) {
        return i;
    }
}
