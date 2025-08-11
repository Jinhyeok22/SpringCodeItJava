package org.example.Head02_OOPprogramming.example01;

class Student {
    String name;
    int mathScore;
    int engScore;

    Student(String name, int mathScore, int engScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    double getAverage() {
        return (mathScore + engScore) / 2.0;
    }
}

public class GradeManager {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 90, 95),
                new Student("Bob", 80, 75),
                new Student("Charlie", 85, 88)
        };

        for (Student student : students) {
            System.out.printf("%s 평균: %.1f\n", student.name, student.getAverage());
        }
    }
}

/* public class ProGradeManager {
    public static void main(String[] args) {
        String[] studentNames = {"Alice", "Bob", "Charlie"};
        int[] mathScores = {90, 80, 85};
        int[] engScores = {95, 75, 88};

        for(int i = 0; i < studentNames.length; i++) {
            int total = mathScores[i] + engScores[i];
            double avg = total / 2.0;
            System.out.printf("%s 평균: %.f\n", studentNames[i], avg);
        }
    }
}       */