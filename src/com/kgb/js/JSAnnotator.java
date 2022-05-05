package com.kgb.js;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import org.jetbrains.annotations.NotNull;

public class JSAnnotator implements Annotator {
    public static final String JS_PREFIX_STR = "js";
    public static final String JS_SEPARATOR_STR = "=";

    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (!(psiElement instanceof PsiLiteralExpression)) {
            return;
        }
        PsiLiteralExpression literalExpression = (PsiLiteralExpression) psiElement;
        String value = literalExpression.getValue() instanceof String ? (String) literalExpression.getValue() : null;
     }
}
