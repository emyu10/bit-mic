# An Introduction to Java
## Java Programming Tools
Most popular Java development tools are as follows
### 1. Eclipse
- An Integrated Development Environment (IDE).
- Can be used for almost all programming languages.
- Open source.
- Supports C, C++, C#, Perl, Python, etc.

### 2. Netbeans
- An Integrated Development Environment (IDE).
- Runs on all major desktop operating systems.
- Earlier used to deal with Java Swing wizard framework.

### 3. JUnit
- Foundation for launching testing frameworks.
- Includes TestEngine API for developing testing frameworks.
- Built into popular IDEs.

### 4. Apache Spark
### 5. Jenkins
### 6. Android Studio
### 7. Apache Maven
### 8. Gradle
### 9. JCreator

## History of Java
- Initiated by James Gosling in 1991.
- First target - programming set-top boxes.
- First name "Oak".
- On 13th November 2006, Sun made Java free and open source.
- Java promised "write once, run everywhere" (WORA), changed to the concept platform independent.
- Later released more enhanced version under GNU General Public License.

## Tools You Need
- To run a Java program, user needs Pentium 200Mhz computer with a minimum 64MB RAM (recommended is 128MB).
- You also need.
    - Linux 7.1 or later / Windows XP or later.
    - JDK (Java Development Kit).
    - Text editor.

## Advantages of Java / Java White Paper Buzzwords
### 1. Java is easy to learn / simple
1. Easy to use, easy to write, easy to compile, easy to deploy.
2. Java is very close to C++.
3. Poor features from C++ removed in Java like operator overloading, pointers, multiple inheritance.
4. Syntax similar to C/C++.

### 2. Java is object-oriented
- Enables modular programming and reuse of code.
- Easily extensible because based on objects and classes.
- Mainly focuses on data, objects and methods.
- All OOP concepts present except multiple inheritance.

### 3. Java is platform independent
- Allows to move programs from one computer to another, regardless of the operating system.
- Compiled into bytecode which runs on the Java Virtual Machine (JVM).

### 4. Java is Multi-Threaded
- Capable to perform several tasks simultaneously.
- Smoothly integrated into IDEs.
- Helps to write interactive applications.

### 5. Java is distributed
- Made easy with networking capability.
- Network programming like RMI is easy.

### 6. Java is secure
- The language, JVM and security libraries are open source and anyone can look into the code and report bugs or fix them.
- Programs are sandboxed inside a virtual machine.
- Programs cannot read or write files without permission.
- Digitally signed classes to verify the author of a class.

### 7. Java is robust
- Robust means reliability or dependability.
- Java compiler is able to detect many problems that would show up during execution time in other languages.
- Java makes an effort to eliminate error prone situation on compile time and runtime.

## Misconceptions About Java
### 1. Java is an extension of HTML
- Java is a programming language.
- HTML is used to describe the structure of a web page.

### 2. All Java programs run in a web browser
- Most Java programs run as standalone applications.
- Only Java "applets" inside a Java enabled web browser.

### 3. Java programs have major security risks
- Most security issues found in early days of Java were due to the poor implementation of Java in a specific browser.
- These failures were quickly addressed and fixed.

### 4. Javascript is the simpler version of Java
- Javascript is a scripting language used in web browsers to program user interactivity on a web page.
- There is nothing in common between Java and Javascript except for the name.
- The 2 languages are developed and maintained by 2 different companies.

### 5. Java will become the universal programming language
- Most programs developed in other languages work well on desktops.
- There is no need to rewrite these applications in Java.

### 6. I use XML, so I don't need Java
- Java is a programming language.
- XML is a way to describe data.
- XML can be processed in any programming language.
- Java API has excellent support for XML.

### 7. Java is an easy programming language
- No programming language as powerful as Java is easy to learn.
- The comparison should be made on how easy it is to write toy programs and how hard it could get for some serious work to be done.

### 8. Java is just another programming language
- Java is nice and a lot of programmers prefer it over C/C++ or C#.
- Not so nice languages like C++ and VB also have been wildly successful.


# Fundamental Programming Structures in Java
## Running a simple program
Write the following program in a text editor and save it as First.java
``` java
class First {
    public static void main(String[] args) {
        System.out.println("My first Java program");
    }
}
```
- On a terminal (or cmd), navigate to the folder containing this file.
- Type in ```javac First.java``` to compile it.
- Type ```java First``` to run it.
- The output
    ```
    My first Java program
    ```

