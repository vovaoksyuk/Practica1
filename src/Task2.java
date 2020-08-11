import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.println("Введите число 1 =");
        int first = sx.nextInt();
        System.out.println("Введите число 2 =");
        int second = sx.nextInt();
        System.out.println("Введите знак арифметической операции:");
        String operation=sx.next();
        int result1= add(first,second);
        int result2= sub(first,second);
        int result3 = mul(first,second);
        int result4= div(first,second);
        if (operation.equals("+")){
            System.out.println("a + b ="+result1);
        }
        if (operation.equals("-")){
            System.out.println("a - b ="+result2);
        }
        if(operation.equals("*")){
            System.out.println("a * b ="+ result3);
        }
        if(operation.equals("/")){
            System.out.println("a / b="+result4);
        }
        else {
            System.out.println("Введите другую операцию");
        }

    }
     static  int add (int a,int b){
        return a+b;

     }
     static int sub (int a,int b){
        return a-b;
     }
     static int mul (int a,int b){
        return a*b;
     }
     static int div (int a,int b){
        if (b==0) {
            System.out.println("Введите другое значение");
        }
        
        return a/b;
     }
}

