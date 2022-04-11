package practice;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){


//        boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
//        boolean a2 = (7 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
//        boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false, поэтому возвращается false (4 < 6 - true, но не вычисляется)
//        boolean a4 = (50 > 51) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
//        boolean a5 = (5 < 6) ^ (4 > 6); // 5 < 6 - true, поэтому возвращается true (4 > 6 - false)
//        boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false
//        char ch=102 + 1;
//        char ch= 'a';

        int a = 6;
        int b = 4;
        if(a==b){
            System.out.println("если переменные равны");
        }
        else if(a<b){
            System.out.println("если переменная a меньше b");
        }
        else if(a>b){
            System.out.println("если переменная b меньше a");
        }
        if((a+b) % 2 == 0){
            System.out.println("maybe a and b are even");
        }
        else{
            System.out.println("some variable is odd");
        }

    }
}
