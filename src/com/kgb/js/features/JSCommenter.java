package com.kgb.js.features;

import com.intellij.lang.Commenter;
import com.kgb.js.psi.JSTypes;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Jan on 21.01.2017.
 */
public class JSCommenter implements Commenter {
    @Nullable
    @Override
    public String getLineCommentPrefix() {
        return "//";
    }

    @Nullable
    @Override
    public String getBlockCommentPrefix() {
        return "/*";
    }

    @Nullable
    @Override
    public String getBlockCommentSuffix() {
        return "*/";
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentPrefix() {
        return null;
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentSuffix() {
        return null;
    }
}
