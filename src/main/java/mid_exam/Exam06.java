package mid_exam;

public class Exam06 {
    public static void main(String[] args) {
        int st = 100;
        int end = 300;
        int sum = 0;

        for (int i = st; i <= end; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
