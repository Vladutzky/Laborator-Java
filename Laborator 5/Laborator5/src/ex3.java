public class ex3 {
    static class InvalidGradeException extends Exception {
        public InvalidGradeException(String message) {
            super(message);
        }
    }
    public static void validateGrade(int grade) throws InvalidGradeException {
        if (grade < 1 || grade > 10)
            throw new InvalidGradeException("Grade must be between 1 and 10.");
        System.out.println("Grade " + grade + " is valid.");
    }
    public static void main(String[] args) {
        try {
            validateGrade(5);
            validateGrade(12);
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
