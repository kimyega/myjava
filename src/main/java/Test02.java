import java.io.*;

public class Test02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //입력받은 값이 홀수인지? 짝수인지 구분하기

        int a = Integer.parseInt(br.readLine());
        String result = a % 2 == 0 ? "짝수" : "홀수";
        bw.write("입력받은 값은 " + result + "입니다.");
        br.close();
        bw.close();
        br.close();
    }
}
