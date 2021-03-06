package pl.put.poznan.transformer.logic;

/**
 * A class for eliminating repetitive words
 */

public class DuplicatesElimination extends DecoratedTextTransformer{
    private String text;
    
     /**
     * Eliminate repetitive words in the immediate vicinity
     * @param TT
     */
    
    public DuplicatesElimination(TextTransformer TT){
        this.text = TT.getText();
        String[] c = (this.text).split(" ");
        String done = c[0];
        for(int j=1; j<c.length; j++)
        {
            if(!(c[j-1].equals(c[j])))
            {
                done = done +" "+ c[j];
            }
            
        }
        this.text = done;
        
    }
    @Override
    public String getText(){

        return this.text;
    }
}
