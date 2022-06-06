package pl.put.poznan.transformer.logic;

/**
 * A class for transforming text to the upper case
 */

public class Upper extends SizeModifier{
    private String text;
    
     /**
     * Modify the case of letters to upper case
     * @param TT
     */
    
    public Upper(TextTransformer TT){
        this.text = TT.getText();
        this.text = this.text.toUpperCase();
    }
    @Override
    public String getText(){

        return this.text;
    }
}
