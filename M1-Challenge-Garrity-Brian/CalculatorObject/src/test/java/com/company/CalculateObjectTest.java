package com.company;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculateObjectTest {

    private static CalculateObject calc = new CalculateObject();


    @Test
    public void shouldReturnSumOfTwoInts (){

        String failMessage = "Expected calculator to handle addition.";

        assertEquals(2, calc.add(1,1) );

    }
    @Test
    public void shouldReturnDifferenceOfTwoInts(){

        String failMessage = " Expected calculator to handle subtract.";

        assertEquals(failMessage,-29, calc.subtract(23,52));

    }

    @Test
    public void  shouldReturnProductOfTwoInts (){

        String failMessage = "Expect calculator to handle multiplication.";

      assertEquals(failMessage,68, calc.multiply(34,2));

    }

    @Test
    public void shouldReturnQuotientOfTwoInts(){

        String failMessage = "Expect calculator to handle division ";

        assertEquals(failMessage,4, calc.divide(12,3));

    }

    @Test

    public void doubleAddition (){

        String failMessage = "Expect calculator to handle double addition";

       assertEquals(failMessage,5.7, calc.add(3.4d , 2.3d), .0001);
    }

   @Test
      public void doubleSubtraction (){

       String failMessage = " Expect calculator to handle double subtraction";

       assertEquals(failMessage,5, calc.subtract(5.5d, 0.5d), .0001);
   }

   @Test
     public void doubleMultiply(){

     String failMessage = " Expect calculator to handle double multiplication";

     assertEquals(failMessage,29.48, calc.multiply(6.7d, 4.4d), .0001);
   }

   @Test
     public void doubleDivision(){

     String failMessage = " Expect calculator4 to handle double division";

     assertEquals(failMessage,1.71428571, calc.divide(12d,7d), .0001);
     assertEquals(failMessage,4.90909091, calc.divide(10.8d, 2.2d), .0001);
   }

}
