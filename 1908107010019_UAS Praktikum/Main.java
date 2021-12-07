import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("Silahkan Pilih Bank yang Anda Inginkan : BCA atau JENUS");
        System.out.print("Pilihan : ");
        scanner = new Scanner(System.in);
        // menyimpan inputan user kedalam variabel bankType
        String bankType = scanner.next();
        System.out.println("Bank yang anda pilih : " + bankType);

        Bank bank = null;
        bank = new Bank();

        // mengecek inputan user dengan mengabaikan besar kecilnya huruf yang diinput
        if ("JENIUS".equalsIgnoreCase(bankType)) {
            bank.setyourPick(new BNI());
        } else if ("BCA".equalsIgnoreCase(bankType)) {
            bank.setyourPick(new Jenius());
        } else {
            System.out.println("Mohon Pilih Tidak Tersedia untuk Saat ini");
        }
        karyawan1 karyawan = new karyawan1();
        System.out.print("masukkan gaji karyawan ($) : ");
        int gaji = scanner.nextInt();
        karyawan.setSalary(gaji);
        // mengubah salary dari dollar ke rupiah
        Salary salaryAdapter = new SalaryAdaptertoRp(karyawan);

        System.out.print("gaji terkirim sebesar : Rp." + salaryAdapter.getSalary() + " melalui ");
        bank.PickBank();

    }
}
