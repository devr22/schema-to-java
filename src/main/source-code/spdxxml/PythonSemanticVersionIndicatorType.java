
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for the boolean indication of a python semantic version. True if python semantic version is provided. False if not or not known.
 */
public class PythonSemanticVersionIndicatorType
{
    private boolean _boolean;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public boolean isBoolean() {
        return _boolean;
    }

    /** 
     * Set the extension value.
     * 
     * @param _boolean
     */
    public void setBoolean(boolean _boolean) {
        this._boolean = _boolean;
    }

    /** 
     * Get the 'SimpleObjectAttributeGroup' attributeGroup value.
     * 
     * @return value
     */
    public SimpleObjectAttributeGroup getSimpleObjectAttributeGroup() {
        return simpleObjectAttributeGroup;
    }

    /** 
     * Set the 'SimpleObjectAttributeGroup' attributeGroup value.
     * 
     * @param simpleObjectAttributeGroup
     */
    public void setSimpleObjectAttributeGroup(
            SimpleObjectAttributeGroup simpleObjectAttributeGroup) {
        this.simpleObjectAttributeGroup = simpleObjectAttributeGroup;
    }
}
