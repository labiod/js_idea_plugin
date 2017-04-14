package com.kgb.js.features.structureview;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.kgb.js.psi.JSFile;
import com.kgb.js.psi.JSPropertyDef;
import org.jetbrains.annotations.NotNull;

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
        return element instanceof NavigationItem ? ((NavigationItem) element).getPresentation() : null;
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        if (element instanceof JSFile || element instanceof JSPropertyDef) {
            JSPropertyDef[] definitions = PsiTreeUtil.getChildrenOfType(element, JSPropertyDef.class);
            if (definitions != null) {
                List<TreeElement> treeElements = new ArrayList<>(definitions.length);
                for (JSPropertyDef property : definitions) {
                    treeElements.add(new JSStructureViewElement(property));
                }
                return treeElements.toArray(new TreeElement[treeElements.size()]);
            }
        }
        return EMPTY_ARRAY;
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
