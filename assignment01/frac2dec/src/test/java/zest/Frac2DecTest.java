package zest;


import org.junit.jupiter.api.Test;

class Frac2DecTest {

  @Test
  public void assert_one_over_two(){
      assert Frac2Dec.fractionToDecimal(1,2).equals("0.5");
 }

 @Test
 public void assert_two_over_one(){
   assert Frac2Dec.fractionToDecimal(2,1).equals("2");
 }

 @Test
 public void assert_four_over_333(){
   assert Frac2Dec.fractionToDecimal(4,333).equals("0.(012)");
 }

 @Test
 public void assert_zero_denominator(){
      assert Frac2Dec.fractionToDecimal(5, 0) == null;
 }

 @Test
 public void assert_first_digits_then_repeat(){
      System.out.println(Frac2Dec.fractionToDecimal(1401,700));
      assert  Frac2Dec.fractionToDecimal(1401,700).equals("2.00(142857)");
 }



}