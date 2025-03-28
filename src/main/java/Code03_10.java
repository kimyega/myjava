import java.util.Scanner;

public class Code03_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("필기시험 점수 입력하세요.");
        int score = sc.nextInt();
        System.out.println(score >= 70);
        sc.close();
    }
}
