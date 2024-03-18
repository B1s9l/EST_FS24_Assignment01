package zest;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class Frac2DecTest {

  @Test
  public void assert_one_over_two(){
      Assertions.assertEquals(Frac2Dec.fractionToDecimal(1,2), "0.5");
 }

 @Test
 public void assert_two_over_one(){
   Assertions.assertEquals(Frac2Dec.fractionToDecimal(2,1), "2");
 }

 @Test
 public void assert_four_over_333(){
   Assertions.assertEquals(Frac2Dec.fractionToDecimal(4,333),"0.(012)");
 }

 @Test
 public void assert_zero_denominator(){
     Assertions.assertNull(Frac2Dec.fractionToDecimal(5, 0));
 }

 @Test
 public void assert_first_digits_then_repeat(){
      Assertions.assertEquals( Frac2Dec.fractionToDecimal(1401,700),"2.00(142857)");
 }

 @Test
 public void assert_minus_one_over_two(){
      Assertions.assertEquals(Frac2Dec.fractionToDecimal(-1, 2), "-0.5");
 }

 @Test
    public void assert_one_over_minus_two(){
      Assertions.assertEquals(Frac2Dec.fractionToDecimal(1, -2), "-0.5");
 }

 @Test
    public void assert_minus_one_over_minus_four(){
      Assertions.assertEquals(Frac2Dec.fractionToDecimal(-1,-4), "0.25");
 }

 @Test
 public void assert_nominator_zero(){
      Assertions.assertEquals(Frac2Dec.fractionToDecimal(0,2), "0");
 }


}