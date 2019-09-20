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

## Misconceptions About Java
### 6. I use XML, so I don't need Java
- Java is a programming language.
- XML is a way to describe data.
- XML can be processed in any programming language.
- Java API has excellent support for XML.


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
        b = (a == 10) ? 20 : 30; // condition is true,  assigns 30 to b
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

### The ```while()``` loop
### The ```do .. while()``` loop
## Arrays

# Objects and Classes