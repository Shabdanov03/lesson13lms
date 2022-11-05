import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        String[] array={" English "," Tehnical lesson "," praktic "," Soft skills "};
        MyClass myClass=new MyClass("Ilim","Shabdanov",19,"plov",array);
        System.out.println(myClass.getName()+" "+myClass.getSurname()+" "+myClass.getAge()+" "+
                myClass.getFood()+""+Arrays.toString(myClass.getCourses()) +" ");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        MyClass myClass2=new MyClass();
        myClass2.setName("Ilimbek");
        myClass2.setSurname("Bakberdievich");
        myClass2.setAge(18);
        myClass2.setFood("Lagman");
        myClass2.setCourses(array);

        System.out.println("myClass2.getName() = " + myClass2.getName());
        System.out.println("myClass2.getSurname() = " + myClass2.getSurname());
        System.out.println("myClass2.getAge() = " + myClass2.getAge());
        System.out.println("myClass2.getFood() = " + myClass2.getFood());
        System.out.println("myClass2.getCourses() = " + Arrays.toString(myClass2.getCourses()));
    }
}