import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        for(int c=1;c<=k%n;c++){
            int copy = a[n-1];
            for(int i=n-1;i>=1;i--){
                a[i]=a[i-1];
            }
            a[0]=copy;
        }
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
