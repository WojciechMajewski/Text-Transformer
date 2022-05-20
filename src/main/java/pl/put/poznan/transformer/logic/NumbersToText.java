package pl.put.poznan.transformer.logic;

public class NumbersToText extends Convert{
    private String text;
    public NumbersToText(TextTransformer TT){
        this.text = TT.getText();
        //place for transformation
    }
    @Override
    public String getText(){

        return this.text;
    }
}
