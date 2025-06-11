package com.giaolang.util.mathutil.core;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class MathUtilityTest {

     @Test
     public void verifyFactorialGivenRightArg1RunsWell(){
         assertEquals(1,MathUtility.getFactorial(1));
     }

     @Test
     public void verifyFactorialGivenRightArg2RunsWell(){
         assertEquals(2,MathUtility.getFactorial(2));
     }

     @Test
     public void verifyFactorialGivenRightArg3RunsWell(){
         assertEquals(6,MathUtility.getFactorial(3));
     }
     @Test
     public void verifyFactorialGivenRightArg4RunsWell(){

     }




    //@test tuong ham main(), code trong ham nay nhu ham main()
    //bien test case thanh test run


}