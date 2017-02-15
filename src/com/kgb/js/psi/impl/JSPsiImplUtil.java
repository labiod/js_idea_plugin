package com.kgb.js.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.PsiImplUtil;
import com.kgb.js.psi.*;
import org.jetbrains.annotations.NotNull;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 1/30/17.
 */
public class JSPsiImplUtil {
//    public static String getVar(JSDeclaration element) {
//        String var = element.getName();
//        if (var != null) {
//            return var.replace("\\\\ ", " ");
//        }
//        return null;
//    }
//
//    public static PsiElement getValue(JSVarDeclaration element) {
//        if (element instanceof JSGlobalVar) {
//            return ((JSGlobalVar) element).getVarValue();
//        } else if (element instanceof JSFunctionVar){
//            return ((JSFunctionVar) element).getAnimFunctionDef();
//        } else {
//            return ((JSObjectVar)element).getObjectDef();
//        }
//    }
//
//    public static String getName(JSDeclaration declaration) {
//        if (declaration instanceof JSVarDeclaration) {
//            return ((JSVarDeclaration) declaration).getVarName().getText();
//        } else {
//            return ((JSFunctionDeclaration) declaration).getNameIdentifier().getText();
//        }
//    }
//
//    public static PsiElement getVarName(JSVarDeclaration declaration) {
//        if (declaration instanceof JSGlobalVar) {
//            return ((JSGlobalVar) declaration).getVarName();
//        } else if (declaration instanceof JSFunctionVar) {
//            return ((JSFunctionVar) declaration).getNameIdentifier();
//        } else if (declaration instanceof JSObjectVar){
//            return ((JSObjectVar) declaration).getNameIdentifier();
//        } else {
//            return ((JSFieldVar)declaration).getFieldName();
//        }
//    }
//
//    public static PsiFile getVirtualFile(Project project, PsiElement element) {
//        ASTNode parent = element.getNode().getTreeParent();
//        while (parent.getTreeParent() != null) {
//            parent = parent.getTreeParent();
//        }
//        PsiElement psiElement = parent.getPsi();
//        if (psiElement instanceof PsiFile) {
//            return (PsiFile) psiElement;
//        } else {
//            return null;
//        }
//    }
//
//    public static int getLength(JSFunArgs funArgs) {
//        int size = 0;
//        if (funArgs.getCommaSeparatedList() != null) {
//            PsiElement element = funArgs.getCommaSeparatedList().getFirstChild();
//            if (element.getNode().getElementType().equals(JSTypes.VNAME)) {
//                size++;
//            }
//            while (element != funArgs.getCommaSeparatedList().getLastChild()) {
//                element = element.getNextSibling();
//                if (element.getNode().getElementType().equals(JSTypes.VNAME)) {
//                    size++;
//                }
//            }
//        }
//        return size;
//    }
//
    public static int getLength(JSFunParams jsFunParams) {
        int size = 0;
        if (jsFunParams.getCommaSeparatedList() != null) {
            return jsFunParams.getCommaSeparatedList().getChildren().length;
        }
        return size;
    }

    public static int getLength(JSFunArgs funArgs) {
        int size = 0;
        if (funArgs.getCommaSeparatedList() != null) {
            return funArgs.getCommaSeparatedList().getChildren().length;
        }
        return size;
    }

    public static PsiElement setName(PsiElement property, String name) {
        return PsiImplUtil.setName(property, name);
    }

    @NotNull
    public static PsiElement getNameIdentifier(JSProperty property) {
        return property;
    }

    @NotNull
    public static PsiElement getNameIdentifier(JSFunctionDeclaration functionDeclaration) {
        return functionDeclaration.getVname();
    }

    @NotNull
    public static int getArgsLength(JSFunctionProperty functionProperty) {
        return functionProperty.getFunParams().getLength();
    }

    @NotNull
    public static int getArgsLength(JSFunctionDeclaration jsMethod) {
        return jsMethod.getFunArgs().getLength();
    }


    public static PsiElement getParentProperty(JSProperty object) {
        if (object instanceof JSChildProperty) {
            return object.getPrevSibling();
        }
        return object.getParent();
    }
}
