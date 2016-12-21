package com.kgb.js.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.kgb.js.JSConstant;
import com.kgb.js.JSLanguage;
import com.kgb.js.JSFileType;
import com.kgb.js.JsIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.psi.JSFile
 */
public class JSFile extends PsiFileBase {
    public JSFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, JSLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return JSFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return JSConstant.JS_LANG_NAME;
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return JsIcons.FILE_ICON;
    }
}
