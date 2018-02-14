public class Location
{
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    private int status;
    private boolean hasShip;
    
    
    public Location()
    {
        status = 0;
    }
    
    public boolean checkHit()
    {
        if(status != 1)
        {
            return false;
        }
        return true;
    }
    
    public boolean checkMiss()
    {
        if(status !=2)
        {
            return false;
        }
        return true;
    }

    public boolean isUnguessed()
    {
        if(status !=0)
        {
            return false;
        }
        return true;
    }
    
    public void markHit()
    {
        status = 1;
    }
    
    public void markMiss()
    {
        status =2;
    }
    
    public boolean hasShip()
    {
        if(hasShip != true)
        {
            return false;
        }
        return true;
    }
    
    public boolean hasNoShip()
    {
        return !hasShip;
    }
    
    public void setShip(boolean val)
    {
        hasShip = val;
    }
    
    public void setStatus(int status)
    {
        this.status = status;
    }
    
    public int getStatus()
    {
        return this.status;
    }
}



