import java.io.*;

public class Code05_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String print = num > 100 ? num < 1000 ? "100보다 크고 1000보다 작군요.": "와~ 1000보다 크군요.": "음~ 100보다 작군요.";
        bw.write(print + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
