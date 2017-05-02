package com.kgb.js.features.structureview;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.kgb.js.psi.*;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.diagnostic.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/14/17.
 */
public class JSStructureViewElement implements StructureViewTreeElement, SortableTreeElement {
    private PsiElement element;

    public JSStructureViewElement(PsiElement element) {
        this.element = element;
    }

    @Override
    public Object getValue() {
        return element;
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        return element instanceof PsiNamedElement ? ((PsiNamedElement) element).getName() : "";
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        Logger.getInstance(getClass()).info("element type: " + (element.getClass().getSimpleName()));
        return element instanceof NavigationItem ? ((NavigationItem) element).getPresentation() : null;
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        if (element instanceof JSFile || element instanceof JSFunctionDef) {
            List<JSStructureViewElement> treeElements = new ArrayList<>();
            JSClassDef[] definitions = PsiTreeUtil.getChildrenOfType(element, JSClassDef.class);
            if (definitions != null) {
                for (JSClassDef def : definitions) {
                    JSStructureViewElement treeElement = getDefinitionFromTree(treeElements, def);
                    if (treeElement != null) {
                        treeElements.remove(treeElement);
                    }
                    treeElements.add(new JSStructureViewElement(def));
                }
            }
            return treeElements.toArray(new TreeElement[treeElements.size()]);
        } else if ((element instanceof JSDefProperty && ((JSDefProperty)element).isFunctionRef()) ||
                (element instanceof JSAssignProperty && ((JSAssignProperty)element).isFunctionRef())) {
            List<JSStructureViewElement> treeElements = new ArrayList<>();
            PsiElement parent = element instanceof JSDefProperty ? ((JSDefProperty)element).getValue().getFunctionDef() :
                    ((JSAssignProperty)element).getValue().getFunctionDef();
            JSClassDef[] definitions = PsiTreeUtil.getChildrenOfType(parent, JSClassDef.class);
            if (definitions != null) {
                for (JSClassDef property : definitions) {
                    JSStructureViewElement treeElement = getDefinitionFromTree(treeElements, property);
                    if (treeElement != null) {
                        treeElements.remove(treeElement);

                    } else if (property instanceof JSDefProperty) {
                        JSPropertyObject parentProperty = ((JSDefProperty) property).getPropertyObject();
                    }
                    treeElements.add(new JSStructureViewElement(property));
                }
            }
            return treeElements.toArray(new TreeElement[treeElements.size()]);
        }
        return EMPTY_ARRAY;
    }

    private JSStructureViewElement getDefinitionFromTree(List<JSStructureViewElement> treeElements, JSClassDef def) {
        for (JSStructureViewElement element : treeElements) {
            if (element.element instanceof JSClassDef && ((JSClassDef) element.element).getName().equals(def.getName())) {
                return element;
            }
        }
        return null;
    }

    @Override
    public void navigate(boolean requestFocus) {
        if (element instanceof NavigationItem) {
            ((NavigationItem) element).navigate(requestFocus);
        }
    }

    @Override
    public boolean canNavigate() {
        return element instanceof NavigationItem && ((NavigationItem) element).canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return element instanceof NavigationItem && ((NavigationItem) element).canNavigateToSource();
    }
}
