package ex27;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 27 Solution
 *  Copyright 2021 Jose Malave
 */
public class App 
{


    public static String fName()
    {   Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the first name:" );
        String name = sc.nextLine();

        return name;
    }
    public static String lName()
    {   Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the last name:" );
        String name = sc.nextLine();

        return name;
    }
    public static String ZIP()
    {   Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the ZIP code:" );
        String zip = sc.nextLine();

        return zip;
    }
    public static String ID()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the employee ID:" );
        String id = sc.nextLine();

        return id;
    }
    public static void  validateInput(String fname, String lname, String zip, String id)
    {
        int index = 0;
        if ( fname.length() < 2){
        System.out.println( "The first name must be at least 2 characters long." );
        index = 1;
        }

        if ( lname.length() < 2){
            System.out.println( "The last name must be at least 2 characters long." );
            if(lname.contains(" "))
            {
                System.out.println( "The last name must be at least 2 characters long." );
            }
            index = 1;
        }

        boolean matches = id.matches("\\c\\\\c\\-\\d\\d\\d\\d");

        if(matches != true){
            System.out.println( "The employee ID must be in the format of AA-1234." );
            index = 1;
        }

        boolean matches2 = zip.matches("\\d\\d\\d\\d\\d");

        if(matches2 != true){
            System.out.println( "The zipcode must be a 5 digit number." );
            index = 1;
        }

        if(index == 0)
        {
            System.out.println( "There were no errors found.");
        }


    }

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String fname = fName();
        String lname = lName();
        String zip = ZIP();
        String id = ID();
    }
}
