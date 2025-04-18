package mid_exam;

public class Exam02 {
    public static void main(String[] args) {
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36-0700] \"GET /apache.pb.gif HTTP/1.0\" 200";
        int idx = log.indexOf("\"");
        int stIdx = log.indexOf(" ", idx) + 2;
        int endIdx = log.indexOf(" ", stIdx);
        String st = log.substring(stIdx, endIdx);
        System.out.println(st);


    }
}
