package org.thetestingacdemy.ex_05_TestNGExamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class APITesting_Lab025_All_Annotations {
    //most of the time @BeforeMethod Or @BeforeTest annotations are used
    @BeforeMethod
    void demo1(){
        System.out.println("BeforeMethod");
    }

    @Test
    void demo2(){
        System.out.println("Test");
    }

    //most of the time @AfterMethod Or @AfterTest annotations are used
    @AfterMethod
    void demo3(){
        System.out.println("AfterMethod");
    }
}
