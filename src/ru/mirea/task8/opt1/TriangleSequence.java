package ru.mirea.task8.opt1;
import java.util.Scanner;
public class TriangleSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = n;
        String ans = "";
        for (int i = 1; i <= k; i++) {
            if(n >= i) {
                ans = ans + (String.valueOf(i) + ' ').repeat(i);
            }
            else{
                ans = ans + (String.valueOf(i) + ' ').repeat(n);
                break;
            }
            n = n - i;
        }
        System.out.println(ans);
    }
}
