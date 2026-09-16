# DSA-java

Data Structures and Algorithms practice in Java. This repo is my working notebook as I go through DSA topic by topic — each file is a small, self-contained program with a `main` method you can run on its own.

## Topics covered

### Arrays
| File | What it does |
| --- | --- |
| `MultiDArraylist.java` | Multi-dimensional `ArrayList` usage |
| `ReverseArray.java` | Reversing an array in place |
| `Two_Dimention_Arrays.java` | 2D array basics and traversal |
| `TwoDarray/Search_In_Sorted_2D_Array.java` | Searching a row/column-sorted 2D matrix |

### Bit Manipulation
| File | What it does |
| --- | --- |
| `EvenOdd.java` | Even/odd check using the last bit |
| `Find_digit.java` | Finding the i-th bit / digit of a number |
| `magic_no.java` | N-th magic number |
| `UniqueNo.java` | Finding the non-repeating element using XOR |

### Recursion
| File | What it does |
| --- | --- |
| `Factorial.java` | Factorial |
| `Sum_of_digit.java` | Sum of digits |
| `ReverseNumber.java` | Reversing a number |
| `Palindrom.java` | Palindrome check |
| `No_ofZeros.java` | Counting trailing zeros |
| `Serease.java` | Series summation |
| `Array_is_Sorted.java` | Checking if an array is sorted |
| `Linear_Search.java` | Linear search, recursive |
| `Rotating_point_of_an_Sorted_Array.java` | Pivot in a rotated sorted array |
| `Bubble_Sort.java` | Bubble sort, recursive |
| `Seclection_Sort.java` | Selection sort, recursive |
| `MargeSort.java` | Merge sort |
| `QuickSort.java` | Quick sort |

### Searching
**Binary Search** — `BinarySearch.java`, `OrderAgnosticBS.java`, `Celing_of_Number.java`, `InfiniteArray.java`, `Rotation_number.java`, `Duplicate_Rotated_Array.java`

**Linear Search** — `Question1.java`, `Question2.java`

### Sorting
`Bubblesort.java`, `Selection_sort.java`, `Insertion_Sort.java`, `cycleSort.java`

### Misc
- `start.java` — starting point / scratch file
- `LeetCodeDebugging/Debugging.java` — scratch space for debugging LeetCode problems

## Project structure

```
DSA-java/
├── src/com/java/DSA/
│   ├── Arrays/
│   ├── Bitmanupulation/
│   ├── LeetCodeDebugging/
│   ├── Recursion/
│   ├── Searching/
│   │   ├── Binary_search/
│   │   └── linear_search/
│   ├── SortingAlgo/
│   └── start.java
├── DSA_JAVA.iml
├── qodana.yaml
└── sources.txt
```

## Running the code

Requires JDK 8 or later.

```bash
git clone https://github.com/HexaRiju/DSA-java.git
cd DSA-java

# Compile a single file
javac -d out src/com/java/DSA/Recursion/QuickSort.java

# Run it
java -cp out com.java.DSA.Recursion.QuickSort
```

Or open the folder in IntelliJ IDEA — the `.iml` file is included, so it should import as a project directly and you can run any file with the green arrow.

## Notes

- Built with IntelliJ IDEA; `qodana.yaml` is there for JetBrains' Qodana static analysis.
- Solutions favour readability over cleverness — the point is understanding the algorithm, not golfing it.

## Roadmap

- [ ] Linked Lists
- [ ] Stacks and Queues
- [ ] Trees and BSTs
- [ ] Graphs
- [ ] Dynamic Programming
- [ ] Time/space complexity notes per file
