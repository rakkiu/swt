package com.giaolang.util.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    ///CHUAN BI BO DATA DE RIENG DD DATA DRIVEN
    //LAT HOI FILL VAO HAM SO SANH T TESTING
    // FILL VAO QUA THAM SO HAM LAM VIEC VOI NHIEU DATA
    // DDT DUOC GOI VOI TEN KHAC PARAMETERIZIED TESTING - KIEM THU THEO KEU THAM SO HOA
    //

    //BO DATA: NAM TRONG HAM STATIC - TINH 1 CHO DE NOI NAO LAY
    // BO DATA: THUONG LA MANG 2 CHIEU, GIA TRI DAU VAO VA CAC GIA TRI KI VONG

    public static Object[][] initData(){

        return new Object[][]{{0, 1},
                              {1, 1},
                              {2, 2},
                              {3, 6},
                              {4, 24},
                              {5, 120},
                              {6, 720}};
        //n excepted
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgsRunsWell(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }


}