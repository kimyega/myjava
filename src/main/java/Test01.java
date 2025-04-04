public class Test01 {
    public static void main(String[] args) {
        String log = "127.0.0.1 - Scott [10/Dec/2019:13:55:36 -0700] \"GET /server-status HTTP/1.1\" 200 232\n";

        int startIndex = log.indexOf("\"") + 1;
        int endIndex = log.indexOf(" ", startIndex);
        String get = log.substring(startIndex, endIndex);
        System.out.println(get);
    }
}
