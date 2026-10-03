# OOP

Small Java examples for learning object-oriented programming concepts. Each example is organized in its own Java package and can be compiled and run independently.

## Topics

- **Abstraction** — an abstract `Animal` class with `Cat` and `Dog` implementations.
- **Encapsulation** — an `Employee` class with private fields, getters, setters, and a method that copies values between objects.
- **Inheritance** — a `Father` → `Son` → `GrandSon` hierarchy, including inherited methods and method overriding.
- **Access modifiers** — examples of `public`, `protected`, package-private (default), and `private` access across two packages.

## Project structure

```text
.
├── AccessModifier/
│   ├── package1/       # A, B, and E
│   └── package2/       # Asub, C, and D
└── src/
    ├── Abstraction/    # Animal, Cat, Dog, Main
    ├── Encapsulation/  # Employee, Main
    └── Inheritance/    # Father, Son, GrandSon
```

The Java package declarations match the directory names. The project also includes Eclipse metadata (`.project`, `.classpath`, and `.settings/`); Eclipse is configured to use OpenJDK 26.

## Requirements

- A Java Development Kit (JDK), providing `javac` and `java`.
- Optionally, Eclipse IDE for Java Developers to import the project as an existing Eclipse project.

## Compile

From the repository root, compile all examples into `bin/`:

```sh
mkdir -p bin
javac -d bin $(find src AccessModifier -name '*.java')
```

`bin/` contains generated class files and is ignored by Git.

## Run an example

After compiling, run a class with a `main` method using its fully qualified name:

```sh
java -cp bin Abstraction.Main
java -cp bin Encapsulation.Main
java -cp bin Inheritance.GrandSon
java -cp bin package1.A
java -cp bin package2.C
```

Other access-modifier examples with entry points include `package1.B`, `package1.E`, `package2.Asub`, and `package2.D`.
