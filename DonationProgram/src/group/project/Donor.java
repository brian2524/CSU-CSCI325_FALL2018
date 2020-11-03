/*
 * Student Name: Brian Hinkle
 * Program Name: Donation Program
 * Creation Date: 11/26/2018
 * Last Modified Date: 11/2/2020
 * CSCI Course: CSCI 325
 * Grade Received: A
 * Design Comments:
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 * @author Jedidiah Bird
 */
package group.project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Donor {
    private String firstName;
    private String lastName;
    private String spouseName;
    private String fullName;
    private String donorNotes;
    
    public Donor (String f, String s, String l, String n)
    {
        firstName = f;
        lastName = l;
        spouseName = s;
        donorNotes = n;
//        System.arraycopy(n, 0, donorNotes, 0, n.length);
        
    }
    
    public Donor (String f, String l, String n)
    {
        firstName = f;
        lastName = l;
        donorNotes = n;
//        spouseName = "\b";
//        System.arraycopy(n, 0, donorNotes, 0, n.length);
    }

    public String getName()
    {
        File donations = new File("Names.txt");
        PrintWriter printWriter = null;
        
        StringBuilder tempString = new StringBuilder();
        tempString.append(lastName).append(", ").append(firstName);
        if (!spouseName.isEmpty())
        {
            tempString.append(" & ").append(spouseName);
        }
        fullName = tempString.toString().toUpperCase();
        
        try
        {
            FileWriter fileWriter = new FileWriter(donations, true);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println(fullName);
        }
        catch (IOException error)
        {
            System.out.println("Error: " + error.getMessage());
        }
        finally
        {
            if (printWriter != null)
            {
                printWriter.close();
            }
        }
        
        return fullName;
    }
    
    public String getNotes()
    {
        return donorNotes;
    }

    public void setName(String f, String s, String l)
    {
        this.firstName = f;
        this.spouseName = s;
        this.lastName = l;
    }
    
}
