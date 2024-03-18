package zest;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MyAtoiTest {


    @Test
    public void convert_string_to_int (){
        Assertions.assertEquals(MyAtoi.myAtoi("42"), 42);
        //asser MyAtoi.myAtoi("42") , 42;
    }

    @Test
    public void remove_whitespace_keep_negative(){
        Assertions.assertEquals(MyAtoi.myAtoi(" -42"), -42);
    }

    @Test
    public void cut_off_trailing_alphabet() {
        Assertions.assertEquals(MyAtoi.myAtoi("4193 with words") , 4193);
    }

    @Test
    public void assert_abc_equals_zero(){
        Assertions.assertEquals(MyAtoi.myAtoi("abc") , 0);
    }

    @Test
    public void input_null(){
        Assertions.assertEquals(MyAtoi.myAtoi(null) , 0);
    }

    @Test
    public void assert_0032_equals_32(){
        Assertions.assertEquals(MyAtoi.myAtoi("0032") , 32);
    }

    @Test
    public void assert_input_out_of_range(){
        Assertions.assertEquals(MyAtoi.myAtoi("4294967296") , 2147483647);
    }

    @Test
    public void assert_rest_of_string_ignored(){
        Assertions.assertEquals(MyAtoi.myAtoi("12abc3") , 12);
    }

    @Test
    public void assert_if_str_length_0(){
        Assertions.assertEquals(MyAtoi.myAtoi(" ") , 0);
    }
    @Test
    public void assert_input_out_of_lower_bound(){
        Assertions.assertEquals(MyAtoi.myAtoi("-5019284736") , -2147483648);
    }

    @Test
    public void assert_plus_sign(){
        Assertions.assertEquals(MyAtoi.myAtoi("+12") , 12);
    }

    @Test
    public void assert_conditional_boundary_overflow(){
        Assertions.assertEquals(MyAtoi.myAtoi("2147483646"), 2147483646);
    }

}