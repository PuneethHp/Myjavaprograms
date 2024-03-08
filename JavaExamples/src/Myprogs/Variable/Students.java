package Myprogs.Variable;

  class Student {
      int a;
      static int id = 35;

      void changes() {

          System.out.println(id);
      }
  }

    public class Students {
        public static void main(String[] args) {

            Student o1 = new Student();
            Student o2 = new Student();
            o1.changes();
            Student.id = 1;
            o2.changes();
        }
    }

