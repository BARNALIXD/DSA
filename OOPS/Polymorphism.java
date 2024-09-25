public class oops {
    public static void main(String [] args){
        Student s1 = new Student;
        Student s2 = new Student("Barnali");
        Student s3 = new student (123);
    }
}

class student {
    String name;
    int roll;

    Student () {
        System.out.println("Constructor is called");
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll =  roll;
    }
}