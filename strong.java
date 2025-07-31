import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a,l,sum=0;
        a=sc.nextInt();
        int copy = a;
        while(a>0){
            l=a%10;
            a=a/10;
            int fact = 1;
            for(int i=1;i<=l;i++){
                fact*=i;
            }
            sum+=fact;
        }
        if(copy==sum){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a strong number");
        }/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
