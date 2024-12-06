# **Java Cheat-Sheet**

## **Basic Syntax**
- **Print to Console**:  
```java
System.out.println("Hello, World!");
```

- **Main Method**:  
```java
public static void main(String[] args) {
    // Code here
}
```

## **Variables & Data Types**
- **Primitive Data Types**:
  - `int`: Integer numbers
  - `double`: Floating-point numbers
  - `char`: Single character
  - `boolean`: True/false value

```java
int num = 10;
double price = 19.99;
char letter = 'A';
boolean isTrue = true;
```

- **Non-Primitive**:  
```java
String name = "John";  // String is an object
int[] arr = {1, 2, 3};  // Array
```

## **Operators**
- **Arithmetic**: `+`, `-`, `*`, `/`, `%`
- **Relational**: `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical**: `&&`, `||`, `!`
- **Assignment**: `=`, `+=`, `-=`, `*=`, `/=`

```java
int sum = 5 + 10;  // 15
boolean result = (5 > 3);  // true
```

## **Math**
```java
int negativeValue = -25;

int absoluteValue = Math.abs(negativeValue) // 25

int squaredValue = Math.abs(absoluteValue) // 5

double randomNumber = Math.random() // random number between 0 and 1
```

## **Random**
```java
import java.util.Random;

int range = 10;
int start = 1;

int randomNumber = random.nextInt(range) + start;
```

## **Control Flow**
- **If-Else**:
```java
if (x > 5) {
    System.out.println("Greater than 5");
} else {
    System.out.println("Less than or equal to 5");
}
```

- **Switch**:
```java
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Invalid day");
}
```

- **Loops**:
  - **For Loop**:
  ```java
  for (int i = 0; i < 5; i++) {
      System.out.println(i);
  }
  ```
  - **While Loop**:
  ```java
  while (x < 5) {
      x++;
  }
  ```

## **Methods**
- **Method Declaration**:
```java
public static void methodName() {
    // Method body
}
```

- **Return Values**:
```java
public static int add(int a, int b) {
    return a + b;
}
```

- **Method Overloading**:
```java
public static void print(int num) {
    System.out.println(num);
}
public static void print(String text) {
    System.out.println(text);
}
```

## **Arrays**
- **Declaration and Initialization**:
```java
int[] arr = new int[5];  // Array with 5 elements
arr[0] = 10;
```

- **Enhanced For Loop**:
```java
for (int num : arr) {
    System.out.println(num);
}
```

## **Final keyword**
```java
final double pi = 3.14159;

pi = 3.1416; // not possible because the variable pi is final, so once set it can't be changed
```