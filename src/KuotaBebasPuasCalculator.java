import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class KuotaBebasPuasCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat_1 = new DecimalFormat("IDR ###,###.##");
        DecimalFormat quotaFormat = new DecimalFormat("#.00");

        boolean buy = true;

        while (buy) {

            System.out.println("Do you want to buy quota? (Yes/No) ");
            String buyAgain = input.nextLine().toLowerCase();

            if (buyAgain.equals("yes")) {
                System.out.print("Enter Kuota Bebas: ");
                int quota = input.nextInt();
                input.nextLine();

                switch (quota) {
                    case 1:
                        System.out.println("=======Kuota Bebas Satu=======");

                        int harga_1 = 8000;
                        double quota_1 = 5.525;
                        BigDecimal quota1 = new BigDecimal(quota_1);

                        System.out.println("Active period: ");
                        int day = input.nextInt();
                        double totalQuota;
                        double totalQuotaMath;

                        if (day > 0 && day <= 30) {
                            totalQuota = quota_1 * day;

                            totalQuotaMath = Math.ceil(quota_1 * day * 100.0) / 100.0;
                            BigDecimal product = quota1.multiply(BigDecimal.valueOf(day));  // 11.04
                            BigDecimal result = quota1.multiply(BigDecimal.valueOf(day)).setScale(2, RoundingMode.DOWN);
                            BigDecimal roundedUp = product.setScale(2, RoundingMode.UP);

                            // Calculation
                            double pay = harga_1 * day;
                            String rupiahFormat_1 = decimalFormat_1.format(pay);

                            System.out.print("Total Quota: ");
                            System.out.printf("%.2f", totalQuota);
                            System.out.print(" GB");
                            System.out.println();
                            System.out.println("Total double type: " + totalQuota);
                            System.out.println();
                            System.out.println("Using decimal format " + quotaFormat.format(totalQuota));
                            System.out.println("Total Quota Math Ceiling : " + totalQuotaMath);
                            System.out.printf("Total Quota big decimal rounded DOWN: " + result);
                            System.out.println();

                            System.out.println("Total Quota rounded UP: " + roundedUp);
                            System.out.println();


                            System.out.println("Before format YOU HAVE TO PAY:Rp " + pay);
                            System.out.println("YOU HAVE TO PAY:" + rupiahFormat_1);
                            System.out.println();
                            input.nextLine();

                            System.out.println("Program close... bye...");

                            buy = false;


                        } else {
                            System.out.println("The day must be more than 1 day or less than 30 day");
                            System.out.println();
                            input.nextLine();
                        }
                        break;

                    case 2:
                        System.out.println("===========Kuota Bebas Dua===========");
                        int harga_2 = 6000;
                        double quota_2 = 3.20;
                        System.out.println("Active period: ");
                        int day_2 = input.nextInt();
                        double totalQuota_2;

                        if (day_2 > 0 && day_2 <= 30) {

                            totalQuota_2 = quota_2 * day_2;
                            double pay_2 = harga_2 * day_2;
                            String rupiahFormat_2 = decimalFormat_1.format(pay_2);

                            System.out.print("Total Quota: ");
                            System.out.printf("%.2f", totalQuota_2);
                            System.out.print(" GB");
                            System.out.println();
                            System.out.println("Before format YOU HAVE TO PAY:Rp " + pay_2);
                            System.out.println("YOU HAVE TO PAY:" + rupiahFormat_2);
                            System.out.println();
                            input.nextLine();
                            System.out.println("Program close... bye...");

                            buy = false;

                        } else {
                            System.out.println("The day must be more than 1 day or less than 30 day");
                            System.out.println();
                            input.nextLine();

                        }
                        break;
                    case 3:
                        System.out.println("===========Kuota Bebas Tiga===========");
                        System.out.println("Active period: ");
                        int day_3 = input.nextInt();

                        int harga_3 = 3000;
                        double quota_3 = 1.20;
                        double totalQuota_3;

                        if (day_3 > 0 && day_3 <= 30) {
                            totalQuota_3 = quota_3 * day_3;
                            double pay_3 = harga_3 * day_3;

                            // Currency format
                            DecimalFormat decimalFormat3 = new DecimalFormat("IDR #,##0");
                            String rupiahFormat_3 = decimalFormat3.format(pay_3);

                            System.out.print("Total Quota: ");
                            System.out.printf("%.2f", totalQuota_3);
                            System.out.print(" GB");
                            System.out.println();
                            System.out.println("Before format:Rp " + pay_3);
                            System.out.println("YOU HAVE TO PAY:" + rupiahFormat_3);
                            System.out.println();
                            input.nextLine();
                            System.out.println("Program close... bye...");
                            buy = false;

                        } else {
                            System.out.println("The day must be more than 1 day or less than 30 day");
                            System.out.println();
                            input.nextLine();

                        }
                        break;
                    case 4:
                        System.out.println("===========Kuota Bebas Empat===========");
                        System.out.println("Active period: ");
                        int day_4 = input.nextInt();

                        int harga_4 = 2000;
                        double quota_4 = 425;
                        double totalQuota_4;
                        int totalQuota_mb;

                        double gb = quota_4 / 1000;
                        BigDecimal gb_4 = new BigDecimal(gb);
                        int mb = (int) (gb * 1000);
                        BigDecimal mb_4 = new BigDecimal(mb);
                        BigDecimal result_4 = gb_4.multiply(BigDecimal.valueOf(day_4)).setScale(2, RoundingMode.DOWN);
                        BigDecimal result4 = mb_4.multiply(BigDecimal.valueOf(day_4)).setScale(2, RoundingMode.DOWN);

                        if (day_4 > 0 && day_4 <= 30) {
                            totalQuota_4 = gb * day_4;
                            totalQuota_mb = mb * day_4;
                            double pay_4 = harga_4 * day_4;


                            // Currency format
                            DecimalFormat decimalFormat = new DecimalFormat("IDR #,##0");
                            String rupiahFormat = decimalFormat.format(pay_4);

                            System.out.print("Total Quota in mega byte: " + totalQuota_mb + " MB");
                            System.out.println();
                            System.out.print("Total Quota in Giga byte: ");
                            System.out.printf("%.2f", totalQuota_4);
                            System.out.print(" GB");
                            System.out.println();
                            System.out.print("Result Round Down GB: " + result_4);
                            System.out.print(" GB");
                            System.out.println();
                            System.out.print("Result Round Down MB: " + result4);
                            System.out.print(" MB");
                            System.out.println();
                            System.out.println("Before formatting " + pay_4);
                            System.out.println("YOU HAVE TO PAY:" + rupiahFormat);
                            System.out.println();
                            input.nextLine();
                            System.out.println("Program close... bye...");
                            buy = false;

                        } else {
                            System.out.println("The day must be more than 1 day or less than 30 day");
                            System.out.println();
                            input.nextLine();

                        }

                        break;
                    default:
                        System.out.println("NO Option. Please input 1-2");
                }

            } else if (buyAgain.equals("no")) {
                System.out.println("I will close the program. Bye!");
                break;
            } else {
                System.out.println("Invalid input. Please input Yes/No!");

            }
        }
        input.close();
    }
}
