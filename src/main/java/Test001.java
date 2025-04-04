import java.io.*;
import java.util.StringTokenizer;

public class Test001 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int average = 0, count = 0;
        while (st.hasMoreTokens()) {
            average += Integer.parseInt(st.nextToken());
            count++;
        }
        average = average / count;

        switch (average / 10) {
            case 9, 10:         bw.write("A");  break;
            case 8:             bw.write("B");  break;
            case 7:             bw.write("C");  break;
            case 6:             bw.write("D");  break;
            default:            bw.write("F");  break;
        }
        bw.write("학점입니다.");
        br.close();
        bw.flush();
        bw.close();
    }
}
