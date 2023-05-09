/*Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız
Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
       double u,alan,cevre;
        Scanner girdi= new Scanner(System.in);
        System.out.print("a sayısını giriniz:");
        a = girdi.nextInt();

        System.out.print("b sayısını giriniz:");
        b= girdi.nextInt();
        System.out.print("c sayısını giriniz:");
        c = girdi.nextInt();

        u=((a+b+c)/2.0);
        System.out.println("ekrana u yazdır:"+ u );

        cevre = ((2*u));

        alan =Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("cevre:"+cevre);
        System.out.println("alan:"+alan);










    }
}