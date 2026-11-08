import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        String predikat;
        int jumlahLulus = 0;

        System.out.println("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();
        int[] nilaiMhs = new int[jumlah];

        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0");
            return;
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }

        }

        double rata = (double) total / nilaiMhs.length;
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        if (rata >= 85) {
            predikat = "Sangat baik";
        } else if (rata >= 70) {
            predikat = "Baik";
        } else {
            predikat = "Perlu pendampingan";
        }

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai: " + rata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Predikat kelas: " + predikat);

        sc.close();
    }
}