## Variables & data types
### Primitive (basic) data types
1. <b>byte</b>:
    - 8-bit integer.
    - Minimum value -128.
    - Maximum value 127.
    - Default 0.
2. <b>short</b>:
    - 16-bit integer.
    - Minimum value -32,768.
    - Maximum value 32,767.
    - Default 0.
3. <b>int</b>:
    - 32-bit integer.
    - Minimum value -2,147,483,648.
    - Maximum value 2,147,483,647.
    - Default 0.
4. <b>long</b>:
    - 64-bit integer.
    - Minimum value -9,223,372,036,854,775,808.
    - Maximum value 9,223,372,036,854,775,807.
    - Default value 0L.
5. <b>float</b>:
    - Single precision, 32-bit floating point number.
    - Default 0.0f.
    - Never use for precise values such as currency.
6. <b>double</b>:
    - Double precision, 64-bit floating point number.
    - Use as default data type as decimal values.
    - Never use for precise values such as currency.
    - Default 0.0d.
7. <b>boolean</b>:
    - Represents 1 bit.
    - Two possible values, true or false.
    - Default is false.
    ``` java
    int a = 20;
    boolean isGreater = a > 18; // true
    if (isGreater) {
        System.out.print("a is greater than 18");
    } else {
        System.out.print("a is not greater than 18");
    }
    // prints "a is greater than 18"
    ```
8. <b>char</b>:
    - Single 16-bit unicode character.
    - Minimum value is '\u0000' (or 0).
    - Maximum value is '\uffff' (or 65,535).

### Reference data types
- Objects of classes.
- Most arrays.
- Default value is ```null```.

### Declaring variables
- Syntax ```data_type variable_name;```
- eg:
    ``` java
    int a;
    String b;
    char c;
    Animal d;
    ```
- Assigning values
    ``` java
    a = 10;
    d = new Animal();
    ```
- Declaring and assigning a value in one line
    ``` java
    int a = 10;
    Animal d = new Animal();
    Scanner s = new Scanner(System.in);
    ```

## Operators
### Arithmetic Operators
- <b>+ (Addition):</b> Add values.
- <b>- (Subtraction):</b> Subtract right operand from the left operand.
- <b>* (Multiplication):</b> Multiplies operands on both sides.
- <b>/ (Division):</b> Divides left operand by right operand.
- <b>% (Modulus):</b> Divides left operand by right operand and yields the remainder after division.
- <b>++ (Increment):</b> Increases the value of the operand by 1.
- <b>-- (Decrement):</b> Decreases the value of the operand by 1.

### Relational Operators
- <b>== (equal to):</b> checks both operands are equal, yields true if equal, false if not.
- <b>!= (not equal to):</b> checks both operands are equal, yields true if not equal, false if equal.
- <b>> (greater than):</b> true if value of left operand is greater than the right.
- <b>< (less than):</b> true if value of left operand is less than the right.
- <b>>= (greater than or equal to):</b> true if left operand is equal or greater than the right.
- <b><= (less than or equal to):</b> true if left operand is equal or less than the right.

### Bitwise operators
- <b>& (bitwise and):</b> copies a bit to the result if it exists in both operands.
- <b>| (bitwise or):</b> copies a bit if it exists in either operand.
- <b>^ (bitwise XOR):</b> copies a bit if it is set in one operand but not both.
- <b>~ (bitwise compliment):</b> operates on one operand and has effect of flipping bits.
- <b><< (left shift):</b> left operand's value is moved left by the number of bits specified by the right operand.
- <b>>> (right shift):</b> the left operand's value is moved right by the number of bits specified by the right operand.
- <b>>>> (zero fill right shift):</b> the left operand's value is moved right by the number of bits specified by the right operand and shifted values are filled with zeros.

### Logical operators
- <b>&& (logical and):</b> true if both operands are true.
- <b>|| (logical or):</b> true if either of the operands are true.
- <b>! (logical not):</b> true if the operand is false.

### Assignment operators
- <b>= (assignment)</b> assigns values from right side operands to the left operand.
    ``` java
    int a;
    a = 10; // assigns value 10 to a
    ```
- <b>+= (add and assignment)</b> add right operand to the left operand and assigns the resulting value to the left operand.
    ``` java
    int a = 10, b = 20;
    a += b; // same as a = a + b, a now equals 30
    ```
- <b>-= (subract and assignment) </b> subtracts right operand from the left operand and assigns the resulting value to the left operand.
    ``` java
    int a = 20, b = 10;
    a -= b; // same as a = a - b, a now equals 10
    ```
