package pl.put.poznan.transformer.logic;

public class WordsToAcronyms extends Convert{
    private String text;
    public WordsToAcronyms(TextTransformer TT){
        this.text = TT.getText();
        //place for transformation
    }
    @Override
    public String getText(){

        return this.text;
    }
}
