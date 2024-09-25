public class oops {
    public static void main(String [] args){
        Student s1 = new Student;
        s1.name = "barnali";
        s1.roll = 99;
        s1.password = "abcd";

        Student s2 = new Student(s1);
        s2.password = "xys";
    }
}

class student {
    String name;
    int roll;
    String password;

//copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }

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