package pl.put.poznan.transformer.logic;

public class WordsToAcronyms extends Convert{
    private String text;
    
    
    /**
     * class constructor
     * setting text field to text taken from another TextTransformer class but with some sets of words changed into acronims
     * @param TT TextTransformer class with text field to be converted
     */
    public WordsToAcronyms(TextTransformer TT){
        String text = TT.getText();
        String[] acronims = {"yolo", "vip", "tba", "rip", "p.s.", "imo", "fyi", "faq", "eta", "prof.", "dr.", "diy", "btw", "dob", "ad", "bc", "aka", "asap", "brb"};
        String[] fullWords = {"you only live once", "very important person", "to be announced", "rest in peace", "post scriptum", "in my opinion", "for your information", "frequently asked questions", "estimated time of arrival", "profesor", "doctor", "do it yourself", "by the way", "date of birth", "anno domini", "before christ", "also known as", "as soon as possible", "be right back"};
        String[] fullWordsUpper = fullWords.clone();
        for(int i = 0; i< fullWordsUpper.length; i++)
        {
            fullWordsUpper[i] = fullWordsUpper[i].toUpperCase();
        }
        String transformedText = "";
        int textLength = text.length();
        int fullWordsLength = acronims.length;
        String tmpSpace = " ";
        char space = tmpSpace.charAt(0);
        boolean for1Finished;
        for(int i = 0; i<textLength; i++)
        {
            if(i == 0)
            {
                //boolean for1Finished = true;
                for(int j = 0; j<fullWordsLength; j++)
                {
                    if(textLength >= fullWords[j].length()) {
                        boolean for2Finished = true;
                        for (int k = 0; k < fullWords[j].length(); k++) {
                            if ((text.charAt(i + k) != fullWords[j].charAt(k)) && (text.charAt(i + k) != fullWordsUpper[j].charAt(k))) {
                                for2Finished = false;
                                break;
                            }
                        }
                        if (for2Finished == true) {
                            if (textLength == fullWords[j].length()) {
                                //for1Finished = false;
                                transformedText += acronims[j];
                                i += fullWords[j].length();
                                break;
                            } else if (text.charAt(i + fullWords[j].length()) == space) {
                                //for1Finished = false;
                                transformedText += acronims[j];
                                i = i + fullWords[j].length();
                                break;
                            }
                        }
                    }
                }
            }
            if(text.charAt(i) == space)
            {
                for1Finished = true;
                for(int j = 0; j<fullWordsLength; j++)
                {
                    if(textLength >= i + fullWords[j].length() + 1) {
                        boolean for2Finished = true;
                        for (int k = 1; k < fullWords[j].length() + 1; k++) {
                            if ((text.charAt(i + k) != fullWords[j].charAt(k - 1)) && (text.charAt(i + k) != fullWordsUpper[j].charAt(k - 1))) {
                                for2Finished = false;
                                break;
                            }
                        }
                        if (for2Finished == true)
                        {
                            if (textLength == i + fullWords[j].length() + 1) {
                                for1Finished = false;
                                transformedText = transformedText + " " + acronims[j];
                                i += fullWords[j].length();
                                break;
                            } else if (text.charAt(i + fullWords[j].length()+1) == space) {
                                for1Finished = false;
                                transformedText = transformedText + " " + acronims[j];
                                i = i + fullWords[j].length();
                                break;
                            }
                        }
                    }
                }

                if(for1Finished == true)
                {
                    transformedText += text.charAt(i);
                }
            }
            else
            {
                transformedText += text.charAt(i);
            }
        }
        this.text = transformedText;
    }
    @Override
    public String getText(){

        return this.text;
    }
}
