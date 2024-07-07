package java_pratice.Exception.Pratice1;

public class Throw1 {
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException(" person is not eligible to vote");
        }
        else
        {
            System.out.println(" Person is eligible to vote");
        }
    }
    public static void main(String[] args) {

        validate(43);
        System.out.println(" rest of the code....");

    }
}
