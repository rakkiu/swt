package com.giaolang.util.mathutil.core;

public class MathUtility {
    //class nay dung de cung cap cac ham tinh toan
    //bat chuoc class math trong jdk
    //vi nhung tinh qoan nay tinh xong r tra ra
    //ko luu tru lai
    //do do ta thiet ke no dang static

    //ta lam ham tinh N!=1,2,3,4,5...N
    //quy uoc
    //0!=1
    //ko co giai thua so am
    //20! vua du kieu long, 21! khong dung dc
    public static long getFactorial(int n){

        if(n<0||n>20){
            throw new IllegalArgumentException("n must be between 1 and 20");
            //neu dua n ca chon, nem ra ngoai le
        }
        if(n==0){
            return 1;
        }
        //cpu chay dc den day tuc la n=1,2,3,...,19,20
        //tinh n!=1,2,3,4 thuat toan con heo dat, oc buu nhoi thit,nhan don, cong don,


        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;//i=1 nhan 1, i=2 nhan , i= 3 nhan 3, don vao result
        }
        return result;
    }
}
