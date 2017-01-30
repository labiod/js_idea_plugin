package com.kgb.js.settings;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.kgb.js.JSConstant;
import com.kgb.js.highlighters.JSSyntaxHighlighter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 1/30/17.
 */
public class JSColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", JSSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", JSSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", JSSyntaxHighlighter.VALUE),
            new AttributesDescriptor("String", JSSyntaxHighlighter.STRING),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return AllIcons.FileTypes.JavaScript;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new JSSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "//Javascript example" +
                "var stringProp = 'String test!';\n" +
                "var numberProp = 4;\n" +
                "function functionTest(arg1, arg2) {\n" +
                "   alert('Test message');\n" +
                "}\n" +
                "//json format test\n" +
                "{\n" +
                "   tab : null,\n" +
                "   key : 5,\n" +
                "   testArray : [6, 4, 'test']\n" +
                "tab : \\u0009";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return JSConstant.LANG_ID;
    }
}
