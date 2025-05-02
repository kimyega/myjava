package mid_exam;

public class Exam01 {
    public static void main(String[] args) {
        String st = "*";        // 문자열 st 변수에 별 저장
        String bl = " ";        // 문자열 bl 변수에 공백 저장
        int n = 4;              // int형 n 변수에 4 저장 이때 n은 줄의 수

        for (int i = 1; i <= n; i++) {                          //  i는 1부터 n까지 for문을 활용하여 반복한다.
            System.out.print(bl.repeat(n - i));           //  공백은 줄의 수에 따라 3,2,1,0 으로 변하므로 표현하면 n - i 이 된다. 그러므로 repeat 메서드로 공백문자열인 bl을 n - i번 반복하여 출력한다.
            System.out.print(st.repeat(2 * i - 1));       //  별은 줄의 수에 따라 1,3,5,7 으로 변하므로 증가하는 홀수를 표현하면 2 * i - 1 이 된다. 그러므로 repeat 메서드로 별문자열인 st를 2 * i - 1번 반복하여 출력한다.
            System.out.println();                               //  한줄을 다 출력하고난 후에 줄바꿈을 해준다.
        }
    }
}
