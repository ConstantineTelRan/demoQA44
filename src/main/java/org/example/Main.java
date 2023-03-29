package org.example;

public class Main {
    /*
    \\d - одна цифра
    + - один или более
    * - 0 или более
    ? - символ, который идет до него может быть, а может и не быть
    (x|z|y|e|t) - одно из множества
    [a-zA-Z] - все буквы английского алфавита (и большие, и маленькие)
    [0-9] - все возможные цифры
    [^abc] - буквы abc не должны присутствовать в строке
    {2} - два символа до
    {2,} - от двух символов до бесконечности
    {2,4} - от двух до 4 символов
    \\w - одна буква
    ^abc - эти символы должны быть в начале строки
    abc$ - эти символы должны быть в конце строки
    . - любой символ
    \\S - любой символ отличный от пробела

     */
    public static void main(String[] args) {

//        String oneDig = "1";
//        boolean result = oneDig.matches("\\d");
//        System.out.println(result);


//        String moreThenDig = "1";
//        boolean result1 = moreThenDig.matches("\\d+");
//        boolean result1 = moreThenDig.matches("\\d*");
//        System.out.println(result1);

//        String negDig = "174737";
//
//        boolean result2 = negDig.matches("-?\\d+");
//        System.out.println(result2);

//        String dig1 = "174737";
//
//        boolean result3 = dig1.matches("(-|\\+)?\\d+");
//        System.out.println(result3);

//        String dig2 = "928273746265561251";
//
//        boolean result4 = dig2.matches("[0-9]+");
//        System.out.println(result4);

//
//        String dig3 = "890746";
//
//        boolean result5 = dig3.matches("[^123]+");
//        System.out.println(result5);


//        String dig4 = "8";
//
//        boolean result6 = dig4.matches("\\d{2,6}");
//        System.out.println(result6);

//        String dig5 = "ejdjdjd";
//
//        boolean result7 = dig5.matches("\\w");
//        System.out.println(result7);

//        String dig5 = "123ejdjdjd098";
//
//        boolean result7 = dig5.matches("^123\\w+098$");
//        System.out.println(result7);

//        Регулярное выражение для всех url на доменах com и de
//        String url = "https://www.google.com";
//        String url1 = "https://www.selenium.dev";
//        boolean urlResult = url.matches("https://www\\..+\\.\\w+");
//        System.out.println(urlResult);


        String email = "mail@gmail.com";
        boolean emailResult = email.matches("\\S+@\\S+\\.\\w+");
        System.out.println(emailResult);



    }
}