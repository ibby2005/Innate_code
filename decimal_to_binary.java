import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a;
        int bi=0,l,p=1;
        a = sc.nextInt();
        while(a>0){
            l=a%2;
            a=a/2;
            bi = bi+l*p;
            p=p*10;
        }
        System.out.print(bi);/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
