package tugasModul4;
import java.util.Scanner;

/*
 * KELOMPOK 18
 * 21120126120009  MICHAEL KURNIAWAN SANTOSO
 * 21120126120029  ADAM NURRAHMAN SYAHPUTRA
 * 21120126130050  ZAKY MAFTUH AHMADI WIDIANTO
 * 21120126140153  AGUNG RESYA MAWARDI
 */

public class tugasModul4_kel18 {

    Scanner input = new Scanner(System.in);

    // FUNCTION RETURN TYPE TANPA PARAMETER
    static String namaEvent() {
        return "GIIAS Semarang";
    }

    // FUNCTION RETURN TYPE DENGAN PARAMETER
    static int hitungTotal(int jumlahTiket, int hargaTiket) {
        return jumlahTiket * hargaTiket;
    }

    // METHOD NON-RETURN TANPA PARAMETER
    void tampilkanMenu() {
        System.out.println("======================================");
        System.out.println("       TICKETING GIIAS SEMARANG");
        System.out.println("            KELOMPOK 18");
        System.out.println("======================================");
        System.out.println("1. Weekday  - Rp15.000 / orang");
        System.out.println("2. Weekend  - Rp20.000 / orang");
        System.out.println("======================================");
    }

    // METHOD NON-RETURN DENGAN PARAMETER
    void tampilkanTiket(String nama, int jumlah, int harga, int total) {
        System.out.println();
        System.out.println("======================================");
        System.out.println("           TIKET GIIAS");
        System.out.println("======================================");
        System.out.println("Nama Pengunjung : " + nama);
        System.out.println("Jumlah Tiket    : " + jumlah);
        System.out.println("Harga / Tiket   : Rp" + harga);
        System.out.println("Total Bayar     : Rp" + total);
        System.out.println("======================================");
        System.out.println("      Terima kasih telah membeli!");
        System.out.println("          Made with <3 Kel 18");
        System.out.println("======================================");
    }

    // PROGRAM UTAMA
    public static void main(String[] args) {

        tugasModul4_kel18 program = new tugasModul4_kel18();
        program.tampilkanMenu();

        String event = namaEvent();

        System.out.println("Event : " + event);

        char beliLagi;

        // PERULANGAN PEMBELIAN TIKET
        do {

            System.out.println();
            System.out.println("-------- DATA PEMBELI --------");

            System.out.print("Masukkan nama pengunjung : ");
            String nama = program.input.nextLine();

            int jumlahTiket;
            int hargaTiket = 0;
            int pilihan;

            // PERULANGAN + PENGKONDISIAN
            do {

                System.out.print("Pilih hari (1 = Weekday, 2 = Weekend): ");
                pilihan = program.input.nextInt();

                if (pilihan == 1) {

                    hargaTiket = 15000;

                    System.out.println("Anda memilih tiket Weekday.");

                } else if (pilihan == 2) {

                    hargaTiket = 20000;

                    System.out.println("Anda memilih tiket Weekend.");

                } else {

                    System.out.println("Pilihan tidak valid!");

                }

            } while (pilihan != 1 && pilihan != 2);

            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = program.input.nextInt();

            // FUNCTION RETURN DENGAN PARAMETER
            int totalBayar = hitungTotal(jumlahTiket, hargaTiket);

            // METHOD NON-RETURN DENGAN PARAMETER
            program.tampilkanTiket(
                    nama,
                    jumlahTiket,
                    hargaTiket,
                    totalBayar
            );

            // Membersihkan input sebelum kembali ke nama
            program.input.nextLine();

            System.out.print("Apakah ingin membeli tiket lagi? (y/n): ");
            beliLagi = program.input.nextLine().charAt(0);

        } while (beliLagi == 'y' || beliLagi == 'Y');

        System.out.println();
        System.out.println("======================================");
        System.out.println("       TERIMA KASIH TELAH MEMBELI");
        System.out.println("          TIKET GIIAS SEMARANG");
        System.out.println("             KELOMPOK 18");
        System.out.println("======================================");

        program.input.close();
    }
}