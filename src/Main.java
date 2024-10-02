public class Main {
    public static void main(String[] args) {

        System.out.println(camelCaseMe("-no_shot_bruh_"));
    }
    /** 1. Write a method called numberOfVowels that returns the number of vowels in a string.
     Consider a, e, i, o, u as vowels. **/
    public static int numberOfVowels(String string){
        int counter = 0;
        string = string.toLowerCase();
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == 'a'){
                counter++;
            }
            if(string.charAt(i) == 'e'){
                counter++;
            }
            if(string.charAt(i) == 'i'){
                counter++;
            }
            if(string.charAt(i) == 'o'){
                counter++;
            }
            if(string.charAt(i) == 'u'){
                counter++;
            }
        }
        return counter;
    }

    /** 2. Write a method called notDivisibleBy235 that finds the number of natural numbers not exceeding N
     and not divisible by any of the numbers [2, 3, 5].
     Example
     Let's take the number 5 as an example:
     1 - doesn't divide integer by 2, 3, and 5
     2 - divides integer by 2
     3 - divides integer by 3
     4 - divides integer by 2
     5 - divides integer by 5
     Answer: 1 (only one number doesn't divide integer by any of 2, 3, 5) **/
    public static int notDivisibleBy235(int n){
        int counter = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                counter++;
            }
        }
        return counter;
    }



    /** 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * (known as Upper Camel Case, also often referred to as Pascal case).
     * The next words should always be capitalized.
     Examples
     "the-stealth-warrior" gets converted to "theStealthWarrior"
     "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/
    public static String camelCaseMe(String string){
        if(string.charAt(string.length()-1) != '_'){
            string = string + "_";
        }
        if(string.charAt(0) == '_' || string.charAt(0) == '-'){
            string = string.substring(1);
            string = (string.substring(0,1)).toUpperCase() + string.substring(1);
        }
//        if((string.substring(1,2)).toUpperCase() != string.substring(1,2)){
//            string.substring()
//        }
        String camelString = "";
        int lastSpace = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == '-' || string.charAt(i) == '_'){
                if(lastSpace == 0){
                    camelString = camelString + string.substring(0,i);
                }else{
                    camelString = camelString + (string.substring(lastSpace+1,lastSpace+2)).toUpperCase() + string.substring(lastSpace+2,i);
                }
                lastSpace = i;
            }

        }
        return camelString;
    }

}