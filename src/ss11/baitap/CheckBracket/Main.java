package ss11.baitap.CheckBracket;

import static ss11.baitap.CheckBracket.CheckBracket.checkParenthesis;

public class Main {
    public static void main(String[] args) {
        String string1 = "s * (s – a) * (s – b) * (s – c) ";
        String string2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String string3 = "s * (s – a) * (s – b * (s – c)";
        String string4 = "s * (s – a) * s – b) * (s – c)";

        System.out.println(string1 + " : " + checkParenthesis(string1));
        System.out.println(string2 + " : " + checkParenthesis(string2));
        System.out.println(string3 + " : " + checkParenthesis(string3));
        System.out.println(string4 + " : " + checkParenthesis(string4));
    }

}
