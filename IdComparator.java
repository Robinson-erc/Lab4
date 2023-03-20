
/**
 * Write a description of class IdComparator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IdComparator
{
    
    

    /**
     * Constructor for objects of class NameComparator
     */
    public IdComparator()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public int compare(Object o1,Object o2){  
        int x= ((PersonP2)o1).GetId();
        int y= ((PersonP2)o2).GetId();
        
        if(x<y)  
            return -1;  
        else if(x>y)  
            return 1;  
        else  
            return 0;  
    }  
}
