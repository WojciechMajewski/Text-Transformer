package pl.put.poznan.transformer.logic;

public class SpecialSings extends Convert{
    private String text;
    public SpecialSings(TextTransformer TT){
        this.text = TT.getText();
        //place for transformation
    }
    @Override
    public String getText(){

        return this.text;
    }
}
