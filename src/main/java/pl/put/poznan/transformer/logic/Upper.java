package pl.put.poznan.transformer.logic;

public class Upper extends SizeModifier{
    private String text;
    public Upper(TextTransformer TT){
        this.text = TT.getText();
        this.text = this.text.toUpperCase();
    }
    @Override
    public String getText(){

        return this.text;
    }
}
