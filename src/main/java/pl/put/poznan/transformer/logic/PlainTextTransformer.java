package pl.put.poznan.transformer.logic;

import org.w3c.dom.Text;

public class PlainTextTransformer extends TextTransformer{
    private String text = "";

    public PlainTextTransformer(String text){
        this.text = text;
    }

    @Override
    public String getText(){

        return this.text;
    }
}
