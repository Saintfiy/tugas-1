import java.util.Scanner;

public class Modul1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String adminUsername = "admin";
        String adminPassword = "admin";


        int pilih;

        do {
            System.out.println("=====PBO MENU====");
            System.out.println("1 Login Mahasiswa");
            System.out.println("2 Login Admin");
            System.out.println("3 KELUAR");
            System.out.print("pilih angka (1-3): ");
            pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    studentLogin(scanner);
                    break;
                case 2:
                    adminLogin(scanner, adminUsername, adminPassword);
                    break;
                case 3:
                    System.out.println("anda telah keluar.");
                    break;
                default:
                    System.out.println("pilih nomer 1-3 goblok.");
            }

        } while (pilih != 3);
    }

    private static void studentLogin(Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nimInput = scanner.next();

        if (nimInput.length() == 15 && nimInput.matches("\\d+")) {

            System.out.println("Anda Login Sebagai Mahasiswa");
        } else {

            System.out.println("Salah NIM Goblok");
        }
    }

    private static void adminLogin(Scanner scanner, String adminUsername, String adminPassword) {
        System.out.print("Masukkan Nama(admin): ");
        String usernameInput = scanner.next();
        System.out.print("Password(admin): ");
        String passwordInput = scanner.next();

        if (usernameInput.equals(adminUsername) && passwordInput.equals(adminPassword)) {
            System.out.println("Anda Login Sebagai Admin.");
        } else {
            System.out.println("Salah cok!!");
        }
    }
}