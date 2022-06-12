package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A class for testing reversing the text
 */

class InverseTest {

    /**
     * Test if reverse is with retaining the case of letters in specific position
     */

    @Test
    void isInverseNotFullTest() {
        TextTransformer tested = new PlainTextTransformer("AbCd");
        TextTransformer tested_text = new Inverse(tested);
        assert (! (tested_text.getText().equals("dCbA"))): "* Reverse without retaining the case of letters ERROR *";
    }

}