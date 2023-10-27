package HashSet;

import java.util.HashSet;

public class Problems {
    
    static Integer[] arr1 = {11, 20, 19, 18, 13, 7, 8, 9, 11, 13, 6, 21};

    static Integer[] arr2 = {12, 24, 15, 19, 23, 25};

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