- <b>*= (multiply and assignment) </b> multiplies both operands and assign the resulting value to the left operand.
    ``` java
    int a = 5, b = 2;
    a *= b; // same as a = a * b, a now equals 10
    ```
- <b>/= (divide and assignment) </b> divides the left operand by the right operand and assign the resulting value to the left operand.
    ``` java
    int a = 6, b = 2;
    a /= b; // same as a = a / b, a now equals 3
    ```
- <b>%= (modulus and assignment) </b> divides left operand by the right operand and assigns the remainder to the left operand.
    ``` java
    int a = 5, b = 2;
    a %= b; // same as a = a % b, a now equals 1
    ```
- <b><<= (left shift and assignment)</b>
- <b>>>= (right shift and assignment)</b>
- <b>&= (bitwise AND and assignment)</b>
- <b>^= (bitwise exclusive OR and assignment)</b>
- <b>|= (bitwise inclusive OR and assignment)</b>

### Other operators
- <b>Conditional / ternary operator (? :)</b>
    - Operates on 3 operands.
    - Used to evaluate boolean (truth) operations.
    - Used to decide which operand should be assigned based on the condition.
    - First operand is a boolean expression (a condition which evaluates either to true or false).
    - Second operand is the return if the first operand evaluates to true.
    - Third operand is the return if the first operand evaluates to false.
    - Syntax ```varible x = (boolean expression) ? value_if_true : value_if_false; ```
    - Example:
        ``` java
        int a = 10, b;
        b = (a == 1) ? 20 : 30; // condition is false, assigns 30 to b
        b = (a == 10) ? 20 : 30; // condition is true,  assigns 20 to b
        ```

## Decision making
- Decision making constructs in Java are
    - ```if```, ```else if```, ```else```
    - ```switch ... case```
- ```if``` is used to check a condition and run statement(s) if the condition is true.
    ``` java
    int c = 20;
    if (c == 20)
        System.out.print("c equals 20"); // this condition will execute because condition c == 20 is true.
    
    if (c < 10)
        System.out.print("c is less than 10"); // this statement will not execute because the condition c < 10 is false.
    ```
- To execute more than one statement if a condition is true, enclose the statements in curly braces after the condition.
    ``` java
    int c = 20;
    if (c == 20) {
        System.out.println("c is equal to 20");
        System.out.println("it means c is equal to 20");
    }
    ```
- To do something if the condition is false, use ```else``` after the statements of ```if```
    ``` java
    int c = 20;
    if (c == 20) {
        System.out.println("c is 20");
    } else {
        System.out.println("c is not 20");
    }
    // you can use curly braces even if there is only one statement
    ```
- Use ```else if``` if you want to check more than one condition.
    ``` java
    int a = 10;
    if (a == 0) {
        System.out.println("a is zero");
    } else if (a > 0) {
        System.out.println("a is positive");
    } else { // else block execute if no other conditions are true
        System.out.println("a is negative");
    }
    ```
    > Note: It's good practice to always have an ```else``` when using ```else if```
- An ```if``` construct can be nested inside another ```if``` construct.
    ```java
    int a = 4;
    if (a == 0) {
        System.out.println("a is zero");
    } else {
        if (a > 0) {
            System.out.println("a is positive");
        } else {
            System.out.println("a is negative");
        }
    }
    ```
- A ```switch``` is used when a value of a variable needs to be checked against several other values for equality.
    ``` java
    int dayDigit = 4;
    String day;

    switch (dayDigit) {
        case 1:
            day = "Sunday";
            break;
        case 2:
            day = "Monday";
            break;
        case 3:
            day = "Tuesday";
            break;
        case 4:
            day = "Wednesday";
            break;
        case 5:
            day = "Thursday";
            break;
        case 6:
            day = "Friday";
            break;
        case 7:
            day = "Saturday";
            break;
        default:
            day = "invalid";
    }
    // day will be set to "Wednesday"
    ```
- A ```break;``` statement is required in most cases to stop the execution from moving to the next case.
- A ```default``` case is used to deal with all other values that's not matched in any of the ```case```s.

## Iteration (Loops)
- Loops are used to repeat part of the program more than once.
- For example going through a collection (like arrays) or reading lines from a file.
- There are 4 types of loops in Java.
    1. for
    2. Enhanced for (foreach)
    3. while
    4. do .. while

