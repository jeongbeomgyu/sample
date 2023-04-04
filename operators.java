public class operators {
    public static void main(String[] args) {
        //산술연산자
        //정수형 자료형 연산
        int a = 10;
        int b = 20;
        String c = "abc";
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //실수형 자료형 연산
        double d = 10;
        double e =20;
        System.out.println(d/e);
        //문자열 자료형과 정수형 자료형 연산
        System.out.println( c+ a);

        //비교연산자

        int f =5;
        int h =8;
        System.out.println(f < h);
        System.out.println(f > h);
        System.out.println(f >= h);
        System.out.println(f <= h);
        System.out.println(f == h);
        // =는 대입연산자 , == 비교연산자
        System.out.println(f != h);

        //논리연산자
         int i = 3;
         int j =3;
         int k=5;
         //&& and 연산 - 교집합
        System.out.println(k>i && k>j);
        //둘다 참이여야지 참이다

        //or 연산 || - 합집합
        System.out.println(k>i && k<j);
        //둘 중 하나만 참이여도 참이다.
        
        // not 연산 ! - 교집합
        System.out.println(!true);
        System.out.println(!false);

        // 대입연산자
        int l = 1;
        double price = 12.4;

        //증감연산자
        a++;
        a--;
        //System.out.println(a++); a가 먼저 출력되고 a+1을 한다
        //System.out.println(a);
        System.out.println(++a);  // a+1을 하고 a를 출력한다.


        }
    }

