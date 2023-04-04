import java.util.ArrayList;

public class MethodExample2 {
    public static void main(String[] args) {
        ArrayList list_1 = new ArrayList<>();
        list_1.add(10);
        list_1.add(100);
        System.out.println(list_1);
        //리스트의 요소를 출력하는 소스를 계속 입력하지 않아도 된다.

    }
    static void printListElement(ArrayList list){
        for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
        //단순히 출력하는 리스트의 요소를 출력하는 함수를 만들어야 하므로, 데이터 형태는 ArrayList가 되어야한다.
    }
}
