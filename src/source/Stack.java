package source;

public class Stack {
    int top=-1;
    Person[] elements;

    public Stack(int size)
    {
        elements=new Person[size];
    }
    public Stack(Person[] arr)
    {
        this.elements=arr;
        top=elements.length-1;
    }

//Member Functions (Multiple Overloaded Push)
    public void push(Person p) throws Exception
    {
        if(top==elements.length-1)
        {
            throw new Exception("Overflow");
        }
        else
        {
            elements[++top]=p;
        }
    }

    public void push(Person p1,Person p2) throws Exception
    {
        try
        {
            push(p1);
            push(p2);
        }
        catch(Exception e)
        {
            throw e;
        }
    }

    public void push(Person[] persons) throws Exception
    {
        try
        {   
            for (Person person : persons) {
                 push(person);
            }
           
        }
        catch(Exception e)
        {
            throw e;
        }
    }
    
    //Multiple Overloaded Pop
    public Person pop() throws Exception
    {
        if(top==-1)
        {
            throw new Exception("Underflow");
        }
        else
        {
            return elements[top--];
        }
        
    }
    //Multi Pop
    public Person[] pop(int noofelements) throws Exception
    {   
        Person[] people=new Person[noofelements];
        try
        {
            for(int i=0;i<=noofelements;i++)
            {
                people[i]=pop();
            }
            return people;
        }
        catch(Exception e)
        {
              throw e;
        }
    }

    public void display() throws Exception
    {
        if(top==-1)
        {
            throw new Exception("Stack Empty");
        }
        for(int i=top;i>=0;i--)
        {
            System.out.println(elements[i]);
            System.out.println();
        }
    }

}
