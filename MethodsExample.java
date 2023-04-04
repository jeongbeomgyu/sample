public class MethodsExample {
    public static void main(String[] args) {
      //함수(메소드)
      //어떠한 값이 넘져지거나 아무 값도 넘겨지지 않았을 때
      //작업을 수행한 후 반환하거나 혹은 반환하지 않고 종료

        //1번 실행
        int mod_result = mod(3, 2);
        System.out.println(mod_result);

        //2번 실행
        printNum(10);

        //3번 실행
        String str = greeting();
        System.out.println(str);

        //4번 실행
        greeting_2();



    }

    //1.입력도 있고 출력도 있는 경우
    static int mod(int a , int b)
    {
        int result = a % b;
        return result;
    }
    //2. 입력은 있는데 출력이 없는 경우
    static void printNum(int a)
    {
        System.out.println(a); // 출력만 하면 휘발되어 버림
    }
    //3. 입력은 없는데 출력이 있는 경우: 입력이 없기 때문에 ()안에 아무것도 적지 않는다.
    static String greeting(){
        return "Hello";
    }
    //4. 입력도 없고 출력도 없는 경우
    static void greeting_2(){
        System.out.println("Hello!");
    }


}
