import java.util.Scanner;
/**
 * WhileKelipatan05
 */
public class WhileKelipatan05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0;
        float rerataKelipatan = 0f;
        System.out.print("Masukkan bilangan dari (1-9) : ");
        kelipatan = scan.nextInt();
        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
                rerataKelipatan++;
            }
            i++;
        }
            rerataKelipatan = jumlah / rerataKelipatan;
            System.out.printf("Banyak bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
            System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
            System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %f\n", kelipatan, rerataKelipatan);
            scan.close();
    }
}