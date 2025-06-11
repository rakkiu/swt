package com.giaolang.util;

import com.giaolang.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//  verifyFactorialGivenRightArg0RunsWell();
//
        verifyFactorialGivenRightArgsRunsWell();
    }
    //TESTCASE #2 verify the getFactorial() with N=1;
    //test thu ham tinh giai thua, goi trong main()
    //muon test gi do thi pahi co test case!!
    //TESTCASE #1 verify the getFactorial() with N=0;
    //step:
    // given n =0;
    //call getFactorial(n=0)
    //expected result:
    //the mothod must return 1 as the result of 0!=1
    //status: passed/failed
    public static void verifyFactorialGivenRightArg0RunsWell(){
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("0! = expected "+expected+", actual "+actual);

    }
    public static void verifyFactorialGivenRightArg1RunsWell(){
        int n = 1;
        long expected = 1;//hy vong 1 tra ve neu 1!
        long actual = MathUtility.getFactorial(n);
        System.out.println("1! = expected "+expected+", actual "+actual);

    }

    public static void verifyFactorialGivenRightArgsRunsWell(){

        System.out.println("3! = expected 6, actual "+MathUtility.getFactorial(3));
        System.out.println("4! = expected 24, actual "+MathUtility.getFactorial(4));
        System.out.println("5! = expected 120, actual "+MathUtility.getFactorial(5));

    }


}
//ki thuat vua go code vua go test case vua go test run goi la TTD (cv) test driven development