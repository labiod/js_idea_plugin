package com.kgb.js.annotators;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 1/30/17.
 */
public class JSPropertyAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
//        if (element instanceof JSVariable && !element.getNode().getTreeParent().getElementType().equals(JSTypes.VAR_NAME)) {
//            JSVariable property = (JSVariable) element;
//            String propertyName = property.getText();
//
//            if (propertyName != null) {
//                Project project = element.getProject();
//                List<JSVarDeclaration> properties = JSUtil.findPropertiesBefore(project, propertyName, property.getNode().getStartOffset());
//                if (properties.size() == 1) {
//                    TextRange range = new TextRange(element.getTextRange().getStartOffset(),
//                            element.getTextRange().getStartOffset());
//                    Annotation annotation = holder.createInfoAnnotation(range, null);
//                    annotation.setTextAttributes(DefaultLanguageHighlighterColors.LINE_COMMENT);
//                } else if (properties.size() == 0) {
//                    TextRange range = new TextRange(element.getTextRange().getStartOffset(),
//                            element.getTextRange().getEndOffset());
//                    holder.createErrorAnnotation(range, "Undefined property").
//                            registerFix(new CreatePropertyQuickFix(propertyName));
//                }
//            }
//        } else if (element instanceof JSFunctionCall) {
//            JSFunctionCall functionCall = (JSFunctionCall) element;
//            String functionName = functionCall.getVname().getText();
//
//            if (functionName != null) {
//                Project project = element.getProject();
//                List<JSFunctionDeclaration> functions = JSUtil.findFunction(project, functionName, JSPsiImplUtil.getVirtualFile(project, element));
//                if (functions.size() >= 1) {
//                    for (JSFunctionDeclaration fun : functions) {
//                        int argsSize = checkArgSize(functionCall, fun);
//                        if (argsSize == 0) {
//                            TextRange range
//                                    = new TextRange(element.getTextRange().getStartOffset(),
//                                    element.getTextRange().getStartOffset());
//                            Annotation annotation = holder.createInfoAnnotation(range, null);
//                            annotation.setTextAttributes(DefaultLanguageHighlighterColors.LINE_COMMENT);
//                            return;
//                        }
//                    }
//                    TextRange range = new TextRange(element.getTextRange().getStartOffset(),
//                            element.getTextRange().getEndOffset());
//                    holder.createErrorAnnotation(range, String.format("No overload for function '%s' takes %d arguments", functionName, functionCall.getFunParams().getLength())).
//                            registerFix(new CreatePropertyQuickFix(functionName));
//                } else if (functions.size() == 0) {
//                    TextRange range = new TextRange(element.getTextRange().getStartOffset(),
//                            element.getTextRange().getEndOffset());
//                    holder.createErrorAnnotation(range, "Undefined function").
//                            registerFix(new CreatePropertyQuickFix(functionName));
//                }
//            }
//        }
    }

//    private int checkArgSize(JSFunctionCall functionCall, JSMethod function) {
//        int funCallArgsLength = functionCall.getFunParams().getLength();
//        int funDefArgsLength = function.getArgsLength();
//        return funCallArgsLength == funDefArgsLength ? 0 : funCallArgsLength > funDefArgsLength ? 1 : -1;
//    }
}
