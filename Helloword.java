import java.util.Scanner;

public class Helloword {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("hello world");

        //변수

        // 정수형 자료형
        int num = 1;
        num = 10;
        System.out.println(num);
        double width = 1.23;
        String content = "programming";
        int a = 128;

        //실수형 자료형
        double c = 9.23;
        float k = 9.53f;
        System.out.println(c);
        System.out.println(k);

        //문자형 자료형 (문자가 하나)
        char char_1 = 'b';
        char char_2 = 97;
        System.out.println(char_1);
        System.out.println(char_2);

        //논리형 자료형
        boolean bool_1 = true;
        boolean bool_2 = false;
        boolean bool_3 = (100 < 1);
        // java에서는 1은 그냥 정수이다. boolean bool_4 = 1;
        System.out.println(bool_1);
        System.out.println(bool_2);
        System.out.println(bool_3);
        // 오류가 나온다. System.out.println(bool_4);

        //참조형 데이터
        // String p = new String(original:"Hello"); 은 리터널 즉 바로  문자를 대입해 변수에 할당하는 것과 주소값이 다르다
        String m = "Hello";
        String n = "Hello";
        if (m == n) {
            System.out.println("a==b");


        }

        //상수형 데이터
        final double PI = 3.14;
        System.out.println(PI);
        // 이때 PI = 3.141592를하면 재할당이 안되므로 오류가 나온다.
        //int t = 128; short v = t; 를 하면 오류가 나온다. short의 자료형이 int의 자료형보다 작기 때문이다.
        short x = 10;
        int y = x;
        System.out.println(x);
        System.out.println(y);
        // int의 자료형이 short의 자료형보다 크기때문에 형변환이 가능하다.
        int t =128;
        short v = (short) t;
        byte w = (byte) t; //오버플로우가 발생한다.
        // 이렇게 작은 타입으로 형변환을 한다고 명시할 경우에는 형변환이 가능하다.

        //자동으로 형변환 되는 또 다른 경우의 수
        int d = 80;
        double e = d;
        System.out.println(d);
        System.out.println(e);
        // d가 e로 대입되기전에 자동으로 double자료형으로 바뀐다음 대입되기때문에 문제 없이 출력된다.

        //계산할 때 형변환이 일어나는 경우
        int f = 10;
        short g =20;
        short h = (short)(f+g);
        // f는 int형 자료형으로 short보다 크다. 그렇기 때문에 f+g를 더한 자료형은 int 자료형이고 이 자료형을 명시적 형변환으로 통해서 바꿔줘야한다.

        //문자열 String
        String str = "안녕하세요";
        //String str_1 = new String(original: "안녕하세요"); 위 String과는 다른 주소값을 가진다.
        String str_3 = "안녕하세요"; // str과 str_3는 같은 주소값을 가진다 리터럴은 동일한 문자열인 경우 힙 메모리에서 그 문자열에 대한 동일한 주소값을 변수에 대입하기 때문이다.

        // 문자열 간의 내용 비교 equals를 사용해서, 위의 str_2와 비교해도 동일한 값이 출력된다. 왜냐하면 equals는 주소값을 비교하는게 아니라 문자 자체를 비교하기 때문이다.
        if(str.equals(str_3)){
            System.out.println("str.equals(str_3)");
        }

        //문자열을 병합하는 방법
        // 1. + 연산자
        String str_4 = "Hello";
        String str_5 = "world";
        System.out.println(str_4 + str_5);
        // 2. StringBuilder
        StringBuilder strBdr_1 = new StringBuilder("hello");
        strBdr_1.append(" world");
        strBdr_1.toString();
        System.out.println(strBdr_1.toString());

        //문자열 슬라이스
        String str_6 = "이름: 김자바";
        System.out.println(str_6.indexOf("이"));
        System.out.println(str_6.indexOf("름"));
        //'이' 와 '름'이 몇번 인덱스에 저장되어 있는지 확인
        String str_name = str_6.substring(4,7);
        //4미만인 인덱스와 7미만인 인덱스를 포함한다.
        System.out.println(str_name);

        //문자열 대소문자 변환

        String str_7 = "abc";
        String str_8 = "ABC";
        str_7 = str_7.toUpperCase();
        str_8 = str_8.toLowerCase();
        //대소문자를 무시하는 메서드인 equalsIgnoreCase를 사용한다.
        if(str_7.equalsIgnoreCase(str_8)){
            System.out.println("str_7.equals(str_8)");
        }

        //문자열 중간 공백 삭제

        // 1. 양 끝 공백 삭제
        String str_9 = "          Hello   ";
        str_9 = str_9.trim();
        System.out.println(str_9);
        String str_10 = "     He     llo ";
        str_10 = str_10.trim();
        //str_10 = str_10.replace(target:" ",replacement:"" ); 을 통해서 공백을 삭제시킨다.

        //콘솔 입출력
        Scanner SC = new Scanner(System.in);
        System.out.println("아이디를 입력해주세요. >> ");
        //문자열이므로 받을 때 String과 nextLine을 사용한다.
        String username = SC.nextLine();
        //숫자형태를 받을 때 int와 .nextInt()를 사용한다
        System.out.println("생년월일을 입력해주세요. >>");
        int birthDate = SC.nextInt();
        //출력하는 로직은 연속적으로 출력하는 println과 포멧을 지정하는 printf가 있다
        System.out.printf("%s %d",username,birthDate);

    }

}
