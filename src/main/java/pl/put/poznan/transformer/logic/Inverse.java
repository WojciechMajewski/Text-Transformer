package pl.put.poznan.transformer.logic;

import java.util.Locale;

/**
 * A class for reversing the text
 */

public class Inverse extends DecoratedTextTransformer{
    private String text;
    
    /**
     * Reverse the sequence of characters, retaining the case of letters in specific positions
     * @param TT
     */
    
    public Inverse(TextTransformer TT){
        this.text = TT.getText();
        String[] c = (this.text).split(" ");
        String done = "";
        for(int j=0; j<c.length; j++)
        {
            String a = c[j];
            String[] letters = a.split("");
            Character letter;
            for(int i=a.length() -1; i>=0; i--)
            {
                letter = a.charAt(a.length()-i-1);
                if(Character.isUpperCase(letter))
                {
                    done = done + letters[i].toUpperCase();
                }
                else{
                    done = done + letters[i].toLowerCase();
                }
            }
            
            if(j<c.length-1)
            {
                done = done + " ";
            }
        }
        this.text = done;
        
    }
    
    @Override
    public String getText(){

        return this.text;
    }
}
