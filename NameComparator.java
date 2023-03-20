import java.util.Comparator;

/**
 * Write a description of class NameComparator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NameComparator implements Comparator 
{
    

    /**
     * Constructor for objects of class NameComparator
     */
    public NameComparator()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public int compare(Object o1,Object o2){  
        String x= ((PersonP2)o1).GetName();
        String y= ((PersonP2)o2).GetName();
        
        if(x.compareTo(y)<0)  
            return -1;  
        else if(x.compareTo(y)>0)  
            return 1;  
        else  
            return 0;  
    }  
}
