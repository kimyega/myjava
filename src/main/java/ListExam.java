import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);

        list.parallelStream().forEach(name -> System.out.println("name : " + name));
        list.parallelStream().forEach(System.out::println);

        list.forEach(System.out::println);

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }

        list.stream().forEach(System.out::println);
    }
}
