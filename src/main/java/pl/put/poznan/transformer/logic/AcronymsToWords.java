package pl.put.poznan.transformer.logic;

public class AcronymsToWords extends Convert{
    private String text;
    public AcronymsToWords(TextTransformer TT){
        this.text = TT.getText();
        //place for transformation
    }
    @Override
    public String getText(){

        return this.text;
    }
}
