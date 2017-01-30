package com.kgb.js.annotators;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import com.kgb.js.JSUtil;
import com.kgb.js.psi.JSTypes;
import com.kgb.js.psi.JSVarDeclaration;
import com.kgb.js.psi.JSVarName;
import com.kgb.js.psi.JSVarProperty;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 1/30/17.
 */
public class JSPropertyAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (element instanceof JSVarProperty && !element.getNode().getTreeParent().getElementType().equals(JSTypes.VAR_NAME)) {
            JSVarProperty property = (JSVarProperty) element;
            String propertyName = property.getText();

            if (propertyName != null) {
                System.out.println(propertyName);
                Project project = element.getProject();
                List<JSVarDeclaration> properties = JSUtil.findPropertiesBefore(project, propertyName, property.getNode().getStartOffset());
                if (properties.size() == 1) {
                    TextRange range = new TextRange(element.getTextRange().getStartOffset(),
                            element.getTextRange().getStartOffset());
                    Annotation annotation = holder.createInfoAnnotation(range, null);
                    annotation.setTextAttributes(DefaultLanguageHighlighterColors.LINE_COMMENT);
                } else if (properties.size() == 0) {
                    TextRange range = new TextRange(element.getTextRange().getStartOffset(),
                            element.getTextRange().getEndOffset());
                    holder.createErrorAnnotation(range, "Undefined property").
                            registerFix(new CreatePropertyQuickFix(propertyName));
                }
            }
        }
    }
}
