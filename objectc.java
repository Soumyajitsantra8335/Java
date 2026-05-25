class Student{
        String name;
        int age;

        Student(String n, int m){
            name = n;
            age = m;

        }
        void display(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }


    }
    public class objectc{
        public static void main(String[] args){
            Student v = new Student("Tamal",22);
            v.display();
        }
    }
    

