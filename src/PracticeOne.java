import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean lagi = true;
        while (lagi) {
            System.out.println("Ulangi? Yes/No");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("No")) {
                lagi = false;
            } else if (input.equalsIgnoreCase("Yes")) {
                System.out.println("Pilih Paket (1/2/3)? ");
                int paket = sc.nextInt();
                // sc.nextLine();
                switch (paket) {
                    case 1:
                        System.out.println("Paket 1: Masukkan hari? ");
                        int hari = sc.nextInt();

                        if (hari > 0 && hari <= 30) {
                            System.out.println("Process...........");
                        } else {
                            System.out.println("Hari harus kurang dari 30 atau lebih dari 1 hari");
                            sc.nextLine();
                        }
                        break;
                    case 2:
                        System.out.println("Paket 2: Masukkan hari? ");
                        int hari2 = sc.nextInt();

                        if (hari2 > 0 && hari2 <= 30) {
                            System.out.println("Process...........");
                        } else {
                            System.out.println("Hari harus kurang dari 30 atau lebih dari 1 hari");
                            sc.nextLine();
                        }
                        break;
                }
                lagi = true;
            } else {
                System.out.println("Invalid");
                lagi = true;
            }


        }

        sc.close();
        System.out.println("Program selesai.");
    }
}
