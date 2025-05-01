package mid_exam;

public class Exam02 {
    public static void main(String[] args) {
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36-0700] \"GET /apache.pb.gif HTTP/1.0\" 200";       // 문자열 변수 log에 로그값을 저장한다.
        int idx = log.indexOf("\"");                // 문자열 log 중 따음표가 처음 나타나는 인덱스를 정수형 변수 idx에 저장한다.
        int stIdx = log.indexOf("/", idx);      // 문자열 log 의 인덱스가 idx인 위치 이후에 처음으로 나타나는 / 인덱스를 정수형 변수 stIdx에 저장한다.
        int endIdx = log.indexOf(" ", stIdx);   // 문자열 log 의 인덱스가 stIdx인 위치 이후에 처음으로 나타나는 공백 의 인덱스를 정수형 변수 endIdx에 저장한다.
        String st = log.substring(stIdx, endIdx);   // 문자열 log 의 인덱스가 stIdx부터 endIdx의 위치 전까지 substring 메서드로 잘라내 문자열 변수 st에 저장한다.
        System.out.println(st);                     // 문자열 st를 출력한다.


    }
}
