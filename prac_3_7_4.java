public class prac_3_7_4 {
public static void main(String[] args) {
    Person p1 = new Person("Hetvi", 18);

   // Person p2 = p1;
    p1.person(p1.name, p1.age);
    System.out.println("Name is " + p1.getName());
    System.out.println("Age is " + p1.getAge());
}
}
class Person {
    String name;
    int age;

public Person(String name,int age)
{
    this.name = name;
    this.age = age;
}

Person person(String name, int age){
    Person p1 = new Person(name, age);
    //returnig object
    return p1;
} 

public String getName()
{
    return name;
}
public int getAge()
{ 
    return age;
}
}

