package Jobsheet_12;
import java.util.Scanner;

public class Percobaan619 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("masukkan panjang : ");
        p = input.nextInt();
        System.out.println("masukkan lebar : ");
        l = input.nextInt();
        System.out.println("masukkan tinggi : ");
        t = input.nextInt();
        
        L = p * l;
        System.out.println("Luas persegi panjang adalah : "+L);

        vol = p * l * t;
        System.out.println("Volume balok adalah : "+vol);
    }
    static int hitungLuas (int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tingi, int a, int b){
        int Volume = hitungLuas(a, b) * tingi;
        return Volume;
    }

    
}
