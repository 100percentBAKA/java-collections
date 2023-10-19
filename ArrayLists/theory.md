# ArrayList in Java

ArrayList is a class of the Java Collection framework implemented using List interface and provides the functionality of a 'DYNAMIC ARRAY'.

![](../Assets/img/ArrayList.webp)

## ArrayList Declaration

```java
ArrayList<String> arr = new ArrayList<> ();
```

**new** keyword is used to create a new object

**ArrayList<>** is a parameterized type

**()** represents a constructor call

## Important Method in ArrayList in Java

- **add(E element)**: Adds an element to the end of the ArrayList.

- **add(int index, E element)**: Inserts an element at the specified index in the ArrayList.
- **get(int index)**: Retrieves the element at the specified index.
- **set(int index, E element)**: Replaces the element at the specified index with a new element.
  remove(int index): Removes the element at the specified index.
- **remove(Object o)**: Removes the first occurrence of the specified element in the ArrayList.
- **size()**: Returns the number of elements in the ArrayList.
- **isEmpty()**: Checks if the ArrayList is empty.
  contains(Object o): Checks if the ArrayList contains a specified element.
- **clear()**: Removes all elements from the ArrayList.
- **indexOf(Object o)**: Returns the index of the first occurrence of the specified element.
- **lastIndexOf(Object o)**: Returns the index of the last occurrence of the specified element.
- **toArray()**: Converts the ArrayList to an array.
  addAll(Collection<? extends E> c): Appends all elements from the specified collection to the end of the ArrayList.
- **addAll(int index, Collection<? extends E> c)**: Inserts all elements from the specified collection into the ArrayList at the specified index.
  subList(int fromIndex, int toIndex): Returns a view of the portion of the ArrayList between the specified indices.
- **sort(Comparator<? super E> c)**: Sorts the ArrayList based on the provided Comparator.
- **retainAll(Collection<?> c)**: Removes all elements from the ArrayList that are not contained in the specified collection.
- **removeAll(Collection<?> c)**: Removes all elements from the ArrayList that are contained in the specified collection.
- **equals(Object o)**: Checks if the ArrayList is equal to the specified object.
