import java.util.Scanner;

    /*
Uloha 1: Základné matematické operácie
Vytvorte jednoduchý program, ktorého cieľom bude výpočet 4 základných matematických operácií a to na sčítanie, odčítanie, násobenie a delenie.
Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. number1 a number2.
Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
Program nám zároveň vypíše takýto text:
Výsledkom sčítanie hodnôt 2 a 3 je 5.
Výsledkom odčítania hodnôt 2 a 3 je -1.
atď.
Bonusová úloha: Vedeli by ste v prípade desatinných miest nahradiť desatinnú bodku za čiarku?

     */


public class operacie {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println(" Zadaj prve cislo");
        float number1 = sc1.nextFloat();
        System.out.println(" Zadaj druhe  cislo je: ");
        float number2 = sc2.nextFloat();

        sc1.close();
        sc2.close();

        System.out.println("Prve cislo je : " + number1);
        System.out.println("Druhe  cislo je : " + number2);
        System.out.println();
        System.out.println();

        float result=number1+number2;
        System.out.println("Výsledkom sčítania hodnôt " + number1 + " a "+ number2 + " je " + result );

        result=number1-number2;
        System.out.println("Výsledkom odčitania hodnôt " + number1 + " a "+ number2 +" je " + result );

        result=number1*number2;
        System.out.println("Výsledkom násobenia  " + number1 + " a "+ number2 + " je " + result );

        result=number1/number2;
        System.out.println("Výsledkom delenia hodnôt " + number1 + " a "+ number2 + " je " + result );

    }


}
