import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long l,rev = 0;
        while(a>0){
            l=a%10;
            a=a/10;
            rev = rev*10 + l;
        }
        System.out.print(rev);/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
