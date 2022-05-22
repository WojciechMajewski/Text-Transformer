package pl.put.poznan.transformer.logic;

import java.util.Map;
import java.util.HashMap;

/**
 * A class for converting Roman numbers to Arabic numbers
 */

public class RomanToArabic extends Convert{
    private String text;

    /**
     * Convert string of Roman number into Arabic number as Integer and then change it to String
     * @param TT
     */

    public RomanToArabic(TextTransformer TT) {
        this.text = TT.getText();
        Map<Character, Integer> map = new HashMap();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        Integer result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i > 0 && map.get(text.charAt(i)) > map.get(text.charAt(i-1))) {
                result += map.get(text.charAt(i)) - 2 * map.get(text.charAt(i-1));
            }
            else {
                result += map.get(text.charAt(i));
            }
        }
        String result2 = Integer.toString(result);
        this.text = result2;
    }


    @Override
    public String getText(){

        return this.text;
    }
}
