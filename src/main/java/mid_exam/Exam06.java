package mid_exam;

public class Exam06 {
    public static void main(String[] args) {
        int st = 100;       // 숫자 100을 정수형 변수 st에 저장
        int end = 300;      // 숫자 300을 정수형 변수 end에 저장
        int sum = 0;        // 숫자   0을 정수형 변수 sum에 저장하여 초기화

        for (int i = st; i <= end; i++) {           // i는 st부터 end까지 for문을 통해 반복한다.
            if (i % 5 == 0 || i % 7 == 0) {         // i가 5로 나누어 떨어지거나 i가 7로 나누어떨어지면 if문을 실행한다.
                sum += i;                           // 변수 sum에 변수 i를 더한 값의 결과를 다시 sum에 저장하여 누적합을 계산한다.
            }
        }

        System.out.println(sum);                    // 변수 sum을 출력한다.
    }
}
