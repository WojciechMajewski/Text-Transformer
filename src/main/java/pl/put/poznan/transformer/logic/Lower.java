package pl.put.poznan.transformer.logic;

/**
 * A class for transforming text to the lower case
 */

public class Lower extends SizeModifier{
    private String text;
    
    /**
     * Modify the case of letters to lower case
     * @param TT
     */
    
    public Lower(TextTransformer TT){
        this.text = TT.getText();
        this.text = this.text.toLowerCase();
    }
    @Override
    public String getText(){

        return this.text;
    }

}
