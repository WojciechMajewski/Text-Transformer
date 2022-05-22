package pl.put.poznan.transformer.logic;

/**
 * A class for encrypting text using Caesar cipher
 */
public class CaesarCipher extends DecoratedTextTransformer{
    private String text;

    /**
     * Divides input text into shift and plain text
     * Ciphers the text using shifts in the alphabet
     * @param TT
     *
     */
    public CaesarCipher(TextTransformer TT){
        this.text = TT.getText();
        String cipherText = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        String preshift = text.replaceAll("\\D+", "");
        Integer shift = Integer.parseInt(preshift);
        shift = shift%53;
        String plainText = text.replaceAll("[0-9]", "");
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            for (int j = 0; j < alphabet.length(); j++) {
                char ch2 = alphabet.charAt(j);
                if (ch == ch2) {
                    char ch3 = alphabet.charAt(j+shift);
                    cipherText += ch3;
                }
            }
        }
        this.text = cipherText;

    }
    @Override
    public String getText(){

        return this.text;
    }
}

