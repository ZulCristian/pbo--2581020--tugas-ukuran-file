import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama file      : ");
        String namaFile = scanner.nextLine();

        System.out.print("Ukuran (byte)  : ");
        // kalau pakai int, jadinya overflow karena sudah melebihi batas int (2.147.483.647 byte / ~2 GB)
        long ukuranByte = scanner.nextLong();



    }
}