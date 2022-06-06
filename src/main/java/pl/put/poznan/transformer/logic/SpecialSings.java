package pl.put.poznan.transformer.logic;

public class SpecialSings extends Convert{
    private String text;
    
    /**
     * class constructor
     * setting text field to text taken from another TextTransformer class but converted to be supported by Latex
     * @param TT TextTransformer class with text field to be converted
     */
    public SpecialSings(TextTransformer TT){
        this.text = TT.getText();
        String newText = "";
        String a = "%${_|>-#&}<";
        char[] b = a.toCharArray();
        for(int i=0; i<text.length(); i++)
        {
            if(text.charAt(i) == b[0])
            {
                newText += "\\%";
            }
            else if(text.charAt(i) == b[1])
            {
                newText += "\\$";
            }
            else if(text.charAt(i) == b[2])
            {
                newText += "\\{";
            }
            else if(text.charAt(i) == b[3])
            {
                newText += "\\_";
            }
            else if(text.charAt(i) == b[4])
            {
                newText += "\\textbar";
            }
            else if(text.charAt(i) == b[5])
            {
                newText += "\\textgreater";
            }
            else if(text.charAt(i) == b[6])
            {
                newText += "\\textendash";
            }
            else if(text.charAt(i) == b[7])
            {
                newText += "\\#";
            }
            else if(text.charAt(i) == b[8])
            {
                newText += "\\&";
            }
            else if(text.charAt(i) == b[9])
            {
                newText += "\\}";
            }
            else if(text.charAt(i) == b[10])
            {
                newText += "\\textless";
            }
            else
            {
                newText += text.charAt(i);
            }

        }
        this.text = newText;
    }
    @Override
    public String getText(){

        return this.text;
    }
}
