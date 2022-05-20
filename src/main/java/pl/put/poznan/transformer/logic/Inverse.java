package pl.put.poznan.transformer.logic;

public class Inverse extends DecoratedTextTransformer{
    private String text;
    public Inverse(TextTransformer TT){
        this.text = TT.getText();
        //place for transformation
    }
    @Override
    public String getText(){

        return this.text;
    }
}
