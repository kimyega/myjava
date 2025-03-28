public class Code04_13 {
    public static void main(String[] args) {

        String str = "   한글   ABCD efgh   ";
        String cutStr = "";
        String reStr = "";
        boolean res;

        cutStr = str.trim();
        reStr = str.replaceAll(" ", "");
        res = str.isEmpty();
        boolean res2 = str.length() == 0;

        System.out.println(cutStr);
        System.out.println(reStr);
        System.out.println(res);
    }
}
