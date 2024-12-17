package Exception_Handling_By_Anuj;

import java.util.Scanner;

public class Custom_Exception {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");

        try {
            int age = sc.nextInt();

            if (age > 100) {
               // throw new MyException("My Error is This");//Object Throw
                throw new ArithmeticException("More than 100 not allowed ");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}

class MyException extends  Exception{
    public MyException(String message){
    super(message);
    }
}