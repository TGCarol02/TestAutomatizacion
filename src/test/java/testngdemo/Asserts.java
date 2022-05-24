package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.asserts.SoftAssert.*;

public class Asserts {

    @Test
    public void hardAssertsExample(){

        String expectedResult="hard assert";
        String actualResult="fail";
      /*  String actualResult="hard assert";*/

        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("This should not be executed");
    }

    @Test
    public void softAssertExample(){

        SoftAssert softAssert= new SoftAssert();

        SoftAssert.assertEquals(1,2,"Los numeros no son iguales");
        SoftAssert.assertEquals(1,3,"Los numeros no son iguales 2");
        SoftAssert.assertEquals(1,4,"Los numeros no son iguales 3");
        SoftAssert.assertEquals(1,5,"Los numeros no son iguales 4");
        SoftAssert.assertEquals(5,5,"Los numeros son iguales");


        System.out.println("This should be executed");
        SoftAssert.assertAll();
      /*  System.out.println("This should be executed");*/
    }
}
