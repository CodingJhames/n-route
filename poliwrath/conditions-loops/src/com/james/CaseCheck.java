package com.james;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        //char ch = in.next().trim().charAt(0);
        System.out.println( in.next().trim() );
        //System.out.println(ch);

        int a = 10;
        int b = 20;

        if ( a == 10 && b == 20 ){
            System.out.println( "Hello world" );
        }

        if ( a == 10 || b == 20 ){
            System.out.println( "Hello world" );
        }

        if ( a >= 'a' && b <= 'z' ){
            System.out.println( "Lowercase" );
        } else {
            System.out.println( "Uppercase");
        }
    }
}
