import java.sql.SQLOutput;

public class ArraysExample {
    public static void main(String[] args) {
        //배열 (Arrays)
        int [] price = { 10000, 9000, 4000, 7000};
        String [] mbti = {"INFP", "ENTP", "ISTJ", "ESTP"};
        System.out.println(price[0]);
        System.out.println(mbti[0]);
        // 반환 받고 싶은 인덱스 값을 넣는다.

        //배열 변환
        price[1] = 8000;
        System.out.println(price[1]);
        System.out.println(price); // 배열의 주소값이 나온다.

        System.out.println(mbti.length); // String 배열의 길이가 나온다.
        for (int i =0; i < mbti.length; i++) {
            System.out.println(mbti[i]);
        }
        }
    }

