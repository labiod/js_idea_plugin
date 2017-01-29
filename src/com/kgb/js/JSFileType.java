package com.kgb.js;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.JSFileType
 */
public class JSFileType extends LanguageFileType {
    public static final JSFileType INSTANCE = new JSFileType();

    private JSFileType() {
        super(JSLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return JSConstant.JS_LANG_NAME;
    }

    @NotNull
    @Override
    public String getDescription() {
        return JSConstant.LISP_LANG_DESCRIPTION;
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return JSConstant.LANG_DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AllIcons.FileTypes.JavaScript;
    }
}
