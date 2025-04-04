import java.io.*;

public class Code05_08 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("점수 입력 ==> ");
        int score = Integer.parseInt(br.readLine());

        switch (score / 10) {
            case 9, 10:         bw.write("A"); break;
            case 8:             bw.write("B"); break;
            case 7:             bw.write("C"); break;
            case 6:             bw.write("D"); break;
            default:            bw.write("F"); break;
        }
        bw.write("학점입니다.");
        br.close();
        bw.flush();
        bw.close();
    }
}
