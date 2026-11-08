import java.util.Scanner;

public class nilaiMahasiswa07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int batasLulus = 70;

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Banyaknya nilai harus lebih dari 0");
            sc.close();
            return;
        }

        int[] nilai = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rata = (double) total / n;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("\n===== DAFTAR NILAI MAHASISWA =====");
        System.out.println("No\tNilai\tStatus");
        System.out.println("----------------------------");
        for (int i = 0; i < n; i++) {
            String status;
            if (nilai[i] > batasLulus) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }
            System.out.println((i + 1) + "\t" + nilai[i] + "\t" + status);
        }

        System.out.println("----------------------------");
        System.out.println("Rata-rata nilai : " + rata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

        sc.close();
    }
}