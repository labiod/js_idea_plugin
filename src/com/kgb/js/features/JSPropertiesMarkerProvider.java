package com.kgb.js.features;

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.kgb.js.JSUtil;
import com.kgb.js.JsIcons;
import com.kgb.js.psi.*;
import com.kgb.js.psi.impl.JSPsiImplUtil;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

/**
 * @author labiod : <labiod@wp.pl>;
 * @version 0.0.1; created:02.02.2017
 *          Class JSPropertiesMarkerProvider
 */
public class JSPropertiesMarkerProvider extends RelatedItemLineMarkerProvider {
    @Override
    protected void collectNavigationMarkers(@NotNull PsiElement element,
                                            Collection<? super RelatedItemLineMarkerInfo> result) {
//        if (element instanceof JSVarProperty && !element.getNode().getTreeParent().getElementType().equals(JSTypes.VAR_NAME)) {
//            JSVarProperty jsVarProperty = (JSVariable) element;
//            String value = jsVarProperty.getText();
//            if (value != null) {
//                Project project = element.getProject();
//                final List<JSVarDeclaration> properties = JSUtil.findProperties(project, value, JSPsiImplUtil.getVirtualFile(project, element));
//                if (properties.size() > 0) {
//                    NavigationGutterIconBuilder<PsiElement> builder =
//                            NavigationGutterIconBuilder.create(JsIcons.PROPERTY_ICON).
//                                    setTargets(properties).
//                                    setTooltipText("Navigate to a simple property");
//                    result.add(builder.createLineMarkerInfo(element));
//                }
//            }
//        } else if (element instanceof JSFunctionCall) {
//            JSFunctionCall jsFunctionCall = (JSFunctionCall) element;
//            String value = jsFunctionCall.getVname().getText();
//            if (value != null) {
//                Project project = element.getProject();
//                final List<JSFunctionDeclaration> properties = JSUtil.findFunction(project, value, JSPsiImplUtil.getVirtualFile(project, element));
//                if (properties.size() > 0) {
//                    NavigationGutterIconBuilder<PsiElement> builder =
//                            NavigationGutterIconBuilder.create(JsIcons.FUNCTION_ICON).
//                                    setTargets(properties).
//                                    setTooltipText("Navigate to a simple property");
//                    result.add(builder.createLineMarkerInfo(element));
//                }
//            }
//        }
    }
}
