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
- Exists in popular IDEs.

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

## Decision making

## Iteration (Loops)

## Arrays

# Objects and Classes