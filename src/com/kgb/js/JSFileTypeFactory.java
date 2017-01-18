package com.kgb.js;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.JSFileTypeFactory
 */
public class JSFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(JSFileType.INSTANCE, JSConstant.LANG_DEFAULT_EXTENSION);
    }
}
