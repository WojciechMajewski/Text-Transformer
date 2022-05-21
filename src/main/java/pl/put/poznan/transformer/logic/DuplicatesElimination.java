package pl.put.poznan.transformer.logic;

public class DuplicatesElimination extends DecoratedTextTransformer{
    private String text;
    public DuplicatesElimination(TextTransformer TT){
        this.text = TT.getText();
        //place for transformation
        String[] c = (this.text).split(" ",-2);
        String done = c[0]+" ";
        String last = c[0];
        String now;
        for(int j=1; j<c.length; j++)
        {
            now = c[j];
            
            if(!(last.equals(now)))
            {
                done = done + now;
                last = now;
                if(j<c.length-1)
                {
                    done = done + " ";
                }
            }
            
        }
        this.text = done;
        
    }
    @Override
    public String getText(){

        return this.text;
    }
}
