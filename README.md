# Calculator TDD

A simple Java calculator built following **Test-Driven Development (TDD)** principles.

## Tests

> 📸 Screenshot of test results.

<img width="600" alt="Screenshot From Tests" src="https://github.com/user-attachments/assets/91a69425-3024-49a8-9c1e-65774ed778e4" />

## Tech Stack

- Java 17
- Maven
- JUnit Jupiter 5.11.3

## Project Structure

```
CalculadoraTDDJava/
├── src/
│   ├── main/java/org/example/
│   │   ├── Calculator.java       # Core calculator logic
│   │   └── Main.java             # Entry point with console output
│   └── test/java/
│       └── CalculatorTest.java   # Full test suite
├── pom.xml
└── README.md
```

## Operations

| Method       | Description                              |
|--------------|------------------------------------------|
| `add`        | Adds two numbers                         |
| `subtract`   | Subtracts second operand from first      |
| `multiply`   | Multiplies two numbers                   |
| `divide`     | Divides first by second (throws on ÷ 0) |

## How to Run

### Run the application
```bash
mvn compile exec:java -Dexec.mainClass="com.calculator.Main"
```

### Run the tests
```bash
mvn test
```

---

*Built with TDD: tests were written before the implementation.*
