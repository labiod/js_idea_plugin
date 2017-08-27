package com.kgb.js.psi;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/28/17.
 */
public interface JSProperty extends JSClassDef {
    JSProperty getParentProperty();

    void setNameSpace(JSProperty propertyObject);

    String getFullName();
}