### The ```for()``` loop
- A ```for``` loop is used when repeating part of the program for a known number of times.
- For example going through a collection (like arrays).
- The parenthesis (round brackets) of a for loop has three parts separated by semicolon.
    1. Initialization of the variables used as the iteration control.
    2. The condition on which the loop will run. (The loop will iterate until this condition becomes false)
    3. Increment/decrement of the variable used as the loop control.
- The syntax:
    ``` java
    for ( initilization ; condition ; increment/decrement)
        loop_body
    ```
- Example
    ``` java
    for (int i = 0; i < 10; i++)
        System.out.println("Line " + i);
    ```
    1. ```i``` is declared and initialized to 0, this happens only at the beginning of the loop.
    2. the condition is checked, if it's ```true``` the body of the loop executes.
    3. increment/decrement statement runs (```i++```)
    4. steps 2 and 3 keeps running until the condition becomes ```false```.
- More than one statement can be written inside the loop body by enclosing the body in curly braces, and curly braces can be used even if there is only one statement.
    ``` java
    int count = 0;
    for (int i = 0; i < 10; i++) {
        System.out.println("Line " + 1);
        count++;
    }
    // count equals 10
    ```

### The enhanced ```for()``` loop
> This loop was never taught in class

- The enhanced ```for``` loop is sometimes referred to as foreach loop.
- This loop provides an easy and elegant way to go through the elements of Java collections (like arrays) without having to deal with loop control variables.
- Syntax
    ``` java
    for (data_type variable : collection)
        loop_body
    ```
- The first part declares a variable of the type of one element in the collection. For example if the collection is an array of Strings, the variable should be of type ```String```. The loop will assign an item from the collection in every iteration. So inside the loop body, you can just access the item using that variable.
- Second part is the collection itself and the body is just like the normal ```for``` loop.
- Example:
    ``` java
    String[] names = new String[5];
    names[0] = "Ahmed";
    names[1] = "Mohamed";
    names[2] = "Ali";
    names[3] = "Aminath";
    names[4] = "Aishath";

    for (String name : names) {
        System.out.println(name);
    }
    ```
- The output:
    ```
    Ahmed
    Mohamed
    Ali
    Aminath
    Aishath
    ```

### The ```while()``` loop
- The ```while``` loop is generally used when you don't know how many times the loop will run.
- For example, when going through the lines of a file one by one, you wouldn't know how many lines the file will contain.
- Inside the parenthesis of the ```while``` loop is a boolean (a condition which evaluates to ```true``` or ```false```).
- Syntax
    ``` java
    while ( condition )
        loop_body
    ```
- Example
    ``` java
    // the following loop should stop when the value
    // of i becomes equal or greater than 5
    int i = 0;
    while (i < 5) {
        System.out.println("Value of i is " + i);
        i++;
    }
    // for this kind of loops, a for loop is better
    ```
- Another example
    ``` java
    String aboutYear = "There are 365 days in a normal year and each day has 24 hours and 1 hour is 60 minues and 1 minute is 60 seconds.";
    Scanner s = new Scanner(aboutYear);

    while (s.hasNext()) { // checks if the Scanner has any values left
        System.out.println(s.nextInt()); // gets the next integer value from the string
    }
    // the loop ends at the end of the String aboutYear.
    ```
- In this example, (assuming the String ```aboutYear``` would be populated during runtime) we don't know how long the String ```aboutYear``` would be.
- The output
    ```
    365
    24
    1
    60
    1
    60
    ```

### The ```do .. while()``` loop
- ```do .. while``` loop is not too different from the ```while``` loop.
- The only difference is that the condition is checked at the bottom, that is after executing the body of the loop.
- So this loop is guaranteed to run at least once, regardless of the condition.
- Syntax
    ``` java
    int i = 0;
    do {
        System.out.println("Value of " + i);
        i++;
    } while (i < 5);
    // notice the semicolon after the condition
    ```
- Curly braces have the same rule as the other loops.

## Arrays
- An array is a collection of the same type of values, that is all the elements of an array are of the same type.
- An array has a fixed size which cannot be changed after declaring.
- Each element in the array has an index.
- The index of the first element is 0.
- The index of the last element is the size of the array minus 1.
- Declaration syntax:
    ``` java
    String[] words;
    words = new String[100];
    ```
    - In this example ```String[]``` is the data type just like any other variable declaration in Java (call it a String array).
    - ```words``` is the name of the array.
    - ```new``` operator is used to create an array.
    - The size of the array is written inside square brackets after the data type. Here it's 100.
    - The indices of ```words``` array goes from 0 to 99.
