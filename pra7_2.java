// Write a program that counts the occurrences of words in a text and displays the words
// and their occurrences in alphabetical order of the words. Using Map and Set Classes.
// import java.io.*;

public class pra7_2 
{

    static int countOccurrences(String str, String word) 
    {
       
        String a[] = str.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++) 
        {
            if (word.equals(a[i]))
            count++;
        }
    return count;
    }
    public static void main(String args[]) 
    {
        String str = "GeeksforGeeks A computer science portal for geeks ";
        String word = "portal";
        System.out.println(countOccurrences(str, word));
    }
}

