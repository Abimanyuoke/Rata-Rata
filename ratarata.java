import java.util.Scanner;

public class ratarata {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);   

     System.out.print("Masukkan nilai dari mata pelajaran Agama: ");
     int Agama = input.nextInt ();
     
     System.out.print("Masukkan nilai dari mata pelajaran Pkn: ");
     int Pkn = input.nextInt ();
     
     System.out.print("Masukkan nilai dari mata pelajaran Bahasa Indonesia: ");
     int BahasaIndonesia = input.nextInt ();

     System.out.print("Masukkan nilai dari mata pelajaran Bahasa Inggris: ");
     int BahasaInggris = input.nextInt ();
     
     System.out.print("Masukkan nilai dari mata pelajaran Matematika: ");
     int Matematika = input.nextInt ();

     int total = Agama + Pkn + BahasaIndonesia + BahasaInggris + Matematika;
     int rata = total/5;

     System.out.println("Rata-Rata: " + rata);



     if (rata <= 25) {
        System.out.print("Predikat F ");
        System.out.println("Belajar dengan giat lagi!!!");
     }
     else if (rata <=45) {
        System.out.print("Predikat E ");
        System.out.println("Belajar dengan giat lagi!!!");
     }
      else if (rata <=50) {
        System.out.print("Predikat D ");
        System.out.println("Belajar dengan giat lagi!!!");
     }
      else if (rata <=60) {
        System.out.print("Predikat C ");
        System.out.println("Belajar dengan giat lagi!!!");
     }
     else if (rata <=80) {
        System.out.print("Predikat B ");
        System.out.println("Cukup Bagus");
     }
     else if (rata >=81) {
        System.out.print("Predikat A ");
        System.out.println("Pertahankan");
     } else {
        System.out.print("Error");
     }
     
     input.close ();     
    
     


     
    }
}
