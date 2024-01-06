class CustomException extends Exception {
    public CustomException(String errorMessage) {
        super(errorMessage);
    }
}

public class prob10 {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (CustomException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a generic exception: " + e.getMessage());
        }
    }

    public static void throwException() throws CustomException {
        throw new CustomException("This is a custom exception");
    }
}
