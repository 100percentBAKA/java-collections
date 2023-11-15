# ArrayList in Java

## Important Method in ArrayList in Java

- **boolean add(E e)**: It is used to add the specified element to this set if it is not already present.
- **void clear()**: It is used to remove all of the elements from the set.
- **Object clone()**: It is used to return a shallow copy of this HashSet instance: the elements themselves are not cloned.
- **boolean contains(Object o)**: It is used to return true if this set contains the specified element.
- **boolean isEmpty()**: It is used to return true if this set contains no elements.
- **Iterator<E> iterator()**: It is used to return an iterator over the elements in this set.
- **boolean remove(Object o)**: It is used to remove the specified element from this set if it is present.
- **int size()**: It is used to return the number of elements in the set.
- **Spliterator<E> spliterator()**: It is used to create a late-binding and fail-fast Spliterator over the elements in the set.

## Problems

### Intersection of two sets

```java
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> result = new HashSet<>();

        for(Integer element: set1) {
            if(set2.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }
```

### Find Duplicate

```java
    public static Set<Integer> findDuplicate(Integer[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for(Integer element: arr) {
            if(!uniqueElements.add(element)) {
                duplicateElements.add(element);
            }
        }

        return duplicateElements;
    }
```

### Union of two sets

```java
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);

        return result;
    }
```

### Remove Vowels

```java
    public static StringBuilder removeVowels(String input) {
        char[] chr = input.toCharArray();

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        StringBuilder result = new StringBuilder();

        for(char e : chr) {
            if(!vowels.contains(e)) {
                result.append(e);
            }
        }

        return result;
    }
```

## Note

The **contains()** method in the Set interface in Java has a time complexity of **O(1)** on average. This is because the Set interface is implemented using a HashMap or HashSet, which allows for **constant time** complexity for the contains() method.
