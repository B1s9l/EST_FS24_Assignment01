package zest;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;




class NeedleInHayTest {

    NeedleInHay needleInHay;

    @BeforeEach
    void setUp() {
        needleInHay = new NeedleInHay();
    }

    //T1 & T2
    @Test
    void needleNullOrEmpty() {
        assertEquals(0, needleInHay.find("test", ""), "Needle empty failed");
        assertEquals(-1, needleInHay.find("test", null), "Needle null failed");
    }

    //T3 & T4
    @Test
    void haystackNullOrEmpty() {
        assertEquals(-1, needleInHay.find(null, "test"), "Haystack null failed");
        assertEquals(-1, needleInHay.find("", "test"), "Haystack empty failed");
    }

    //T5
    @Test
    void needleAndHaystackEmpty() {
        assertEquals(0, needleInHay.find("", ""), "Needle and Haystack empty failed");
    }

    //T6 & T7
    @Test
    void needleAndHaystackLengthOne() {
        assertEquals(0, needleInHay.find("t", "t"), "Needle and Haystack Length One Match failed");
        assertEquals(-1, needleInHay.find("t", "l"), "Needle and Haystack Length One No Match failed");
    }

    //T8
    @Test
    void HaystackLengthOne() {
        assertEquals(-1, needleInHay.find("t", "test"), "Haystack length one failed");
    }

    //T9, T10 & T11
    @Test
    void NeedleLengthOne() {
        assertEquals(2, needleInHay.find("asterix", "t"), "Needle Length one, occurence once failed");
        assertEquals(-1, needleInHay.find("aserix", "t"), "Needle Length one, no match once failed");
        assertEquals(2, needleInHay.find("astertix", "t"), "Needle Length one, multiple occurence failed");
    }

    //T12, T13, T14 & T15
    @Test
    void NeedleAndHaystackMultipleChars() {
        assertEquals(5, needleInHay.find("hallotesthallo", "test"), "Needle and Haystack > 1, match once failed");
        assertEquals(-1, needleInHay.find("halloteshallo", "test"), "Needle and Haystack > 1, no match failed");
        assertEquals(5, needleInHay.find("hallotesthallotesthallo", "test"), "Needle and Haystack > 1, multiple occurences failed");
        assertEquals(5, needleInHay.find("Hallotesttesttesthallo", "test"), "Needle and Haystack > 1, multiple occurences consecutively failed");
    }

    //T16, T17, T18 & T19
    @Test
    void NeedleAtEndOrBeginning() {
        assertEquals(5, needleInHay.find("hallotest", "test"), "Needle at end of haystack, lenght >1 failed");
        assertEquals(0, needleInHay.find("testhallo", "test"), "Needle at beginning of haystack, lenght >1 failed");
        assertEquals(5, needleInHay.find("hallot", "t"), "Needle at end of haystack, lenght 1 failed");
        assertEquals(0, needleInHay.find("thallo", "t"), "Needle at beginning of haystack, lenght >1 failed");
    }

    //T20 & T21
    @Test
    void CapitalLetters() {
        assertEquals(5, needleInHay.find("halloTest", "Test"), "Needle at end of haystack, lenght >1 failed");
        assertEquals(-1, needleInHay.find("testhallo", "Test"), "Needle at beginning of haystack, lenght >1 failed");
    }
}