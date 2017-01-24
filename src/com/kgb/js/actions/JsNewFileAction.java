package com.kgb.js.actions;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.InputValidator;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import com.kgb.js.JsIcons;
import com.kgb.js.actions.validators.NewFileNameValidator;

import java.io.File;
import java.io.IOException;

/**
 * @author  labiod <labiod@w.pl>
 * @version 0.0.1; created 21.01.2017
 */
public class JsNewFileAction extends AnAction {

    public JsNewFileAction() {
        this("");
    }

    public JsNewFileAction(String text) {
        this(text, "");
    }

    public JsNewFileAction(String text, String description) {
        super(text, description, JsIcons.FILE_ICON);
    }

    @Override
    public void actionPerformed(AnActionEvent event) {
        // TODO: insert action logic here
        Project project = event.getData(PlatformDataKeys.PROJECT);
        Editor editor = event.getData(PlatformDataKeys.EDITOR);
        VirtualFile selectedFile = event.getDataContext().getData(DataKeys.VIRTUAL_FILE);
        if (selectedFile == null || project == null) {
            return;
        }
        if (!selectedFile.isDirectory()) {
            selectedFile = selectedFile.getParent();
        }
        InputValidator validator = new NewFileNameValidator(selectedFile);
        String fileName = Messages.showInputDialog(project, "Name:", "Create new js file",
                Messages.getQuestionIcon(), "", validator);
        fileName = fileName.endsWith(".js") ? fileName : fileName + ".js";
        File file = new File(selectedFile.getCanonicalPath() + "/" + fileName);
        try {
            if (file.createNewFile()) {
                System.out.println(file.getPath());
                project.getBaseDir().refresh(true, true);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
