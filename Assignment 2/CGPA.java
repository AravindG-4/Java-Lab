// Interface for CGPA calculation
interface CGPACalculator {
    double calculate(int[] grades);
}

// Class implementing the CGPACalculator interface
class Sem2CGPA implements CGPACalculator {
    public double calculate(int[] grades) {
        int totalCredits = 0;
        double totalPoints = 0.0;

        // Assuming grades array contains the grade points for each subject
        // and the credits for each subject are constant for simplicity
        int creditsPerSubject = 3; // Credits for each subject (assuming all subjects have the same credits)

        for (int grade : grades) {
            totalPoints += (grade*creditsPerSubject);
            totalCredits += creditsPerSubject;
        }

        return totalPoints / totalCredits ; // CGPA calculation formula assuming a scale of 10
    }
}

// Main class to calculate Semester 2 CGPA
public class CGPA {
    public static void main(String[] args) {
        // Grades obtained in each subject
        int[] grades = { 9, 8, 7, 8, 9 }; // Example grades for 5 subjects

        // Creating an instance of Sem2CGPA class
        Sem2CGPA semester2 = new Sem2CGPA();

        // Calculating CGPA for Semester 2
        double cgpa = semester2.calculate(grades);

        System.out.println("CGPA for Semester 2: " + cgpa);
    }
}
