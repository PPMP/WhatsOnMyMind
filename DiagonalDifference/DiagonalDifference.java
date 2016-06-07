import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int firstDiag;
        int secondDiag;
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        firstDiag = a[0][0] + a[1][1] + a[2][2];
        secondDiag = a[0][2] + a[1][1] + a[2][0];  
        System.out.println(java.lang.Math.abs(firstDiag - secondDiag));
    }
}
