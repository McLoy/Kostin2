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

        double rr = 12.56;
        System.out.println((int)rr);

        int nn = 307, res2 = 0;
        char Symbols2[];
        Symbols2 = String.valueOf(nn).toCharArray();
        for (int i = 0; i <Symbols2.length; i++) {
            res2 = res2 + Character.getNumericValue(Symbols2[i]);
        }
        System.out.println("Сумма чисел в числе " + nn + " = " + res2);


    }
}
