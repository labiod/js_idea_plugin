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
    private JSClassDef element;
    private List<JSStructureViewElement> mAdditionallChildren = new ArrayList<>();
    private List<JSStructureViewElement> mAllChildren = new ArrayList<>();

    public JSStructureViewElement(JSPropertySet parent, JSPropertySet element) {
        element.getPropertyObject().setNameSpace(parent.getPropertyObject());
        this.element = element;
        recreateChildren();
    }

    public JSStructureViewElement(JSClassDef element) {
        this.element = element;
        recreateChildren();
    }

    @Override
    public JSClassDef getValue() {
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
    public JSStructureViewElement[] getChildren() {
//        recreateChildren();
        if (!mAllChildren.containsAll(mAdditionallChildren)) {
            mAllChildren.removeAll(mAdditionallChildren);
            mAllChildren.addAll(mAdditionallChildren);
        }
        return mAllChildren.toArray(new JSStructureViewElement[mAllChildren.size()]);
    }

    private void recreateChildren() {
        mAllChildren = new ArrayList<>();
        if (element instanceof JSFunctionDef) {
            JSClassDef[] definitions = PsiTreeUtil.getChildrenOfType(element, JSClassDef.class);
            if (definitions != null) {
                for (JSClassDef property : definitions) {
                    JSStructureViewElement treeElement = getDefinitionFromTree(mAllChildren, property);
                    if (treeElement != null) {
<<<<<<< HEAD
                        treeElements.remove(treeElement);
                    } else if (def instanceof JSDefProperty) {
                        JSProperty parentProperty = ((JSDefProperty) def).getPropertyObject().getParentProperty();
                        if (parentProperty != null) {
                            Logger.getInstance(getClass()).info(parentProperty.getText());
                        }
                    } else if (def instanceof JSAssignProperty) {
                        JSProperty parentProperty = ((JSAssignProperty) def).getPropertyObject().getParentProperty();
                        if (parentProperty != null) {
                            Logger.getInstance(getClass()).info(parentProperty.getText());
                        }
=======
                        mAllChildren.remove(treeElement);
                        mAllChildren.add(new JSStructureViewElement(property));
                    } else if (property instanceof JSPropertySet) {
                        JSProperty parentProperty = getRootProperty(((JSPropertySet) property).getPropertyObject());
                        if (parentProperty != null) {
                            Logger.getInstance(getClass()).info(parentProperty.getText());
                            JSStructureViewElement parentElement = getDefinitionFromTree(mAllChildren, parentProperty);
                            if (parentElement != null) {
                                JSStructureViewElement.merge(parentElement, (JSPropertySet) property);
                            } else {
                                mAllChildren.add(new JSStructureViewElement(property));
                            }
                        } else {
                            mAllChildren.add(new JSStructureViewElement(property));
                        }
                    } else {
                        mAllChildren.add(new JSStructureViewElement(property));
>>>>>>> 00adf721c3d43657c0aaaad5082861efb54d11c4
                    }
                }
            }
        } else if ((element instanceof JSPropertySet && ((JSPropertySet)element).isFunctionRef())) {
            PsiElement parent = ((JSPropertySet)element).getValue().getFunctionDef();
            JSClassDef[] definitions = PsiTreeUtil.getChildrenOfType(parent, JSClassDef.class);
            if (definitions != null) {
                for (JSClassDef property : definitions) {
                    JSStructureViewElement treeElement = getDefinitionFromTree(mAllChildren, property);
                    if (treeElement != null) {
<<<<<<< HEAD
                        treeElements.remove(treeElement);

                    } else if (property instanceof JSDefProperty) {
                        JSProperty parentProperty = ((JSDefProperty) property).getPropertyObject().getParentProperty();
                        if (parentProperty != null) {
                            Logger.getInstance(getClass()).info(parentProperty.getText());
                        }
                    } else if (property instanceof JSAssignProperty) {
                        JSProperty parentProperty = ((JSAssignProperty) property).getPropertyObject().getParentProperty();
                        if (parentProperty != null) {
                            Logger.getInstance(getClass()).info(parentProperty.getText());
                        }
=======
                        mAllChildren.remove(treeElement);
                        mAllChildren.add(new JSStructureViewElement(property));
                    } else if (property instanceof JSPropertySet) {
                        JSProperty parentProperty = getRootProperty(((JSPropertySet) property).getPropertyObject());
                        if (parentProperty != null) {
                            Logger.getInstance(getClass()).info(parentProperty.getText());
                            JSStructureViewElement parentElement = getDefinitionFromTree(mAllChildren, parentProperty);
                            if (parentElement != null) {
                                JSStructureViewElement.merge(parentElement, (JSPropertySet) property);
                            } else {
                                mAllChildren.add(new JSStructureViewElement((JSPropertySet)element, (JSPropertySet) property));
                            }
                        } else {
                            mAllChildren.add(new JSStructureViewElement((JSPropertySet)element, (JSPropertySet) property));
                        }
                    } else {
                        mAllChildren.add(new JSStructureViewElement((JSPropertySet)element, (JSPropertySet) property));
>>>>>>> 00adf721c3d43657c0aaaad5082861efb54d11c4
                    }
                }
            }
        }
        this.mAllChildren.addAll(mAdditionallChildren);
    }

    static JSProperty getRootProperty(JSProperty propertyObject) {
        JSProperty result = propertyObject;
        while (result.getParentProperty() != null) {
            result = result.getParentProperty();
        }
        return result instanceof JSPropertySpace ? ((JSPropertySpace) result).getProperty() : result;
    }

    static void merge(JSStructureViewElement parentElement, JSPropertySet property) {
        boolean added = false;
        for (JSStructureViewElement child : parentElement.getChildren()) {
            if (tryToAddToElement(child, property)) {
                added = true;
                break;
            }
        }
        if (!added) {
            parentElement.mAdditionallChildren.add(new JSStructureViewElement(property));
        }
    }

    private static boolean tryToAddToElement(JSStructureViewElement child, JSPropertySet property) {
        if (child.element instanceof JSPropertySet) {
            JSProperty object = ((JSPropertySet) child.element).getPropertyObject();
            String namespaceText = property.getPropertyObject().getNamespace().getText();
            namespaceText = namespaceText.substring(0, namespaceText.length() - 1);
            if (namespaceText.startsWith(object.getFullName())) {
                merge(child, property);
                return true;
            }
        }
        return false;
    }

    private JSStructureViewElement getDefinitionFromTree(List<JSStructureViewElement> treeElements, JSClassDef def) {
        for (JSStructureViewElement element : treeElements) {
            if (element.element != null && element.element.getName().equals(def.getName())) {
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
        return (element != null) && element.canNavigateToSource();
    }
}
