package pl.put.poznan.transformer.logic;

public class Capitalized extends SizeModifier{
    private String text;
    public Capitalized(TextTransformer TT){
        this.text = TT.getText();
        //place for transformation
    }
    @Override
    public String getText(){

        return this.text;
    }
}
