package com.directi.training.ocp.exercise;


public abstract class Resourcetype {

  /* private int findFreeSpaceSlot() {return 0; }
    private int findFreeTimeSlot() { return 0;}*/
    abstract int findfreeSlot();

    /* private void markSpaceSlotFree(int resourceId){}
    private void markTimeSlotFree(int resourceId){}*/
    abstract void markslotfree(int resourceID);
    
   /*private void markSpaceSlotBusy(int resourceId){}
    private void markTimeSlotBusy(int resourceId){}*/
    abstract void markslotsbusy(int resourceID);

}


public class ResourceAllocator
{

    public int allocate(Resourcetype resourcetype)
    {
        int resourceId;

        resourceId = findfreeslot();
        Resourcetype.markTimeSlotBusy(resourceId);
        return resourceId;
    }

    public void free(Resourcetype resourceType, int resourceId)
    {
            Resourcetype.markSlotFree(resourceId);       
     }
    }
  
}
