import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // ввод данных
        String i = in.nextLine();
        System.out.println(calc(i)); // вывод данных
    }
    public static String calc(String input) {
        String result = "throws Exception"; // исключение
        String[] data = input.split(" "); // разделение на операнды и оператора
        if (data.length != 3){ // проверка правильности формата введенных данных
            return result;
        }
        String a = data[0]; // операнд a
        String operator = data[1]; // оператор
        String b = data[2]; // операнд b
        String[] rome = {"I","II","III","IV","V","VI","VII","VIII","IX","X",   //перечисление римских цифр 1-10
                         "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX", //11-20
                         "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",//21-30
                         "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",//31-40
                         "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",//41-50
                         "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",//51-60
                         "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",//61-70
                         "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",//71-80
                         "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC",//81-90
                         "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};//91-100
        String[] arabic = {"1","2","3","4","5","6","7","8","9","10"}; // перечисление арабских цифр
        for (int x = 0; x <= 9 ; x++) // римские
            if (rome[x].equals(a)){
                for(int y = 0; y <= 9 ; y++)
                    if (rome[y].equals(b)){
                        if (operator.equals("-") && (x+1)-(y+1) > 0 ) {
                            return result=rome[x-y-1];}
                        else if (operator.equals("+")) {
                            return result=rome[x+y+1];}
                        else if (operator.equals("*")) {
                            return result=rome[(x+1)*(y+1)-1];}
                        else if (operator.equals("/") && (x+1)/(y+1) >= 1) {
                            return result=rome[(x+1)/(y+1)-1];}
            }}
            else if (arabic[x].equals(a)){ //арабские
                for(int y = 0; y <= 9; y++)
                        if (arabic[y].equals(b)){
                            x = x+1;
                            y = y+1;
                            if (operator.equals("-")) {
                                return result=Integer.toString(x-y);}
                            else if (operator.equals("+")) {
                                return result=Integer.toString(x+y);}
                            else if (operator.equals("*")) {
                                return result=Integer.toString(x*y);}
                            else if (operator.equals("/")) {
                                return result=Integer.toString(x/y);}
                }}
        return result;
    }
}