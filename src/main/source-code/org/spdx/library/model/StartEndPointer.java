
package org.spdx.library.model;

public class StartEndPointer extends Pointer
{
    private SinglePointer startPointer;
    private SinglePointer endPointer;

    StartEndPointer(String Id) {
        super(Id);
    }

    StartEndPointer(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "StartEndPointer";
    }

    /** 
     * Get the 'startPointer' element value.
     * 
     * @return value
     */
    public SinglePointer getStartPointer() {
        return startPointer;
    }

    /** 
     * Set the 'startPointer' element value.
     * 
     * @param startPointer
     */
    public void setStartPointer(SinglePointer startPointer) {
        this.startPointer = startPointer;
    }

    /** 
     * Get the 'endPointer' element value.
     * 
     * @return value
     */
    public SinglePointer getEndPointer() {
        return endPointer;
    }

    /** 
     * Set the 'endPointer' element value.
     * 
     * @param endPointer
     */
    public void setEndPointer(SinglePointer endPointer) {
        this.endPointer = endPointer;
    }
}
