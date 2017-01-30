package com.kgb.js.annotators;

import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 1/30/17.
 */
public class CreatePropertyQuickFix implements IntentionAction {
    public CreatePropertyQuickFix(String key) {
    }

    @Nls
    @NotNull
    @Override
    public String getText() {
        return null;
    }

    @Nls
    @NotNull
    @Override
    public String getFamilyName() {
        return null;
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile psiFile) {
        return false;
    }

    @Override
    public void invoke(@NotNull Project project, Editor editor, PsiFile psiFile) throws IncorrectOperationException {

    }

    @Override
    public boolean startInWriteAction() {
        return false;
    }
}
