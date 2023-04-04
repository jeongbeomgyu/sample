import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        //1. list
        //2. 중복 허용, 순서 구분
        //3. Vector, ArrayList, LinkList
        ArrayList list = new ArrayList(10); // ArrayList는 객체기 때문에 new 연산자를 이용해서 생성, 크기는 10으로 만들었음
        list.add(100);
        list.add("INTP"); // 특정한 타입을 지정하지 않았으므로 어떠한 타입도 넣을 수 있다.
        for (int i =0; i < list.size();i++){
            System.out.println(list.get(i));
            //배열처럼 인덱스를 넣어주지만 get이라는 메서드를 열어주고 그 안에 인덱스를 할당해준다.
        }
    }
}