- Usually array declaration and assigning an array to the array variable is done in 1 line.
    ``` java
    int[] a = new int[10];
    ```
- Individual elements of an array is accessed using the index number of the elements.
    ``` java
    int[] a = new int[10];

    a[0] = 0; // assign value 0 to the first element of the array (element at index 0)
    a[8] = 90; // assign value 90 to the ninth element of the array (element at index 8)
    ```
- It's very easy to access individual elements of an array using a ```for``` loop or the enhanced
    ``` java
    int[] a = new int[10];
    for (int i = 0; i < 10; i++) {
        a[i] = i;
    }

    for (int b : a) {
        System.out.println(b);
    }
    ```
    The output
    ```
    0
    1
    2
    3
    4
    5
    6
    7
    8
    9
    ```
- Array is an object, so it has some properties and methods which you can access using the dot (.) operator.
- For example to get the size (number of elements) of an array, use the ```length``` property.
    ``` java
    int[] weekDays = new int[7];
    System.out.println("The size of array is " + weekDays.length);

    for (int i = 0; i < weekDays.length; i++) { // use in the condition in for loops
        // do something
    }
    ```
> Arrays can also be defined like this ```int a[] = new int[10];```
> <br> This syntax is supported in Java just to help programmers who come from C/C++, because that is the syntax used in C/C++. It is encouraged not to use this syntax.



# Objects and Classes
## Introduction to Object Oriented Programming
- Object-oriented programming (OOP) is the dominant programming paradigm (method/style) these days.
- Java is object-oriented, to be productive in Java, you hava to be familiar with OOP.
- An OO program is made of objects.
- Each object has a specific functionality exposed to users (programmers who use the object).
- How the object is implemented is not important for the users of the object.
- OOP deals with data and objects first and then focuses on how to implement the programming logic.

### Classes
- A class represents a logical entity. For example a file in the filesystem or a database connection or even real life physical objects.
- For a better example, in an order-processing system, classes can be
    - Item
    - Order
    - ShippingAddress
    - Payment
    - Account
- A class binds the properties and the functionality of an object.
- A class is the template or blueprint from which objects are made.
- Properties or attributes are called ```fields``` and functions or behaviour are called ```methods``` in Java.
- A class is a data type in Java.

### Objects
- Simply put, an object is an instance or a variable of a class.
- Java objects has 3 key characteristics.
    1. object's <i>behaviour</i>
    2. object's <i>state</i>
    3. object's <i>identity</i>
    ``` java
    String name = "Richard Stallman";
    Scanner scanner1 = new Scanner(System.in);
    ```
    in the above example ```name``` is an instance or object of ```String``` (you can say ```name``` is a ```String```). ```scanner1``` is an object of ```Scanner```. so ```scanner1``` is a ```Scanner```.

### Object-oriented Concepts
1. **Abstraction**
    - Abstraction is, giving more importance to how something can be used instead of how the same thing is implemented.
    - An analogy: we don't have to know how the buttons and the chips inside a TV remote are wired from inside. But we can still use the remote using the button provided.
    - In Java, things like objects, classes and varibles provide this usability without necessarily knowing the underlying implementation of these things.

2. **Encapsulation**
    - Preventing direct access to properties or fields of an object;
    - and providing access to these properties through public methods.
    - A simple analogy to this can be explained using a person. We cannot go into his body and directly change how angry or how happy he is. But we use a public method (like talking to him) to change his mood.

3. **Inheritance**
    - Inheritance extending the features of an already existing class without affecting that class.
    - If you find a class that has most of the features you want, you can just extend that class and add the features you want, to your own class. Then your class will have all the features of that class plus the features you added to your class.

