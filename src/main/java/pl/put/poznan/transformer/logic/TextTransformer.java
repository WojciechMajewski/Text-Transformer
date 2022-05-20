package pl.put.poznan.transformer.logic;

import java.util.Locale;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class TextTransformer {

    private final String[] transforms;

    public TextTransformer(String[] transforms){
        this.transforms = transforms;
    }

    public String transform(String text){
        // of course, normally it would do something based on the transforms
        for (String transformation : transforms)
        {
            if(transformation.equals("upper")){
                text = text.toUpperCase();
            }
        }
        return text;
    }
}
