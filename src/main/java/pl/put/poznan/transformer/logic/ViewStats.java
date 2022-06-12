package pl.put.poznan.transformer.logic;

/**
 * A class for viewing statistics about the text
 */
public class ViewStats extends DecoratedTextTransformer{
    private String text;

    /**
     * Removes the whitespaces
     * Prints out the number of words and characters
     * @param TT
     *
     */
    public ViewStats(TextTransformer TT){
        this.text = TT.getText();
        int numberOfCharacters = text.replace(" ", "").length();
        String[] words = text.split("\\s+");
        int numberOfWords = words.length;
        String output = "Number of characters: " + numberOfCharacters + "\n" + "Number of words: " + numberOfWords;
        this.text = output;

    }
    @Override
    public String getText(){

        return this.text;
    }
}

