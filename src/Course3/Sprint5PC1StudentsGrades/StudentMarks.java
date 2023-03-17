package Course3.Sprint5PC1StudentsGrades;

public class StudentMarks {

    public int calculateMarks(int math, int physics, int chemistry, int biology) {
        int sum = math + physics + chemistry + biology;
        return sum;
    }

    public int calculateMarks2(int math, int physics, int chemistry) {
        int sum = math + physics + chemistry;
        return sum;
    }

    public int calculateMarks(int businessStudies, int finance, int accounting) {
        int sum = businessStudies + finance + accounting;
        return sum;
    }

}

