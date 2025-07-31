import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ser = sc.nextInt();
        int count = 0;
        while(n>0){
            if(n%10==ser){
                count++;
            }
            n=n/10;
        }
        System.out.print(count);/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
