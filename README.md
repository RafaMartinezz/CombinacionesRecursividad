# Recursive Combination Generator

This project is a simple Java exercise designed to practice **recursion** by generating unique combinations of a specified length from a list of strings. The program uses a recursive approach to ensure that each combination contains unique elements, without repeating any characters within a single combination.

## Table of Contents

- [Overview](#overview)
- [Purpose](#purpose)
- [Features](#features)
- [Usage](#usage)
- [Example Output](#example-output)
- [Explanation](#explanation)

---

## Overview

The `combinar` method recursively generates all possible combinations of a specified length from a list of strings. For instance, given a list `["0", "1", "2"]`, the program can generate all unique 2-character or 3-character combinations, avoiding repeated elements within each combination.

## Purpose

This project is a **learning exercise** focused on practicing recursion in Java. It demonstrates how to:
- Use recursive methods to build combinations.
- Avoid repetitive characters within combinations by using labels to break out of nested loops.
  
## Features

- **Recursive Combination Generation**: Generates combinations of any specified length, ensuring that no character repeats within a single combination.
- **Dynamic Length Handling**: Accepts a length parameter to generate combinations of varying lengths, returning an empty list if the requested length is zero.

### Example Code Usage

The main method in `Main` runs the following sample calls:

```java
List<String> numeros = Arrays.asList("0", "1", "2");

System.out.println(combinar(3, numeros)); // Length 3 combinations
System.out.println(combinar(2, numeros)); // Length 2 combinations
System.out.println(combinar(4, numeros)); // Length 4 combinations (returns empty if length > list size)
System.out.println(combinar(1, numeros)); // Length 1 combinations
System.out.println(combinar(0, numeros)); // Length 0 combinations (returns empty)
```

## Example Output

```plaintext
[012, 021, 102, 120, 201, 210]
[01, 02, 10, 12, 20, 21]
[]
[0, 1, 2]
[]
```

## Explanation

- **Recursive Logic**: The `combinar` method builds combinations by reducing the length parameter with each recursive call.
- **Base Cases**:
  - **Length 0**: Returns an empty list, as there are no valid combinations of length zero.
  - **Length 1**: Returns the original list of elements, since single-element combinations are just the elements themselves.
- **Recursive Case**: For lengths greater than 1, the method builds combinations by appending characters to shorter combinations, while ensuring no character repeats in any single combination.
