package Eksamensspørgsmål;

public class StatementsConditionsExpressions {
    public static void main(String[] args) {
        String one = "Hello";
        String two = "World";
        if (one.length() != two.length()){
            System.out.println("Option 1");
        } else if(one.substring(0,1).equalsIgnoreCase("w") && one.length()==5 ||
                two.substring(0,1).equalsIgnoreCase("w") && two.length()==5){
            System.out.println("Option 2");
        } else{
            System.out.println("Option 3");
        }

        //Alternativ løsning
        if (one.length() != two.length()){
            System.out.println("Option 1");
        } else if(one.indexOf('W') == 0 && one.length()==5 ||
                two.indexOf('W') == 0  && two.length()==5){
            System.out.println("Option 2");
        } else{
            System.out.println("Option 3");
        }

    }
}
