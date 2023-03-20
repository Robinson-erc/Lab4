
/**
 * Write a description of class TransactionComparator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TransactionComparator
{
      /**
     * Constructor for objects of class NameComparator
     */
    public TransactionComparator()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public int compare(Object o1,Object o2){  
        int x= ((PersonP2)o1).GetTransactionSize();
        int y= ((PersonP2)o2).GetTransactionSize();
        
        if(x<y)  
            return -1;  
        else if(x>y)  
            return 1;  
        else  
            return 0;  
    }  
}
