# Stack Implementation with Person Objects

This project demonstrates a simple **Stack implementation in Java** with support for storing custom `Person` objects.  
It includes examples of method overloading, exception handling, and interactive console input.

---

## 📂 Project Structure
```
src/
├── mainclass/
│ └── MainClass.java # Main interactive program (menu-driven)
└── source/
├── Stack.java # Stack implementation with push/pop overloads
├── Person.java # Person model class
├── Gender.java # Enum for Gender (MALE/FEMALE)
```
---

## 🚀 Features

- **Stack Operations**
  - `push(Person)` – Push a single person
  - `push(Person, Person)` – Push two persons
  - `push(Person[])` – Push an array of persons
  - `pop()` – Pop a single person
  - `pop(int n)` – Pop multiple persons
  - `display()` – Display stack contents

- **Person Management**
  - Person objects contain `name`, `age`, and `gender`.
  - `Gender` enum used for input validation (`MALE`, `FEMALE`).

- **Interactive CLI**
  - Users can push, pop, and display stack data through a console-based menu.

---

## 🛠️ How to Run

1. **Compile the project**
   ```
   javac mainclass/MainClass.java source/*.java
2. Run the main class
   ```
   java mainclass.MainClass
3. Follow the menu options
   ```
   Interactive Screen:
    Enter your Choice
    1: Push 
    2: Multi Push 
    3: Array Push 
    4: Pop 
    5: Multi Pop 
    6: Display 
    7: Exit
5. Example Usage
   ```
   Interactive Screen:
    Enter your Choice
    1: Push 2: Multi Push 3: Array Push
    4: Pop 5: Multipop 6: Display 7: Exit

    Choice: 1
    Person Data Entry
    Name: Alice
    Age: 25
    Gender: FEMALE

    Choice: 6
    Person Details are: Alice Age is 25 and Gender is FEMALE

## Known Issues / Improvements
1. Encapsulation: Fields in Person and Stack should be private with getters/setters.
2. Custom Exceptions: Replace generic Exception with StackOverflowException and StackUnderflowException.
3. Validation: Handle invalid gender input gracefully.
4. Collections: Could replace arrays with ArrayList<Person> for more flexibility.


   ## UML Diagram
   ```
   +-------------------+        +---------------------+
    |     MainClass     |       |       Stack         |
    +-------------------+       +---------------------+
    | - main(String[])  |       | - top: int          |
    | - getPersonData() |       | - elements: Person[]|
    +-------------------+       +---------------------+
        |                           ^
        | uses                      |
        v                           |
    +-------------------+       +-------------------+
    |      Person       |<------|    Gender (enum)  |
    +-------------------+       +-------------------+
    | - name: String    |       | MALE              |
    | - age: int        |       | FEMALE            |
    | - gender: Gender  |       +-------------------+
    +-------------------+
    | + toString()      |
    +-------------------+
```
