package Exception_Handling_By_Anuj;

public class Throw_Throws {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            getNumberFromArray(a);
        }catch (Exception e){
            System.out.println("Catched the Exception "+e.getMessage());
        }
    }
    static int getNumberFromArray(int a[]) throws ArithmeticException{//Catched the Exception Index 8 out of bounds for length 5
        return a[8];
    }

}