4. **Polymorphism**
    - Polymorphism is the ability to present the same thing in different forms in different contexts.
    - An analogy: two brothers working in the same office will be colleagues at office and brothers when they are at home. The same thing in different forms when applied in different contexts.
    - Two types of polymorphism in Java;
        1. Method overloading
            - Having more than one method with the same name (in the same class).
            - The methods differ by the type or the number of paremeters passed to it.
            - When polymorphism is applied, the same method is called with different parameters (different contexts).
            - For example a class might have a ```sum(int a, int b)``` method and another ```sum(double a, double b)``` method.
            - The user of the class does not have to worry about which method to use with which data type. The right method will be chosen based on the parameters supplied.

        2. Method overriding
            - Method overriding is the concept of overriding the functionality of a parent class in the subclass.
            - In this case, the method has the same name and the same parameters (types and numbers of parameters alike).
            - For example there maybe a class for a Database connection written for an MS Access database. You find that all methods of that class can be used to work with a MySQL database, and you also find that you only need to change the ```connect()``` method to make it work. So you extend the Database class and override the ```connect()``` method and write code that will connect to a MySQL database instead of MS Access.
            - When polymorphism is applied to the above example, 2 classes with the same methods can be used to work with 2 types of databases. No method calls have to be changed when switching to the new type of database.
    > Note: Polymorphism in Java is not limited to only these two types. There are other ways Java utilizes this concept.

## Using Existing Classes
### String Class
- ```String``` class can be found in the ```java.lang``` package.
- There are numerous methods in this class to work with and manipulate strings.
    - ```length()``` method returns the length (the number of characters) of a string.
        ``` java
        String name = "Albert Einstein";
        System.out.println(name.length()) // prints 15
        ```
    - ```toUpperCase()``` method returns a new string with all the characters of the string converted to all capital letters.
        ``` java
        String name = "Steve Jobs";
        System.out.println(name.toUpperCase()); // prints STEVE JOBS
        ```
    - ```toLowerCase()``` method returns a new string with all the characters converted into lowercase letters.
        ``` java
        String name = "Larry Page";
        System.out.println(name.toLowerCase()); // prints larry page
        ```
    - ```concat()``` method returns a new string after joining "this" string with the string passed as an argument to the method.
        ``` java
        String firstName = "Bill";
        String lastName = "Gates";
        System.out.println(firstName.concat(lastName)); // prints BillGates
        ```
    - ```charAt()``` method returns a single character from the string at the specified position. Positions start from 0, just like array indexes.
        ``` java
        String name = "Satya Nadella";
        System.out.println(name.charAt(3)); // prints y
        ```
    - ```compareTo()``` method compares "this" string to the string thats passed as the argument. If it is exactly same, this method returns 0, otherwise it returns an integer representing the difference between the 2 strings. This method compares strings with case sensitivity.
        ``` java
        String name1 = "Mark";
        String name2 = "Mark";
        String name3 = "Zuckerberg";
        System.out.println(name1.compareTo(name2)); // prints 0
        System.out.println(name2.compareTo(name3)); // prints -13
        ```
    - ```compareToIgnoreCase()``` method is similar to ```compareTo()``` method. The difference is that this method returns 0 even if the two strings have different case (case insensitive).
        ``` java
        String name1 = "Mark";
        String name2 = "mArK";
        System.out.println(name1.compareToIgnoreCase(name2)); // prints 0
        ```
    - ```indexOf()``` method returns the first position of a single character in the string. The position starts from 0. Returns -1 if the character is not found in the string.
        ``` java
        String name = "Linus Torvalds";
        System.out.println(name.indexOf('s')); // prints 4
        System.out.println(name.indexOf('x')); // prints -1
        ```
    
### Java ```Math``` class
- Provides more advanced mathematical calculations.
- ```Math``` is location in ```java.lang``` package.
- All methods in this class are static (do not have to create an object of the class to invoke the methods).
- Methods
    - ```abs()```: finds the absolute value (without + or - sign)
        ``` java
        System.out.println(Math.abs(-10)); // 10
        System.out.println(Math.abs(30)); // 30
        ```
    - ```cbrt()```: computes cubic root of a number
        ``` java
        System.out.println(Math.cbrt(64)); // 4
        ```
    - ```sqrt()```: computes sqare root of a number
        ``` java
        System.out.println(Math.sqrt(9)); // 3
        ```
    - ```pow()```: computes power of a number
        ``` java
        System.out.println(Math.pow(2, 3)); // 2x2x2 = 8
        ```
    - ```ceil()```: returns the value rounded up to the nearest integer
        ``` java
        System.out.println(Math.ceil(3.4)); // 4
        System.out.println(Math.ceil(3.5)); // 4
        ```
    - ```floor()```: returns the value rounded down to the nearest integer
        ``` java
        System.out.println(Math.floor(3.5)); // 3
        ```
    - ```random()```: returns a random number
        ``` java
        System.out.println(Math.random()); // a random number between 0 and 1
        ```
    - ```max()```: returns maximum among 2 numbers
        ``` java
        System.out.println(Math.max(3, 4)); // 4
        ```
    - ```min()```: returns minimum among 2 numbers
        ``` java
        System.out.println(Math.min(3, 4)); // 3
        ```

