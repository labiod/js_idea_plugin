package com.kgb.js.components;

import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

/**
 * @author labiod : <labiod@wp.pl>;
 * @version 0.0.1; created:02.02.2017
 *          Class com.kgb.js.components.JSComponent
 */
public class JSComponent implements ApplicationComponent {
    public JSComponent() {
    }

    @Override
    public void initComponent() {
        // TODO: insert component initialization logic here
        System.out.println("init component");

    }

    @Override
    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @Override
    @NotNull
    public String getComponentName() {
        return "JSComponent";
    }
}
