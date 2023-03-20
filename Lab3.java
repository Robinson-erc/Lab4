import java.io.File;
import java.io.*;
import javax.swing.JFileChooser;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
/**
 * Write a description of class Lab3 here.
 *
 * @author (Eric Robinson)
 * @version (V1.0 2/20/23)
 */
public class Lab3
{

    public static void main()
    {
        System.out.println("Project2 John Doe,Student 12345678 \n");
        Lab3();
      
    }

    public static void Lab3()
    {
        System.out.println("\nOutput for Lab3\n");
        int id;
        String name;
        String transactionType;

        Map<Integer, PersonP2> map = new HashMap<>();

        File file;
        JFileChooser fc = new JFileChooser(); 
        fc.showDialog(fc, null);
        file = fc.getSelectedFile();
        System.out.println("The selected file is " + file); 

        Scanner inFile = OpenInFile(file);
        Map<Integer, PersonP2> Bank1 =new HashMap();

        if (inFile != null)
        {
            System.out.println("\nReading the bank transaction file");
            // int id;
            // String name;
            // String tran;
        while(inFile.hasNext()){
            id   = inFile.nextInt();
            name = inFile.next();
            transactionType = inFile.next();
            
            PersonP2 p=new PersonP2(id,name);
            PersonP2 pF=map.get(p.GetId()); // search for this person
            
            if(pF !=null){
                map.get(p.GetId()).AddTransactionToList(transactionType);
            }   
            else
            {
                p.AddTransactionToList(transactionType);
                map.put(id,p);
            }

            System.out.println(id + " " + name + " " + transactionType);
        }

        }

        inFile.close();
        map.forEach((key,value) -> {System.out.println(value); value.PrintTransactionList();} );

    }

    static Scanner OpenInFile(File file) 
    {
        try {
            Scanner inputFile = new Scanner(file);             
            return inputFile;
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();                               
            return null;
        }

    }

}
