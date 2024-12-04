# Java Basics  

## Variables and Data Types  
- Java is statically typed: every variable must have a type.  
- Primitive types:

| Date type     | Size    | Value                                 |
|---------------|---------|---------------------------------------|
| **`boolean`** | 1 bit   | true / false                          |
| `byte`        | 1 byte  | -128 and 127                          |
| `short`       | 2 bytes | -32,768 to 32,767                     |
| **`int`**     | 4 bytes | -2 billion to 2 billion               |
| `long`        | 8 bytes | -9 quintillion to 9 quintillion       |
| `float`       | 4 bytes | up to 6-7 digits (`0.12345f`)         |
| **`double`**  | 8 bytes | up to 15 digits (`0.123456789012345`) |
| **`char`**    | 2 bytes | single char / letter / ascii (`f`)    |

- Reference types:

| Date type    | Size   | Value                                    |
|--------------|--------|------------------------------------------|
| **`String`** | varies | sequence of characters (`"Hello world"`) |


- What is the difference?

| Primitive                | Reference                    |
|--------------------------|------------------------------|
| Fixed amount (see above) | Unlimited (user defined)     |
| Stores data              | Stores an address            |
| Can only store one value | Can have more than one value |
| Uses less memory         | Uses more memory             |
| Fast                     | Slow                         |