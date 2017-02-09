package com.kgb.js.psi;

/**
 * @author labiod : <labiod@wp.pl>;
 * @version 0.0.1; created:03.02.2017
 *          Class com.kgb.js.psi.JSMethod
 */
public interface JSMethod extends JSObject {
    default int getArgsLength() {
        return 0;
    }
}
