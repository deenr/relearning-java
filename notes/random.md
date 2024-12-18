### Synchronized
- Used in multithreaded programs that execute the same function, when all need the same result e.g. Singleton.
```java
// -> synchronized method
// = slower because it forces all threads to wait 
public static synchronized Database getInstance() {
    if (instance == null) {
        instance = new Database();
    }
    return instance;
}

// to make it just a bit faster we can add the synchronized part just for the part that needs the waiting
// -> Double-Checked Locking
public static Database getInstance() {
    if (instance == null) { // First check
        synchronized (Database.class) {
            if (instance == null) { // Double-check
                instance = new Database();
            }
        }
    }
    return instance;
}
```