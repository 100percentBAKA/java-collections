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

## Problems

### Intersection of Lists

```java
    public static ArrayList<Integer> intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        for(Integer element: arr2) {
            if(arr1.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }
```

### Bubble sort of Lists

```java
    public static void bubbleSort (ArrayList<Integer> arr1) {
        for(int i = 0; i < arr1.size(); i++) {
            for(int j = 0; j < arr1.size() - (i + 1); j++) {
                if(arr1.get(j) > arr1.get(j + 1)) {
                    Integer temp = arr1.get(j);
                    arr1.set(j, arr1.get(j + 1));
                    arr1.set(j + 1, temp);
                }
            }
        }
    }
```

### Insertion sort of Lists

```java
    public static void insertionSort (ArrayList<Integer> arr) {
        for(int i = 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j = i - 1;

            while(j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }

            arr.set(j + 1, key);
        }
    }
```

### Reverse a List

```java
    public static ArrayList<Integer> reverseList (ArrayList<Integer> arr1) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = arr1.size() - 1; i >= 0; i--) {
            result.add(i);
        }

        return result;
    }
```

### Generate Sub Arrays

```java
    public static ArrayList <ArrayList <Integer>> generateSubArrays (ArrayList<Integer> arr) {

        ArrayList <ArrayList <Integer>> result = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                ArrayList<Integer> newArr = new ArrayList<>(arr.subList(i, j + 1));
                result.add(newArr);
            }
        }

        return result;
    }
```

### List of Sub Arrays equal to a given Sum

```java
    public static ArrayList <ArrayList <Integer>> list_of_subarray_equal_to_sum(ArrayList <ArrayList <Integer>> arr, int total) {
        ArrayList <ArrayList <Integer> > result = new ArrayList<>();

        for(ArrayList<Integer> element: arr) {
            int sum = 0;
            for(Integer number : element) {
                sum += number;
            }

            if (sum == total) {
                result.add(element);
            }
        }

        return result;
    }
```

## NOTE !!

### Removing duplicate in List

```java
    public static void remove_duplicates(ArrayList<Integer> arr) {

        int length = arr.size();
        for(int i = 0; i < length; i++) {
            for(int j =  i + 1; j < length; j++) {
                if(arr.get(j).equals(arr.get(i))) {
                    arr.remove(j);
                }
            }
        }
    }
```

This is not a valid program as the size of the array changes when we **remove()** an element leading to **IndexOutOfBoundException**
