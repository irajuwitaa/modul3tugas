import java.util.Scanner;
public class AutocompleteAndTemplates {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        //baca input panjang sisi kubus
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();

        // Menghitung luas permukaan kubus
        int luasPermukaan = hitungLuasPermukaan(sisi);

        // Menampilkan hasil perhitungan
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
return 6 * sisi * sisi
    public static int hitungLuasPermukaan(int sisi) {

        return 6 * sisi * sisi;
    }
}

