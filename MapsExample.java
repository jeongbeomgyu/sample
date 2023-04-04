import java.util.HashMap;

public class MapsExample {
    public static void main(String[] args) {
        //Map
        //키-값을 쌍을 요소로 가지는 데이터 모음, 순서 구분 없음
        //키는 중복 불가, 값은 중복허용
        //HashMap
        HashMap map = new HashMap();
        map.put("age",30);
        map.put("mbti","INFP");
        System.out.println(map.get("age"));
        // 인덱스 값이 아니라 키 값이 들어가야 키에 대응되는 값이 출력된다.
    }
}
