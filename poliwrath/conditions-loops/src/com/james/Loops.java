package com.james;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        //Q: print numbers from 1 to 5

        for ( int i = 1; i <= 5; i++ ){
            //System.out.println(i);
        }

        //while loops
        int num = 1;
        while ( num <= 5 ){
            System.out.println( num );
            num += 1;
        }
    }
}
