package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.* ;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A class for testing transforming text to the lower case
 */


class LowerTest {

    /**
     * Testing modifying the case of letters to lower case
     */

    @Test
    void loweringTest() {

        // Creating
        PlainTextTransformer mocktext = Mockito.mock(PlainTextTransformer.class);
        // Configuration
        when(mocktext.getText()).thenReturn("");
        // Interaction
        TextTransformer lowered = new Lower(mocktext);
        String result = lowered.getText();
        // Verification
        verify(mocktext).getText();
        assert (result.equals((result).toLowerCase())): "* To lower case ERROR *";
    }

}