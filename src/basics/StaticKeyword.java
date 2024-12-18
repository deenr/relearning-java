package basics;

public class StaticKeyword {
    public static void main(String[] args) {
        Student studentA = new Student(); 
        Student studentB = new Student(); 
        Student studentC = new Student(); 
        Student studentD = new Student();
        
        // System.out.println(studentA.amountOfStudent); // dont use static fields like this
        System.out.println(Student.amountOfStudent);
    }
}

class Student {
    static int amountOfStudent = 0;

    Student() {
        amountOfStudent++;
    }
}