package exceptionHandling;

class AgeValidException extends Exception {

    public AgeValidException(String message) {
        super(message);
    }
}

class Voter {

    static void validateAge(int age) throws AgeValidException {

        if (age < 18) {
            throw new AgeValidException("You are underage.");
        }

        System.out.println("Eligible");
    }
}

public class StackTrace {

    public static void main(String[] args) {

        try {
            Voter.validateAge(19);
        } catch (AgeValidException e) {
            System.out.println(e.getMessage());
        }
    }
}