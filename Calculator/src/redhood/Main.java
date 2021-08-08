package redhood;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        int choice,i=0;
        int data[]=new int[10];
        int output=0;
        try {
            File Obj = new File("file.txt");
            Scanner myReader = new Scanner(Obj);
            while (myReader.hasNextInt()) {
                 data[i] = myReader.nextInt();
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("Welcome to calculator program");
        System.out.print("select what commant want to do\n(1-addition)\n(2-subraction)\n(3-multiplication)\n:");
        choice=new Scanner (System.in).nextInt();
        switch(choice)
        {
            case 1:
                output=data[0]+data[1];
                break;
            case 2:
                output=data[0]-data[1];
                break;
            case 3:
                output=data[0]*data[1];
                break;
        }
        System.out.println("Output:"+output);
    }
}
