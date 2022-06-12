package pl.put.poznan.transformer.logic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Class for testing converting float numbers into text
 */

public class NumbersToTextTest {

    /**
     * Test if integers are converted correctly
     */

    @Test
    void integerNameTest() {
        TextTransformer tested = new PlainTextTransformer("123");
        TextTransformer tested_text = new NumbersToText(tested);
        assert ("one hundred twenty three".equals(tested_text.getText())): "* Integer number conversion ERROR *";
    }


    /**
     * Test if floating point numbers are converted correctly
     */

    @Test
    void floatNameTest() {
        TextTransformer tested = new PlainTextTransformer("0.12");
        TextTransformer tested_text = new NumbersToText(tested);
        assert (tested_text.getText().equals("zero point twelve")): "* Floating point number conversion ERROR *";
    }

    /**
     * Test if no number is detected in text when dots appear (indicator for floating point number)
     */

    @Test
    void extractWithNoNumbersTest() {
        TextTransformer tested = new PlainTextTransformer("Ricevuto sofferma spezzare par appoggia tremante suo. Tuoi fame cure le vada ella da. Ed fa divorato no lacerati dovresti.");
        TextTransformer tested_text = new NumbersToText(tested);
        assert (tested_text.getText().equals("Ricevuto sofferma spezzare par appoggia tremante suo. Tuoi fame cure le vada ella da. Ed fa divorato no lacerati dovresti.")): "* Extracting numbers from text ERROR *";
    }

    /**
     * Test if number is detected and converted in text
     */

    @Test
    void extractNumbersTest() {
        TextTransformer tested = new PlainTextTransformer("Ricevuto sofferma spezzare par appoggia 202.03 tremante suo. Tuoi fame cure le vada ella da. Ed fa divorato 73.12 no lacerati dovresti.");
        TextTransformer tested_text = new NumbersToText(tested);
        assert (tested_text.getText().equals("Ricevuto sofferma spezzare par appoggia two hundred two point zero three tremante suo. Tuoi fame cure le vada ella da. Ed fa divorato seventy three point twelve no lacerati dovresti.")): "* Extracting numbers from text ERROR *";
    }



}