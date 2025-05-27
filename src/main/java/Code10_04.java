public class Code10_04 {
    static int para2_method1(int v1, int v2) {
        int result;
        result = v1 + v2;
        return result;
    }

    public int para2_method2(int v1, int v2) {
        int result;
        result = v1 + v2;
        return result;
    }

    public static void main(String[] args) {
        Code10_04 c = new Code10_04();

        int hap = 0;
        hap = c.para2_method2(1, 2);

        System.out.println(hap);
    }
}
