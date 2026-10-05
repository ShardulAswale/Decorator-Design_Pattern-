# Decorator Design Pattern

Java demonstration of adding display behaviour around a currency object.

## How it works

Currency classes implement a shared `display()` method. A decorator stores another currency instance, calls its display method and appends additional output. The example compares plain and decorated currency displays.

## Usage

Requires a Java Development Kit. Run from the repository root:

```sh
javac -d out src/decorator/Decorator.java
java -cp out decorator.Decorator
```


## Notes

Currency values and decorator messages are illustrative; no exchange-rate calculation is implemented.
