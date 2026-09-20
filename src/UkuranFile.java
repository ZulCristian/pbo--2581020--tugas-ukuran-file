import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama file      : ");
        String namaFile = scanner.nextLine();

        System.out.print("Ukuran (byte)  : ");
        long ukuranByte = scanner.nextLong();
        // kalau pakai int, jadinya overflow karena sudah melebihi batas int (2.147.483.647 byte)

        /*
         * Kenapa menggunakan 1024.0, bukan 1024?
         * Jika menggunakan 1024, pembagian dilakukan sebagai bilangan bulat,
         * sehingga angka desimal akan terpotong.
         * Dengan 1024.0, Java menggunakan pembagian desimal,
         * sehingga hasilnya tetap lebih akurat.
         */




    }
}