## Building Your Own Classes
### Access Modifiers: ```private```, default, ```protected```, ```public```
- There are 4 access modifiers under Java.

| Modifier | class | package | sub class | world |
| --- | --- | --- | --- | --- |
| private | o | x | x | x |
| default | o | o | x | x |
| protected | o | o | o | x |
| public | o | o | o | o |

#### 1. private
- Syntax: ```private int a;```
- ```private``` variables are accessible only inside of the class.

#### 2. default
- Syntax: ```int a;```
- Default is when no other access modifiers are applied explicitly.
- Default variable can access or modify under class or package.

#### 3. protected
- Syntax: ```protected int a;```
- Protected variables are accessible inside of class, package and sub class.

#### 4. public
- Syntax: ```public int a;```
- Public variables can be accessed from anywhere.

## Methods (functions) / Recursive Methods
### Method
- A function in Java is called a method because any function in Java belongs to some object of a class or the class itself.
- A set of statements which is enclosed in a block.
- A method has a return type. A method with no return type show be defined as void.
- A method can accept 0 or more arguments as data that the method need to do it's function.
- Syntax:
    ```
    access_modifiers return_type methodName(data_type arg1, data_type arg2) {
        method body;
    }
    ```
- Methods are divided into 4 categories
    1. No argument, no return
    2. No argument with return
    3. Argument, no return
    4. Argument with return

### Recursion
- Recursion is a process in which a method calls itself.
- A method in Java that call itself is known as recursive method.

## Static fields and Methods
- A static field of a class has the following characteristics.
    1. There is only one copy of the static field for all the objects of the class.
    2. It's a shared memory location.
    3. A static field can be accessed without reference to an object of the class.
- A static method also does not belong to the objects of a class but rather the class itself.
- A static method can be invoked without reference to an object (like all the methods in the Math class).
- To create a static variable or method, use the ```static``` keyword before the data type of the variable or the return type of the method.
- Example:
    ``` java
    public static double PI = 3.142; // type double
    
    public static int sum(int a, int b) { // return type int
        return a + b;
    }
    ```

## Method Parameters
## Object Construction
- A constructor is used to construct a new object.
- A constructor is a special method whose pupose is to construct and initialize objects.
- Example: an object of ```Scanner``` can be constructed and assigned to a varible of type ```Scanner``` like this.
    ``` java
    Scanner s = new Scanner(System.in);
    ```
    - On the left side of the equal is the declaration of the a variable of type ```Scanner```.
    - On the right side is the object construction statement and the newly created ```Scanner``` object is assigned to variable ```s``` which is of type ```Scanner```.
    - ```new Scanner(System.in)``` uses the ```new``` operator followed by one of the constructors in the ```Scanner``` class. This particular constructor accepts an ```InputStream``` object (```System.in```) as a parameter.
    - There are other constructors in the ```Scanner``` class like the one which accepts a ```String``` object as its parameter.
- A constructor has exactly the same name as the class and has no return type (a constructor always returns an object of that class).
- If you do not define a constructor explicitly, Java defines a default constructor for you.
- The default constructor does not accept any parameters.
- Constructor is executed at the time of object creation.

## Packages
- Java allows grouping of classes in packages.
- Helps organizing classes.
- Prevents name conflicts with classes from library packages and other packages.
- Standard Java library has a number of packages. Example: ```java.lang```, ```java.util```, ```java.io```
- A package groups classes, interfaces and sub packages.
- Can be considered as data encapsulation.

### Built-in packages
- ```java.lang``` contains language support classes. This package is imported automatically (no import declaration required).
- ```java.io``` contains classes for input and output operations.
- ```java.util``` contains data structures and date-time operations. The familiar ```Scanner``` class is in this package.
- ```java.applet``` contains classes for applet programming.
- ```java.awt``` contains classes for GUI programming.

