public class Code11_07 {
    public static void main(String[] args) {

        int[] ary = {10, 20, 30};

        try {
            ary[3] = 1234 / 0;
            ary[3] = 1234;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자 오류입니다.");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눈 등의 수식 오류입니다.");
        } finally {
            System.out.println("이 부분은 무조건 보여요!");
        }
    }
}
