import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if(i == 0 || i == N-1) {
                    System.out.print("#");
                } else {
                    if(j == 0 || j == N-1)
                    {
                        System.out.print("#");
                    } else
                    {
                        System.out.print(" ");
                    }
                    
                }
            }
            System.out.println();
        }
    }
}