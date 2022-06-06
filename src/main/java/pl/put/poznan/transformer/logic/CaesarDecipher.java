package pl.put.poznan.transformer.logic;

/**
 * A class for decrypting text using Caesar cipher
 */
public class CaesarDecipher extends DecoratedTextTransformer{
    private String text;

    /**
     * Divides input text into shift and plain text
     * Deciphers the text using shifts in the alphabet
     * @param TT
     *
     */
    public CaesarDecipher(TextTransformer TT){
        this.text = TT.getText();
        String decipheredText = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String preshift = text.replaceAll("\\D+", "");
        Integer shift = Integer.parseInt(preshift);
        shift = shift%52;
        String cipheredText = text.replaceAll("[0-9]", "");
        for (int i = 0; i < cipheredText.length(); i++) {
            char ch = cipheredText.charAt(i);
            for (int j = 0; j < alphabet.length(); j++) {
                char ch2 = alphabet.charAt(j);
                if (ch == ch2) {
                    char ch3 = alphabet.charAt(j-shift);
                    decipheredText += ch3;
                }
            }
        }
        this.text = decipheredText;

    }
    @Override
    public String getText(){

        return this.text;
    }
}

