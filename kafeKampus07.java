import java.util.Scanner;

public class kafeKampus07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                "Teh Tarik", "Cappucino", "Chocolate Ice" };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };

        System.out.println("===== DAFTAR MENU =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("\nCari menu: ");
        String cari = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println(menu[i] + " tersedia, harga Rp " + harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Menu " + cari + " tidak tersedia.");
        }

        System.out.print("\nJumlah item yang dipesan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            int indeks = -1;

            while (indeks == -1) {
                System.out.print("Pesanan ke-" + (i + 1) + ": ");
                String input = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(input)) {
                        indeks = j;
                        break;
                    }
                }
                if (indeks == -1) {
                    System.out.println("Menu tidak tersedia, coba lagi.");
                }
            }

            pesanan[i] = menu[indeks];
            hargaPesanan[i] = harga[indeks];
            total += harga[indeks];
        }

        System.out.println("\n===== DAFTAR PESANAN =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + "\tRp " + hargaPesanan[i]);
        }
        System.out.println("--------------------------");
        System.out.println("TOTAL BIAYA: Rp " + total);

        sc.close();
    }
}