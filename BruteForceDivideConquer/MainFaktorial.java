package BruteForceDivideConquer;
import minggu5.Faktorial;
import java.util.Scanner;
public class MainFaktorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int nilai = input.nextInt();

        Faktorial fk = new Faktorial();

        System.out.println("Nilai Faktorial " + nilai + 
                " menggunakan Brute Force : " + fk.faktorialBF(nilai));

        System.out.println("Nilai Faktorial " + nilai + 
                " menggunakan Divide and Conquer : " + fk.faktorialDC(nilai));
    }
}