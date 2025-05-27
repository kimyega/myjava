public class Code10_07 {
    static int hap_para(int v1, int v2) {
        int result;
        result = v1 + v2;
        return result;
    }
    static int hap_para(int v1, int v2, int v3) {
        int result;
        result = v1 + v2 + v3;
        return result;
    }
    static Long hap_para(int v1, int v2, long v3) {
        long result;
        result = v1 + v2 + v3;
        return result;
    }
    public static void main(String[] args) {
        int hap;
        hap = hap_para(10, 20);
        System.out.println(hap);

        hap = hap_para(10, 20, 30);
        System.out.println(hap);

        Long hap2 = hap_para(10, 20, 30L);
        System.out.println(hap2);
    }
}
