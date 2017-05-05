package com.kgb.js.features.structureview;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.kgb.js.psi.JSClassDef;
import com.kgb.js.psi.JSFile;
import com.kgb.js.psi.JSProperty;
import com.kgb.js.psi.JSPropertySet;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 5/5/17.
 */
public class JSStructureFileElement implements StructureViewTreeElement, SortableTreeElement {
    private JSFile element;

    public JSStructureFileElement(JSFile element) {
        this.element = element;
    }
    @Override
    public Object getValue() {
        return element;
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        return element != null ? element.getName() : "";
    }


    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return element != null ? element.getPresentation() : null;
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        List<JSStructureViewElement> treeElements = new ArrayList<>();
        JSClassDef[] definitions = PsiTreeUtil.getChildrenOfType(element, JSClassDef.class);
        if (definitions != null) {
            for (JSClassDef property : definitions) {
                JSStructureViewElement treeElement = getDefinitionFromTree(treeElements, property);
                if (treeElement != null) {
                    treeElements.remove(treeElement);
                    treeElements.add(new JSStructureViewElement(property));
                } else if (property instanceof JSPropertySet) {
                    JSProperty parentProperty = JSStructureViewElement.getRootProperty(((JSPropertySet) property).getPropertyObject());
                    if (parentProperty != null) {
                        Logger.getInstance(getClass()).info(parentProperty.getText());
                        JSStructureViewElement parentElement = getDefinitionFromTree(treeElements, parentProperty);
                        if (parentElement != null) {
                            JSStructureViewElement.merge(parentElement, (JSPropertySet) property);
                        } else {
                            treeElements.add(new JSStructureViewElement(property));
                        }
                    } else {
                        treeElements.add(new JSStructureViewElement(property));
                    }
                } else {
                    treeElements.add(new JSStructureViewElement(property));
                }
            }
        }
        return treeElements.toArray(new TreeElement[treeElements.size()]);
    }

    private JSStructureViewElement getDefinitionFromTree(List<JSStructureViewElement> treeElements, JSClassDef def) {
        for (JSStructureViewElement element : treeElements) {
            if (element.getValue() != null && element.getValue().getName().equals(def.getName())) {
                return element;
            }
        }
        return null;
    }

    @Override
    public void navigate(boolean requestFocus) {
        if (element != null) {
            element.navigate(requestFocus);
        }
    }

    @Override
    public boolean canNavigate() {
        return element != null && element.canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return element != null && element.canNavigateToSource();
    }
}
