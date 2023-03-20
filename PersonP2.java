import java.util.List;
import java.util.ArrayList;

/**
 * Very simple basic Person class
 *
 * @author (Prof R)
 * @version (v2.0, 01/24/2023)
 */
public class PersonP2 implements Comparable<PersonP2>
{
    // attributes/data memebers
    private int     id;
    private String  name;
    private List<String> transactionList;

    /**
     * Constructor for objects of class Person
     */
    public PersonP2(int id, String name)
    {
        this.id   = id;
        this.name = name;
        this.transactionList=new ArrayList<>();
    }

    /**
     * Accessor for id
     * 
     * @param  none
     * @return the id
     */
    public int GetId()
    {
        return this.id;
    }

    /**
     * Accessor for name
     * 
     * @param  none
     * @return the name
     */
    public String GetName()
    {
        return this.name;
    }

    public void AddTransactionToList(String transactionType){
        transactionList.add(transactionType);
    }
    public int GetTransactionSize(){
        return transactionList.size();
    }

    public void PrintTransactionList(){
        //System.out.println(toString());
        System.out.println("There were "+transactionList.size()+" transactions");
        for (int i = 0; i < transactionList.size(); i++) {
            System.out.println(transactionList.get(i));
        }
    }

    /**
     * Mutator for id
     * 
     * @param  none
     * @return the id
     */
    public void SetId(int id)
    {
        this.id = id;
    }

    /**
     * Mutator for name
     * 
     * @param  none
     * @return the name
     */
    public void SetName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return ("id = " + this.id + " name = " + this.name);
    }

    @Override
    public boolean equals(Object otherObject) 
    {
        if (this == otherObject)    // 1)
        {
            return true;
        }
        if (otherObject == null)    // 2)
        {
            return false;
        }
        if (this.getClass() != otherObject.getClass())  // 3)
        {
            return false;
        }
        PersonP2 other = (PersonP2)otherObject;
        return this.id == other.id;  // 4)
    } 

    public int compareTo(PersonP2 p2){
        return id - ((PersonP2)p2).id;
    }
    @Override
    public int hashCode(){
        return this.id;
    }
}
