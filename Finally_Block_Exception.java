package Exception_Handling_By_Anuj;

public class Finally_Block_Exception {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("Hello World");

        try {
            System.out.println(a[8]);
        }catch (Exception e){
            System.out.println("Exception Handled");
        }finally { //Finally block ek hi baar run hota finally keyword ek hi baar laga sakte.
            System.out.println("I will run always");
        }
        System.out.println("Bye World");
    }
}

//30 53
