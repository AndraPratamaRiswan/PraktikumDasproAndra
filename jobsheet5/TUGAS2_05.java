package jobsheet5;

import java.util.Scanner;

public class TUGAS2_05{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        int angka = sc.nextInt();

        if (angka % 2 == 0){
            System.out.println("ini angka genap");
        } else {
            System.out.println("ini angka ganjil");
        }
    }
}