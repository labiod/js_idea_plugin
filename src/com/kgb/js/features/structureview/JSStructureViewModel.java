package com.kgb.js.features.structureview;

import com.intellij.ide.structureView.*;
import com.intellij.ide.util.treeView.smartTree.Filter;
import com.intellij.ide.util.treeView.smartTree.Grouper;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.json.structureView.JsonStructureViewElement;
import com.intellij.psi.PsiFile;
import com.kgb.js.psi.JSFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/14/17.
 */
public class JSStructureViewModel extends StructureViewModelBase implements StructureViewModel.ElementInfoProvider {
    public JSStructureViewModel(PsiFile psiFile) {
        super(psiFile, new JSStructureViewElement(psiFile));
    }

    @NotNull
    @Override
    public Sorter[] getSorters() {
        return new Sorter[] {Sorter.ALPHA_SORTER};
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement structureViewTreeElement) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return element instanceof JSFile;
    }
}
