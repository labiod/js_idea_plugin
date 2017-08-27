package com.kgb.js.psi;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 5/4/17.
 */
public interface JSPropertySet extends JSClassDef {
    JSProperty getPropertyObject();

    JSValue getValue();

    boolean isFunctionRef();
}
