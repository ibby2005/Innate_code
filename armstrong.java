import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int copy = a;
        int l = 0;
        int sum = 0;
        int count = 0;
        while(a>0){
            count ++;
            a/=10;
        }
        int b =copy;
        while(b>0){
            l = b%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power*=l;
            }
            sum+=power;
            b=b/10;
        }
        if(copy==sum){
            System.out.print("Armstrong number");
        }
        else{
            System.out.print("Not an Armstrong number");
        }
    }
}
