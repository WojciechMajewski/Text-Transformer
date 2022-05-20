package pl.put.poznan.transformer.logic;

import java.util.Locale;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public abstract class TextTransformer {
    private String text;

    public TextTransformer(){
    }

    public String getText(){
        return this.text;
    }

}
