package com.kgb.js;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.JSLanguage
 */
public class JSLanguage extends Language {
    public static final JSLanguage INSTANCE = new JSLanguage(JSConstant.LANG_ID);

    private JSLanguage(@NotNull @NonNls String ID) {
        super(ID, "text/javascript", "application/javascript");
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return JSConstant.LANG_ID;
    }

    @Override
    public boolean isCaseSensitive() {
        return true;
    }
}
