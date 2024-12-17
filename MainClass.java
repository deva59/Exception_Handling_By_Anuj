package Exception_Handling_By_Anuj;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
//        int a[] = new int[5];
//
//        System.out.println("Hello Guys");
//        try {
//
//            int result = 5/0;
//
//            System.out.println(a[8]);
//
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Try to access the out bound elemenet ");
//        }catch (ArithmeticException e){
//            System.out.println(e.fillInStackTrace());//java.lang.ArithmeticException: / by zero
//
//            System.out.println(e.getMessage());/// by zero
//            System.out.println(e.getCause());//null
//            System.out.println(e.getStackTrace());//[Ljava.lang.StackTraceElement;@4dd8dc3
//        }
//        System.out.println("Bye Guys..");


        int a[] = new int[5];

        System.out.println("Hello Guys");

        try {

            int result = 5 / 0;

            System.out.println(a[8]);

//        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){ //All Runtime Exception
//            System.out.println("Handling The Exception");
//        }catch (RuntimeException e){
//
//        }
        }catch (Exception e){
            System.out.println("all exception handled");
        }
            System.out.println("Bye Guys..");


    }
}
