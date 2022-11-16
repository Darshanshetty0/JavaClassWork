package Exception_Handling;

class InvalidAgeException extends Exception {
    private int input;

    InvalidAgeException(int a) {
        input = a;
    }

    public String toString() {
        return "InvalidAgeException[" + input + "]";
    }
}

// class that uses custom exception InvalidAgeException
public class UserDefinedExceptionDemo {
    public static void main(String args[]) {
        try {
            int age = 16;
            if (age <= 18)
                throw new InvalidAgeException(age);
            System.out.println("No Exception Occurred!\n Welcome to Vote with years = " + age);
        } catch (InvalidAgeException ex) {
            System.out.println("Exception Occured & Caught\n" + ex);
        }
    }
}
