import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một tháng (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                thang(month, "31 ngày");
                break;

            case 4: case 6: case 9: case 11:
                thang(month, "30 ngày");
                break;

            case 2:
                thang(month, "28 hoặc 29 ngày");
                break;

            default:
                System.out.println("Tháng không hợp lệ.");
                break;
        }
        sc.close();
    }
    public static void thang(int m, String days) {
        System.out.println("Tháng " + m + " có " + days + ".");
    }
}