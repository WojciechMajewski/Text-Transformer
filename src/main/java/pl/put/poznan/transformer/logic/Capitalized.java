package pl.put.poznan.transformer.logic;

public class Capitalized extends SizeModifier{
    private String text;
    public Capitalized(TextTransformer TT){
        this.text = TT.getText();
        String[] splited = this.text.split("", -1);
        String done = "";
        Character letter;
        Boolean check=true;
        // in java <8 there is an empty element at indx 0
        for(int i=0; i<this.text.length(); i++)
        {
            letter = this.text.charAt(i);
            if( Character.isLetter(letter))
            {
                if(check)
                {
                    done = done + splited[i].toUpperCase();
                    check = false;
                }
                else{
                    done = done + splited[i].toLowerCase();
                }
            }
            else
            {
                done = done + splited[i];
                check = true;
            }
        }
        this.text = done;
    }
    
    @Override
    public String getText(){

        return this.text;
    }
}
