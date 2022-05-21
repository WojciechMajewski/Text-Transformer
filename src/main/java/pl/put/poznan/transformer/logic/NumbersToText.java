package pl.put.poznan.transformer.logic;

public class NumbersToText extends Convert{
    private String text = "";
    private String input_text;
    private String[] words;
    //private char[] chars;
    private String digits[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private String teens[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private String tens[] = {"", "ten", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
    private String hundreds[] = {"", "one hundred ", "two hundred ", "three hundred ", "four hundred ", "five hundred ", "six hundred ", "seven hundred ", "eight hundred ", "nine hundred "};

    public NumbersToText(TextTransformer TT){
        this.input_text = TT.getText();
        //this.chars = input_text.toCharArray();
        this.words = input_text.split(" ");
        extractNumbers();
    }

    public void extractNumbers(){

        for(String w : words){
            char[] chars = w.toCharArray();
            boolean number = true;
            boolean float_num = false;
            for(char c : chars){
                if(c == '.' && float_num){
                    number = false;
                    break;
                }else if(c == '.' && number){
                    float_num = true;
                } else if(!Character.isDigit(c)){
                    number = false;
                    break;
                }
            }
            if(chars[0] == '.'){
                this.text = text + w;
            }else if(number){
                numberName(w);
            }else{
                this.text = text + w;
            }
            this.text = text + " ";
        }
        this.text = text.trim();
    }
    public void numberName(String number){
        String[] str_number;
        str_number = number.split("\\.");

        int int_number = Integer.parseInt(str_number[0]);
        int float_number;
        String nName = "";

        if(int_number == 1000) {
            nName = "thousand";
        }else if (int_number == 0){
            nName = "zero";
        }else {
            int h = (int_number - int_number % 100) / 100;
            int t = (int_number % 100 - int_number % 10) / 10;
            int d = int_number % 10;

            //Check if the last 2 digits form number <10; 20)
            if (t != 1) {
                nName = hundreds[h] + tens[t] + digits[d];
            } else {
                nName = hundreds[h] + teens[d];
            }
        }

        nName = nName.trim();

        if(str_number.length == 2 && Integer.parseInt(str_number[1]) > 0){
            float_number = Integer.parseInt(str_number[1]);
            int t = (float_number % 100 - float_number  % 10) / 10;
            int d = float_number  % 10;

            if(str_number[1].length() == 2 && t == 0){
                nName = nName + " point zero " + digits[d];
            }else if(t != 1){
                nName = nName + " point " + tens[t] + digits[d];
            }else{
                nName = nName + " point " + teens[d];
            }
        }

        this.text = text + nName.trim();
    }

    @Override
    public String getText(){

        return this.text;
    }
}
