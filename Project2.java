
/**
 * labAndProjectTemplate for mutiple problems 
 *Project 2 Driver
 * @author (Eric Robinson)
 * @version (v1 2/7/23)
 */
import java.io.File;
import java.io.*;
import javax.swing.JFileChooser;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Project2
{
    public static void main()
    {
        System.out.println("Project2 John Doe,Student 12345678 \n");

        P1();
        P2();
        //P3();
        //P4();
        //P5();
    }

    /**
     * P1 code
     *
     * @param  None
     * @return void
     */
    static void P1()
    {

        System.out.println("\nOutput for P1\n");

        File file;
        JFileChooser fc = new JFileChooser(); 
        fc.showDialog(fc, null);
        file = fc.getSelectedFile();
        System.out.println("The selected file is " + file); 

        Scanner inFile = OpenInFile(file);
        List<Integer> sequence1 =new ArrayList();

        if (inFile != null)
        {
            System.out.println("\nReading integer file");

            while (inFile.hasNextInt())
            {
                sequence1.add(inFile.nextInt());
            }
        }
        Set<Integer> set = new HashSet<>(sequence1);

        List<Integer> L2 = new ArrayList<>(set);
        Collections.sort(L2);

        System.out.println(L2);
    }

    /**
     * P2 code
     *
     * @param  None
     * @return void
     */
    static void P2()
    {
        System.out.println("\nOutput for P2\n");

        File file;
        JFileChooser fc = new JFileChooser(); 
        fc.showDialog(fc, null);
        file = fc.getSelectedFile();
        System.out.println("The selected file is " + file); 

        Scanner inFile = OpenInFile(file);
        List<Integer> sequence1 =new ArrayList();

        if (inFile != null)
        {
            System.out.println("Reading integer file");

            while (inFile.hasNextInt())
            {
                sequence1.add(inFile.nextInt());
            }
        }
        inFile.close();

        Set<Integer> set = new HashSet<>(sequence1);

        List<Integer> L2 = new ArrayList<>(set);
        Collections.sort(L2);

        System.out.println(L2);

        fc.showDialog(fc, null);
        file = fc.getSelectedFile();
        System.out.println("The selected file is " + file); 

        inFile = OpenInFile(file);
        List<Integer> sequence2 =new ArrayList();

        if (inFile != null)
        {
            System.out.println("Reading integer file 2");

            while (inFile.hasNextInt())
            {
                sequence2.add(inFile.nextInt());
            }
        }
        inFile.close();

        Set<Integer> set2 = new HashSet<>(sequence2);

        List<Integer> L3 = new ArrayList<>(set2);
        Collections.sort(L3);

        System.out.println(L3+"\n");
        //getting union below
        set.addAll(set2);

        List<Integer> L4 = new ArrayList<>(set);
        Collections.sort(L4);

        System.out.println("Union = "+ L4);
        //intersecting below
        L2.retainAll(L3);
        List<Integer> L5 = new ArrayList<>(L2);
        Collections.sort(L5);
        System.out.println("Intersection = "+ L5);

        // List<Integer> U =new ArrayList(L2);
        // U.addAll(L3);
        // Collections.sort(U);
        // //Set<Integer> set3 = new HashSet<>(L4);

        // System.out.println("Set as a Union:\n"+U);

    }

    static void P3(){
        System.out.println("\nOutput for P3\n");
        
        int id;
        String name;
        String transactionType;
        
        Set<PersonP2> peopleSet =new HashSet<>();
        File file;
        JFileChooser fc = new JFileChooser(); 
        fc.showDialog(fc, null);
        file = fc.getSelectedFile();
        System.out.println("The selected file is " + file); 

        Scanner inFile = OpenInFile(file);
        // List<Integer> Peop =new ArrayList();

        if (inFile != null)
        {
            System.out.println("\nReading the bank transaction file");
            // int id;
            // String name;
            // String tran;

            while (inFile.hasNextInt())
            {
                id   = inFile.nextInt();
                name = inFile.next();
                transactionType = inFile.next();
                PersonP2 p=new PersonP2(id , name);

                if(peopleSet.contains(p))
                {
                    for (PersonP2  pF: peopleSet) {
                        if(pF.equals(p)){
                            pF.AddTransactionToList(transactionType);
                        }
                    }
                }
                else
                {
                    p.AddTransactionToList(transactionType); 
                    peopleSet.add(p); 
                }
                System.out.println(id + " " + name + " " + transactionType);
            }

        }
        inFile.close();

        System.out.println("Display Of Customer Transaction Log");
        for(PersonP2 p: peopleSet){
            p.PrintTransactionList();
        }
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
