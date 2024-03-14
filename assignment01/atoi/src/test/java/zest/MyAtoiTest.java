package zest;

import org.junit.jupiter.api.Test;


class MyAtoiTest {


    @Test
    public void convert_string_to_int (){
        assert MyAtoi.myAtoi("42") == 42;
    }

    @Test
    public void remove_whitespace_keep_negative(){
        assert MyAtoi.myAtoi(" -42") == -42;
    }

    @Test
    public void cut_off_trailing_alphabet() {
        assert MyAtoi.myAtoi("4193 with words") == 4193;
    }

    @Test
    public void assert_abc_equals_zero(){
        assert MyAtoi.myAtoi("abc") == 0;
    }

    @Test
    public void input_null(){
        assert MyAtoi.myAtoi(null) == 0;
    }

    @Test
    public void assert_0032_equals_32(){
        assert MyAtoi.myAtoi("0032") == 32;
    }

    @Test
    public void assert_input_out_of_range(){
        assert MyAtoi.myAtoi("4294967296") == 2147483647;
    }

    @Test
    public void assert_rest_of_string_ignored(){
        assert MyAtoi.myAtoi("12abc3") == 12;
    }
 
}