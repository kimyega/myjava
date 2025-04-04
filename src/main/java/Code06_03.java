import java.util.Scanner;

public class Code06_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("시작 번호 입력 ==> ");
        int startNum = in.nextInt();
        System.out.print("끝 번호 입력 ==> ");
        int endNum = in.nextInt();
        System.out.print("짝수: 1, 홀수: 2, 전체: 3 ==> ");
        int cases = in.nextInt();

        if (cases == 1) {
            if (startNum % 2 == 1) {
                startNum++;
            }
        } else if (cases == 2) {
            if(startNum % 2 == 0) {
                startNum++;
            }
        } else if (cases != 3) {
            System.out.println("잘못된 입력입니다.");
        }
        for (int i = startNum; i <= endNum; i++) {
            System.out.println(i + ": 난생처음 자바는 재미있습니다. ^^");
            if (cases == 1 || cases == 2) {
                i++;
            }
        }
    }
}
