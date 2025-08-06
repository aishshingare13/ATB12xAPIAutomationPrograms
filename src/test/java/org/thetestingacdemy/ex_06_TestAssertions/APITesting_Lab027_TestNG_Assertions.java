package org.thetestingacdemy.ex_06_TestAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting_Lab027_TestNG_Assertions {

    @Test(enabled = true)
    public void test_hardAssertExample(){
        System.out.println("Start of the program");
        Assert.assertEquals("aishwarya","Aishwarya");
        System.out.println("End of the program");
    }

    //Software Assertion
    @Test
    public void test_SoftAssertExample(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("aishwarya","Aishwarya");
        System.out.println("End of program");
        softAssert.assertAll();
    }
}
