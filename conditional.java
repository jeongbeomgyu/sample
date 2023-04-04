public class conditional {
    public static void main(String[] args) {
     int a = 10;
     int b = 100;

     //if (a == b){
     //    System.out.println("a==b");
     //}
     //else{
     //    System.out.println("else block");
     //}
        if (a == b) {
            System.out.println("a==b");}
        else if (a<b){
            System.out.println("a<b");
        }
        else if (a<=b){
            System.out.println("a<=b");
        }
        else {
            System.out.println("else block");
        }
        //다중 조건인 경우 조건을 만족하는 최초의 분기만 실행

        //switch 조건문
        switch(a+1) {
            case 9:
                System.out.println("a++1==10");
                break;
            case 10:
                System.out.println("a++1==11");
                break;
            case 11:
                System.out.println("a++1 == 12");
                break;
            default:
                System.out.println("default");

        }


        }
    }

