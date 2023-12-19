public class Person {

    String fullName;
    int age;
    //Methods
    public void move(){
        System.out.println(fullName + " is moving");
    }
    public void talk(){
        System.out.println(fullName + " is talking");
    }
    //constructors
    public Person(){
        fullName="unknown";
        age = 0;
    }
    public Person(String fullName, int age){
        this.fullName=fullName;
        this.age=age;
    }

    public static void main(String[] args) {
        //using methods
        Person obj=new Person();
        obj.move();
        obj.talk();
        //using constructors
        Person obj1 = new Person();
        System.out.println(obj1.fullName + " " + obj1.age);

        Person obj2 = new Person("Almas", 17);
        System.out.println(obj2.fullName + " " + obj2.age);
    }
}
