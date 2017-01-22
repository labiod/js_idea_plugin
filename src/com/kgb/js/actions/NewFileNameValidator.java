package com.kgb.js.actions;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.InputValidator;
import com.intellij.openapi.vfs.VirtualFile;

/**
 * Created by Jan on 21.01.2017.
 */
public class NewFileNameValidator implements InputValidator {

    private VirtualFile mSelectedFile;

    public NewFileNameValidator(VirtualFile selectedFile) {
        mSelectedFile = selectedFile;
    }

    @Override
    public boolean checkInput(String s) {
        String fileName = s.endsWith(".js") ? s : s + ".js";
        VirtualFile file = mSelectedFile.findChild(fileName);
        return !s.equals("") && file == null;
    }

    @Override
    public boolean canClose(String s) {
        return true;
    }
}
