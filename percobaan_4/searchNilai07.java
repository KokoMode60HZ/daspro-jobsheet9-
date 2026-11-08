import java.util.Scanner;

public class searchNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] nilai = { 78, 65, 90, 55, 88, 72 };
        // int key = 90;


        System.out.print("Masukkan banyaknya elemen: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari (key): ");
        int key = sc.nextInt();
        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        // if (!ditemukan) {
        //     System.out.println("Nilai " + key + " tidak ditemukan.");
        // }

         if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan. Nilai " + key
                    + " tidak ada di dalam array yang berisi " + nilai.length + " elemen.");
        }

    }
}
