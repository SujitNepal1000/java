class AgeException extends Exception {
    public AgeException(String error) {
        super(error);
    }
}

public class que10 {
    static void test(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age not valid");
        }
    }

    public static void main(String[] args) {
        try {
            test(15);
            System.out.println("Age valid");
            System.exit(0);
        } catch (AgeException e) {
            System.out.println(e);
            System.exit(0);
        } finally {
            System.out.println("I won't be executed");
        }
    }
}