
/**
 * Example of using JFileChooser to read in the records of a file
 *
 * @author (Prof R)
 * @version (v1.0 2-7-2023)
 */

import java.io.File;
import javax.swing.JFileChooser;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReadEx
{
    public static void main()
    {
       FileReadExample();
    }

    static void FileReadExample()
    {
        File file;
        JFileChooser fc = new JFileChooser(); 
        fc.showDialog(fc, null);
        file = fc.getSelectedFile();
        System.out.println("The selected file is " + file); 

        Scanner inFile = OpenInFile(file);

        if (inFile != null)
        {
            System.out.println("\nReading the bank transaction file");
            int id;
            String name;
            String tran;

            while (inFile.hasNextInt())
            {
                id   = inFile.nextInt();
                name = inFile.next();
                tran = inFile.next();

                System.out.println(id + " " + name + " " + tran);
            }
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
