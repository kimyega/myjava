package mid_exam;

public class Exam01 {
    public static void main(String[] args) {
        String st = "*";
        String bl = " ";
        int n = 4;

        for (int i = 1; i <= n; i++) {
            System.out.print(bl.repeat(n - i));
            System.out.print(st.repeat(2 * i - 1));
            System.out.println();
        }
    }
}
