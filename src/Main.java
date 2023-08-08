import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;

        while (count < numbers){
            if (checkSNT(N)){
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    private static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}