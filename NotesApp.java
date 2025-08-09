import java.util.*;
import java.io.*;

public class NotesApp
{
    private static final String FILE_NAME ="Notes.txt";
    private static void addNotes(Scanner sc)
    {
        System.out.println("Enter your note:");
        String note = sc.nextLine();

        try(FileWriter fw = new FileWriter(FILE_NAME, true))
        {
            fw.write(note+System.lineSeparator());
            System.out.println("Notes saved succesfully");
        }
        catch(IOException e)
        {
            System.out.println("Error writing to file:" + e.getMessage());
        }
    }

    private static void viewNotes()
    {
        System.out.println("--- Your Notes ---");
        System.out.println("------------------");
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME)))
        {
            String line;

            boolean hasNotes = false;
            while((line = br.readLine())!= null)
            {
                System.out.println("-" + line);
                hasNotes = true;
            }
            if(!hasNotes)
            {
                System.out.println("No notes found");
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("(No notes file found yet)");
        }
        catch(IOException e)
        {
            System.out.println("Error in reading file:" + e.getMessage());
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do
        {
           System.out.println("==== Notes App ====");
           System.out.println("1. Add Note");
           System.out.println("2. View Note");
           System.out.println("3. Exit");

           System.out.println("Enter your choice:");

           choice = sc.nextInt();
           sc.nextLine();

           switch(choice)
           {
            case 1:
                addNotes(sc);
                break;
            case 2:
                viewNotes();
                break;
            case 3:
                System.out.println("Exiting.. Goodbye");
                break;
            default :
                System.out.println("Invalid choice. Try again");
           }
        }
        while(choice!=3);
        sc.close();
    }
}