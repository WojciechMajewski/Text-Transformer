package pl.put.poznan.transformer.logic;

public class DuplicatesElimination extends DecoratedTextTransformer{
    private String text;
    public DuplicatesElimination(TextTransformer TT){
        this.text = TT.getText();
        //place for transformation
    }
    @Override
    public String getText(){

        return this.text;
    }
}