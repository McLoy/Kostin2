/**
 * Created by McLoy on 19.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        int q = 21, w = 8;
        System.out.println("21 / 8 = " + q/w + " и " + q%w + " в остатке");

        int n = 26, res = 0;
        char Symbols[];
//        String str;
//        str = String.valueOf(n);
        Symbols = String.valueOf(n).toCharArray();
        for (int i = 0; i <Symbols.length; i++) {
            res = res + Character.getNumericValue(Symbols[i]);
        }
        System.out.println("Сумма чисел в числе " + n + " = " + res);


    }
}
