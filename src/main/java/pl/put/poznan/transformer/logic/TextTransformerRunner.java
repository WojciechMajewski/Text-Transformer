package pl.put.poznan.transformer.logic;

public class TextTransformerRunner {

    private final String[] transforms;

    public TextTransformerRunner(String[] transforms){
        this.transforms = transforms;
    }

    public String transform(String text){
        // of course, normally it would do something based on the transforms
        TextTransformer pTT = new PlainTextTransformer(text);

        for (String transformation : transforms)
        {
            //TODO - dopisać nazwy do READ.me
            if(transformation.equals("upper")){
                pTT = new Upper(pTT);
            } else if(transformation.equals("lower")){
                pTT = new Lower(pTT);
            } else if(transformation.equals("capital")){
                pTT = new Capitalized(pTT);
            } else if(transformation.equals("inverse")){
                pTT = new Inverse(pTT);
            } else if(transformation.equals("numtotext")){
                pTT = new NumbersToText(pTT);
            } else if(transformation.equals("acrtoword")){
                pTT = new AcronymsToWords(pTT);
            } else if(transformation.equals("wordtoacr")){
                pTT = new WordsToAcronyms(pTT);
            } else if(transformation.equals("specsign")){
                pTT = new SpecialSings(pTT);
            } else if(transformation.equals("dupeli")){
                pTT = new DuplicatesElimination(pTT);
            } else if(transformation.equals("romtoara")){
                pTT = new RomanToArabic(pTT);
            } else if(transformation.equals("caesarCipher")){
                pTT = new CaesarCipher(pTT);
            } else if(transformation.equals("caesarDecipher")){
                pTT = new CaesarDecipher(pTT);
            }
        }
        return pTT.getText();
    }
}