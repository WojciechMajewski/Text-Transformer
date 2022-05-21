package pl.put.poznan.transformer.logic;

public class Inverse extends DecoratedTextTransformer{
    private String text;
    public Inverse(TextTransformer TT){
        this.text = TT.getText();
        String[] c = (this.text).split(" ");
        String done = "";
        for(int j=0; j<c.length; j++)
        {
            String a = c[j];
            String[] letters = a.split("");
            Character letter;
            for(int i=a.length() -1; i>=0; i--)
            {
                letter = a.charAt(a.length()-i-1);
                if(Character.isUpperCase(letter))
                {
                    done = done+upper(letters[i]);
                }
                else{
                    done = done+lower(letters[i]);
                }
            }
            
            if(j<c.length-1)
            {
                done = done + " ";
            }
        }
        this.text = done;
        
    }
    
    @Override
    public String getText(){

        return this.text;
    }
}
