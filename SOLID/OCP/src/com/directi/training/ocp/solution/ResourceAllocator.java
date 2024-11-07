package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(ResourceTypeInterface resourceType)
    {
        int resourceId;
        
        resourceId = resourceType.findFreeSlot;

        resourceType.markSlotBusy(resourceId)

        return resourceId;
    }

    public void free(ResourceTypeInterface resourceType, int resourceId)
    {

           resourceType.markSlotFree(resourceId);
         
     
    }
    
}
