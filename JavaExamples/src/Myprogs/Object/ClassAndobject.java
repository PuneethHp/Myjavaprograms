package Myprogs.Object;

public class ClassAndobject {

        String name;
        int rollno;
        int age;

        void info(){
            System.out.println("Name: "+name);
            System.out.println("Roll Number: "+rollno);
            System.out.println("Age: "+age);
        }
        public static void main(String[] args) {
            ClassAndobject classAndobject = new ClassAndobject();
            classAndobject.name = "Gowtham";
            classAndobject.rollno = 01;
            classAndobject.age = 18;
            classAndobject.info();
        }
    }


