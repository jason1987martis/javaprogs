package source;

public class Person {
    String name;
    int age;
    Gender gender;

    public Person(String name, int age, Gender gen)
    {
        this.name=name;
        this.age=age;
        gender=gen;
    }

    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "Person Details are:"+name+" Age is "+age+" and Gender is"+gender;
    }
}
