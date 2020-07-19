import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        // Initiate variables
        String output = "";
        int middle;
        int l = A.length();
        
        // Find number of characthers to compare
        if(l % 2 > 0) {middle = (l-1)/2;}
        else          {middle = (l/2)-1;} 

        // Check if the word is a palindrome
        for(int i=0; i<=middle; i++){
            if(A.charAt(i) == A.charAt(l-1-i)){
                output  = "Yes";
            }
            else{
                output = "No";
                break;
            }
        }

        System.out.println(output);
    }
}



