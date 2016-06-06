import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float zero = 0, pos = 0, neg = 0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] == 0){
                zero++;
            } else if(arr[arr_i] > 0) {
                pos++;
            } else if(arr[arr_i] < 0) {
                neg++;
            }
        }
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zero/n);
    }
}