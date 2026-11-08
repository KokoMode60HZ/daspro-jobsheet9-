
import java.util.Scanner;

public class ArrayNilai07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke - " + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();

        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " lulus: " + nilaiAkhir[i]);
            }
        }

        int lulus = 0;
        int tidakLulus = 0;

        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

    }
}
