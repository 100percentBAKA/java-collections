# HashMap in Java

## Important Method in HashMap in Java

- `clear()`: Removes all of the mappings from this map.
- `clone()`: Returns a shallow copy of this HashMap instance; the keys and values themselves are not cloned.
- `compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)`: Attempts to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).
- `computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)`: If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null.
- `computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)`: If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value.
- `containsKey(Object key)`: Returns true if this map contains a mapping for the specified key.
- `containsValue(Object value)`: Returns true if this map maps one or more keys to the specified value.
- `entrySet()`: Returns a Set view of the mappings contained in this map.
- `get(Object key)`: Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
- `isEmpty()`: Returns true if this map contains no key-value mappings.
- `keySet()`: Returns a Set view of the keys contained in this map.
- `merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)`: If the specified key is not already associated with a value or is associated with null, associate it with the given non-null value.
- `put(K key, V value)`: Associates the specified value with the specified key in this map.
- `putAll(Map<? extends K, ? extends V> m)`: Copies all of the mappings from the specified map to this map.
- `remove(Object key)`: Removes the mapping for the specified key from this map if present.
- `size()`: Returns the number of key-value mappings in this map.
- `values()`: Returns a Collection view of the values contained in this map.

## Problems

## Find Occurrences

```java
    public static Map<Integer, Integer> findOccurences(Integer[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(Integer element : arr) {
            if(map.containsKey(element)) {
                Integer frequency = map.get(element);
                map.put(element, frequency + 1);
            }
            else {
                map.put(element, 1);
            }
        }

        return map;

```

## Find Occurrences

```java
    public static <T> Map<T, Integer> findOccurrences2(T[] arr) {
            Map<T, Integer> map = new HashMap<>();

            for(T element: arr) {
                map.put(element, map.getOrDefault(element, 0) + 1);
            }

            return map;
    }
```

## Find first non repeating Character

```java
    public static void findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        String cleanedStr = str.trim();

        for(int i = 0; i < cleanedStr.length(); i++) {
            map.put(cleanedStr.charAt(i), map.getOrDefault(cleanedStr.charAt(i), 0) + 1);
        }

        for(Map.Entry<Character, Integer> element: map.entrySet()) {
             if(element.getValue() == 1) {
                 System.out.println(element.getKey());
                 break;
             }
        }
    }
```

## Find word patterns

```java
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                map.put(ch, word);
            }

            if (reverseMap.containsKey(word)) {
                if (reverseMap.get(word) != ch) {
                    return false;
                }
            } else {
                reverseMap.put(word, ch);
            }
        }

        return true;
    }

    ---------------------
    Time complexity: O(N)  N --> length of the pattern
    Space complexity: O(M) M --> number of unique words
    ---------------------
```

```java
    Test-cases:

    Input: pattern = "abba", str = "dog cat cat dog"
    Output: true

    Input: pattern = "aaaa", str = "dog cat cat dog"
    Output: false
```

## Subarray Sum Equals K (continuous)

```java
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;

        Map<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0, 1);

        for (int num : nums) {
            sum += num;

            if (sumCountMap.containsKey(sum - k)) {
                count += sumCountMap.get(sum - k);
            }

            sumCountMap.put(sum, sumCountMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    ---------------------
    Time complexity: O(N)
    Space complexity: O(N)
    ---------------------
```

## Longest Subarray (Length) with equal no of 0s and 1s

```java
    public static int longestSubarrayWith0and1 (Integer[] arr) {
        int currentSum = 0;
        int maxLength = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            currentSum += (arr[i] == 0) ? -1 : 1;

            if(map.containsKey(currentSum))
            {
                maxLength = Math.max(maxLength, i - map.get(currentSum));
            }
            else {
                map.put(currentSum, i);
            }
        }

        return maxLength;
    }

    ---------------------
    Time complexity: O(N)
    Space complexity: O(N)
    ---------------------

```