## Documentation Comments
- There are 3 types of comments in Java
    1. Single line ```//```
        <br>Example:
        ``` java
        // System.out.println("this line will not execute");
        ```
    2. Multiline ```/* ... */```
        <br>Example:
        ``` java
        /*
        System.out.print("Following lines ");
        System.out.print("will not");
        System.out.print(" execute");
        */
    3. Documentation comments ```/** ... */```
        - ```javadoc``` is a tool which comes with JDK and it is used for generating java code documentation in HTML format from the Java source code.

        - **Tags Used**<br>
        ```@author```: author of class<br>
        ```@code```: display text in code font<br>
        ```@docRoot```: relative root path<br>
        ```@exception```: possible chances of Exception<br>
        ```@inheritDoc```: inherit a comment from nearest inheritable class<br>
        ```@link```: link to the documentation
        - Example:
            ``` java
            /**
             @author James Gosling
             @exception ArithmeticException
             */
            public double divide(int a, int b) {
                return a / b;
            }
            ```
## Class Design Hints
### 1. Always keep data private
- When you are creating complex programs using classes, data items must be private.
- You may need to write an accessor or mutator method occassionally, but you are still better off keeping instance fields private.
- When data are kept private, changes in their representation do not affect ther user of class.

### 2. Always initialize data
- Java won't initialize local variables for you. But it will initialize instance fields of objects.
- Don't rely on the defaults, but initialize the varibales expressively either by supplying a default or by setting default values in the constructor.

### 3. Don't use too many basic data types
- The idea is to replace multiple related uses of basic types with other classes.
- This keeps your class eacy to understand.
- Example: replace the following as a customer class.
    - String street
    - String city
    - String island
    - String state
    - String postalCode

### 4. Use a standard form for class definition
- The main contents of classes are
    - public features
    - package scope
    - private fearture
    - instance varibale (fields)
    - static methods
    - static fields

### 5. Break up classes with too many responsibilities
- If there is an obvious way to make one complicated class into 2 simpler classes.
- If a class has more tasks, it is easy to divide the class into sub classes.
- Then the complexity of the program will be minimized.

### 6. Make names of the classes and methods reflect their purpose
- Just as varibles should have meaningful names, so should classes and methods.
- A good rule is that a class name should be a noun (eg: Order), or a noun preceded by an adjective (eg: RushOrder).
- A method name should begin with lower case and the first letter of each subsequent word should be upper case.
- A method name is usually a verb (eg: getUnixTimestamp()).

# Inheritance

# Interfaces and Inner classes
## Interfaces
- An interface has the literal meaning, a way to interact with classes. The way is defined as methods in the interface.
- A Java interface is an abstract class which means the methods have no body.
- Example: 
    ``` java
    interface Animal {
        public void animalSound();
        public void run();
        public void start();
        public void round();
    }
    ```
- Interfaces are implemented by other classes.
- A class which ```implements``` interface must implement (write the body of) all the methods in the interface.
- An interface cannot be used to create objects (cannot contain a contructor). But it can be used as a data type (to declare variables).
- Interface attributes (fields) are public and static and final by default.

## Object cloning
- A way to create an exact copy of an object.
- The clone method ```clone()``` is used.
- ```java.lang.Clonable``` must be implemented by the class whose object we want to be clonable.
- If cloning is not supported, ```CloneNotSupportedException``` will occur.
- The clone method is inherited from the ```Object``` class.
- ```clone()``` method saves us from the trouble of creating an exact copy of the object.
- Object cloning is used to avoid extra processing when we create objects using the ```new``` operator.

## Inner classes (Nested classes)
- A class defined within another class is known as a nested or inner class.

### Advantages
- Logically groups classes that are used only in one place.
- Increases encapsulation.
- More readable and maintainable code.

## Proxies
# Exceptions and Debugging
## Dealing with Errors
- Erros that occur during runtime are called Exceptions.
- To deal with exceptions, use ```try .. catch .. finally``` blocks.

## Catching Exceptions

# Multithreading
## What are threads?
### The ```Thread``` class and ```Runnable``` interface
- You can create a thread program either by
    1. Extending the ```Thread``` class and override the ```run()``` method or
        ``` java
        class MyThread extends Thread {
            public void run() {
                // thread task here
            }
        }
    2. Implementing the ```Runnable``` interface and implement the ```run()``` method
        ``` java
        class MyThread implements Runnable {
            public void run() {

            }
        }
        ```
- Thread methods
    - ```getName()```: Get object name.
    - ```getPriority()```: Get object priority.
    - ```isAlive()```: Check if thread is still running or not.
    - ```run()```: Entry point to the thread.
    - ```start()```: Start a thread by using ```run()```.
    - ```sleep()```: Suspend a thread.

## Interrupting Threads
## Thread Properties
## Thread Piorities
## Selfish Threads
## Synchronization
- A way to ensure that a shared resource is used by only one thread a time.

## Deadlocks
## User interface programming with Threads
## Using pipes for communication between Threads