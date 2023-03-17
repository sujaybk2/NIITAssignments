package Course3.Sprint5PC1StudentsGrades;

public class StudentMarksImpl {

    public static void main(String[] args) {
        StudentMarks studentMarks = new StudentMarks();

        int medicalMarks = studentMarks.calculateMarks(90, 85, 95, 92);
        System.out.println("Total marks for medical pathway: " + medicalMarks);

        int nonMedicalMarks = studentMarks.calculateMarks(80, 88, 92);
        System.out.println("Total marks for non-medical pathway: " + nonMedicalMarks);

        int businessMarks = studentMarks.calculateMarks(95, 90, 88);
        System.out.println("Total marks for business pathway: " + businessMarks);
    }

}
