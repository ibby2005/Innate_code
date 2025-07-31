import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int l = 0;
        while(a>0){
            l = a%10;
            System.out.print(l+" ");
            a = a/10;
        }/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
