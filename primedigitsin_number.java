import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long reversed = 0;
        long temp = num;
        while (temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }
        while (reversed > 0) {
            long digit = reversed % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                System.out.print(digit + " ");
            }
            reversed /= 10;
        }
    }
}
