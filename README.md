

# 🧪 Java Testing & JUnit (Complete Guide + Implementation)

## 📌 Introduction
This repository showcases my complete learning and hands-on implementation of **Software Testing in Java**, focusing on:

- Unit Testing fundamentals
- Manual vs Automated Testing
- JUnit 4 vs JUnit 5
- Assertions & Test Lifecycle
- Maven Integration (Surefire Plugin)
- Test-Driven Development (TDD)

This project reflects my practical understanding of writing clean, maintainable, and scalable test cases.

---

## 🧠 What is Software Testing?

Software Testing is the process of verifying and validating whether a software application:
- Works as expected ✅
- Is free from bugs ❌
- Meets user requirements 🎯

---

## 🔹 Types of Testing

- **Unit Testing** → Testing individual methods/classes
- **Integration Testing** → Testing combined modules
- **System Testing** → Testing complete system
- **Acceptance Testing** → Testing from user perspective

---

## 🧪 Unit Testing

Unit Testing focuses on testing **smallest testable parts of an application** (usually methods).

### ✅ Benefits:
- Early bug detection
- Improves code quality
- Simplifies debugging
- Supports refactoring

---

## ⚙️ Ways to Perform Testing in Java

### 🔸 1. Manual Testing (Without Framework)

```java
public class TestExample {
    public static void main(String[] args) {
        int result = add(2, 3);
        if(result == 5) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
```

### ❌ Limitations:
- No automation
- No reporting
- Hard to maintain

---

### 🔸 2. Automated Testing using JUnit + Maven

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }
}
```

### ✅ Advantages:
- Automated execution
- Clean structure
- Easy debugging
- Industry standard

---

## ⚖️ Manual Testing vs JUnit

| Feature            | Manual Testing | JUnit |
|------------------|--------------|------|
| Automation        | ❌ No        | ✅ Yes |
| Assertions        | ❌ No        | ✅ Yes |
| Reporting         | ❌ No        | ✅ Yes |
| Maintainability   | ❌ Low       | ✅ High |

---

## 🏷️ @Test Annotation (JUnit)

- Marks a method as a test case
- Comes from JUnit framework

```java
@Test
void testMethod() {
}
```

### 📜 History:
- JUnit 3 → No annotations
- JUnit 4 → Introduced `@Test`
- JUnit 5 → Enhanced with Jupiter API

---

## 🟢 Why Test Shows Green?

- ✅ Green → Test Passed
- ❌ Red → Test Failed

👉 By default, JUnit only checks for **failures**

---

## 🔍 Assertions in JUnit

Assertions are used to compare **expected vs actual results**.

```java
assertEquals(5, result);
assertNotEquals(4, result);
assertTrue(result > 0);
assertFalse(result < 0);
assertNull(nullValue);
assertNotNull(object);
```

---

## 📦 JUnit 5 (Jupiter API)

JUnit 5 consists of:

- **JUnit Platform** → Runs tests
- **JUnit Jupiter** → New programming model
- **JUnit Vintage** → Supports old JUnit tests

---

## 🧠 Assertions Class

```java
import static org.junit.jupiter.api.Assertions.*;
```

Common methods:
- `assertEquals()`
- `assertNotEquals()`
- `assertTrue()`
- `assertFalse()`

---

## ❗ assertNotEquals()

```java
assertNotEquals(10, result);
```

✔ Passes if values are NOT equal

---

## 🔁 Test Lifecycle Annotations

### 🔹 @BeforeEach & @AfterEach

```java
@BeforeEach
void setup() {
    System.out.println("Before each test");
}

@AfterEach
void teardown() {
    System.out.println("After each test");
}
```

✔ Runs before & after every test method

---

### 🔹 @BeforeAll & @AfterAll

```java
@BeforeAll
static void init() {
    System.out.println("Before all tests");
}

@AfterAll
static void destroy() {
    System.out.println("After all tests");
}
```

✔ Runs once for entire test class

---

## 🧬 @TestInstance Annotation

```java
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
```

### Types:
- `PER_METHOD` (default)
- `PER_CLASS`

✔ Controls lifecycle of test instances

---

## 🔧 Maven Surefire Plugin

Used to run test cases automatically during build.

```xml
<build>
    <plugins>
        <plugin>
            <artifactId>maven-surefire-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```

### ✅ Features:
- Runs all test cases
- Generates reports
- Integrates with CI/CD

---

## 🔁 Test-Driven Development (TDD)

### Steps:

1. Write Test Case ❌ (Fail)
2. Write Code ✅ (Pass)
3. Refactor 🔁

### ✔ Benefits:
- Better design
- Cleaner code
- Fewer bugs

---

## ✍️ Writing Effective Test Cases

### Structure:
```java
@Test
void methodName_condition_expectedResult() {
    // Arrange
    int a = 2, b = 3;

    // Act
    int result = a + b;

    // Assert
    assertEquals(5, result);
}
```

---

## 📁 Project Structure

```
project-root/
│
├── src/
│   ├── main/java/
│   └── test/java/
│       └── CalculatorTest.java
│
├── pom.xml
└── README.md
```

---

## 🛠️ Tech Stack

- Java ☕
- JUnit 5 (Jupiter)
- Maven
- IntelliJ / Eclipse

---

## 🎯 Key Learnings

- Writing clean and maintainable test cases
- Understanding JUnit lifecycle
- Using assertions effectively
- Automating tests using Maven
- Applying TDD approach in real projects

---

## 🚀 Future Improvements

- Add Integration Testing
- Use Mockito for mocking
- Add CI/CD pipeline (GitHub Actions)

---


