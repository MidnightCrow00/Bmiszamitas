
package bmiszamitas;

import java.util.Scanner;


public class BmiSzamitas {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        bmiFeladat();
    }

    private static void bmiFeladat() {
        foCim();
        int m = szamitasTestmagassag();
        int t = szamitasTesttomeg();
        double bmi = szamitasBMI(m,t);
        konzolraKiir(m, t, bmi);
    }

    private static void foCim() {
        System.out.println("BMI kiszámítása");
    }

    private static double szamitasBMI(int m, int t) {
        return t/Math.pow(m/100.0,2);
    }

    private static int szamitasTestmagassag( ) {

        System.out.print("Testmagasság[100,200]: ");
        int testmagassag = sc.nextInt();
        while (testmagassag < 100 || testmagassag > 200) {            
            testmagassag = sc.nextInt();
        }
        return testmagassag;

        
    }

    private static int szamitasTesttomeg() {

        System.out.print("Testtömeg[40,150]: ");
        int testtomeg = sc.nextInt();
        while (testtomeg < 40 || testtomeg > 150) {            
            testtomeg = sc.nextInt();
        }
        return testtomeg;
    
        
    }

    private static void konzolraKiir(int m, int t, double bmi) {
        System.out.println("Ön " + m + " cm magas és " + t + " kg tömegű, így BMI indexe " + bmi);
    }
    
}
