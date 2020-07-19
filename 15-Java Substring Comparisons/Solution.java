import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int n = s.length();
        String substrArr []= new String[n-k+1];

        // Fill substring array
        for(int i=0; i<substrArr.length; i++){
            substrArr[i] = s.substring(i,i+k); 
        }
        
        // Initiate variables
        smallest = substrArr[0];
        largest = substrArr[0];

        // Make comparison (String1.compareTo(String2) is negative when String1 is s             // smaller than String2)

        for(int i=0; i<substrArr.length; i++){
            if(substrArr[i].compareTo(smallest) <= 0 ){
                smallest = substrArr[i];
            }
            if(substrArr[i].compareTo(largest) >= 0 ){
                largest = substrArr[i];
            }             
        }

        return smallest + "\n" + largest;

    }

