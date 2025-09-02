package mainclass;
import java.util.Scanner;

import source.*;
public class MainClass {
    public static void main(String[] args) 
    {
        Stack s=new Stack(10);
        Scanner scan=new Scanner(System.in);
        boolean running=true;
        while(running)
        {
            System.out.println("Interactive Screen:\n Enter your Choice \n 1: Push 2: Multi Push 3: Array Push \n 4: Pop 5: Multipop \n6: Display 7: Exit");
            int ch=scan.nextInt();
            switch (ch) {
                case 1:
                    //Person data
                    try {
                        s.push(getPersonData(scan));
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Error: "+e.toString());
                    }
                    break;
                case 2:
                    Person p1=getPersonData(scan);
                    Person p2=getPersonData(scan);
                    try {
                        s.push(p1, p2);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Error: "+e.toString());
                    }
                      break;

                case 3:
                    Person p11=getPersonData(scan);
                    Person p12=getPersonData(scan);
                    Person p13=getPersonData(scan);
                    Person[] p={p11,p12,p13};
                    try {
                        s.push(p);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Error: "+e.toString());
                    }
                    break;
            
                case 4:
                     try {
                       System.out.println("Popped person:"+s.pop()); 
                     } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Error: "+e.toString());
                     }
                break;
                case 5:   try {
                    Person[] popped=s.pop(2);
                    for (Person person : popped) {
                        System.out.println(person);
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Error: "+e.toString());
                }
                break;
                case 6: 
                    try {
                        s.display();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println("Error: "+e.toString());
                    }
                break;
                case 7:  running=false; scan.close(); break;
                default:
                System.out.println("Invalid Choice");
                    break;
                
            }
        }


    }
    static Person getPersonData(Scanner scan)
    {
        
        System.out.println("Person Data Entry");
        System.out.println("Name:");
        String name=scan.next();
        System.out.println("Age:");
        int age=scan.nextInt();
        System.out.println("Gender:");
        Gender gen=Gender.valueOf(scan.next().toUpperCase());
        return new Person(name, age, gen);
    }
}
