public class MyClass {
    private String name;
    private String surname;
    private int age;
    private String food;
    private String[] courses;
    public MyClass(String name,String surname,int age,String food,String[] courses){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.food=food;
        this.courses=courses;
    }
    public MyClass(){

    }

    public void setName(String name){
        this.name=name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setCourses(String [] courses){
        this.courses=courses;
    }
    public void setFood(String  food){
        this.food=food;
    }

    public String getName(){
        return  name;
    }
    public  String getSurname(){
        return surname;
    }
    public int getAge(){
        return  age;
    }
    public String[] getCourses(){
        return courses;
    }
    public String getFood(){
        return food;
    }
}
