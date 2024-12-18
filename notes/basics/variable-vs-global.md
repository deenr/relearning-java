### **General Scope Concepts**
1. **Local Scope**:  
   - Variables defined within a method or block.  
   - Accessible only within that method or block.  
   - Destroyed when the block is exited.

   ```java
   public void method() {
       int localVar = 10; // local scope
       System.out.println(localVar);
   }
   ```

2. **Instance Scope**:  
   - Variables declared in a class but outside of any method.  
   - They belong to the object and are accessed using the object instance.

   ```java
   class Human {
       String name; // instance scope
   }
   ```

3. **Static/Class Scope**:  
   - Variables defined with the `static` keyword.  
   - Belong to the class and shared by all objects.  

   ```java
   class Counter {
       static int count = 0; // static scope
   }
   ```

4. **Global Scope** (not in Java directly):  
   - Java does **not support global variables** in the traditional sense.  
   - Global-like behavior can be mimicked using `static` fields in a class.

   ```java
   class GlobalConfig {
       public static String appName = "MyApp"; // accessible everywhere
   }
   ```

---

### **Scope in the Context of OOP**
- **Encapsulation**:  
  OOP relies on scope to encapsulate data (e.g., private variables accessible only through getters/setters).

- **Inheritance**:  
  Scope determines whether inherited classes can access fields (`protected`, `public`).

- **Polymorphism**:  
  Method and variable scope dictate how overridden methods or fields are resolved.