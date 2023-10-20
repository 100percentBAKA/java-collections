package ArrayList;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class ArrayList_init {
    static ArrayList<Integer> arr_1 = new ArrayList<>();
    static ArrayList<Integer> arr_2 = new ArrayList<>();

    public static void initialize_list_with_random_values(ArrayList<Integer> arr1) {
        Random random = new Random();

        for(int i = 0; i < 5; i++) {
            arr1.add(random.nextInt(10 + 1));
        }
    }

    public static void initialize_list_with_random_values(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        Random random = new Random();

        for(int i = 0; i < 5; i++) {
            arr1.add(random.nextInt(10 + 1));
            arr2.add(random.nextInt(10 + 1));
        }
    }

    public static void display_list(ArrayList<Integer> arr1) {
        for(Integer element: arr1) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void display_list(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        for(Integer element: arr1) {
            System.out.print(element + " ");
        }

        System.out.println();

        for(Integer element: arr2) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void display_list_subarray (ArrayList <ArrayList <Integer>> arr) {
        for(ArrayList<Integer> element: arr) {
            System.out.println(element);
        }
    }

    public static ArrayList<Integer> intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        for(Integer element: arr2) {
            if(arr1.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }

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

    public static ArrayList<Integer> reverseList (ArrayList<Integer> arr1) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = arr1.size() - 1; i >= 0; i--) {
            result.add(i);
        }

        return result;
    }

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

    public static void occurences(ArrayList<Integer> arr) {
        int max = 0;
        int element = 0;

        for(int i = 0; i < arr.size(); i++) {
            int count = 1;
            for(int j = i + 1; j < arr.size(); j++) {
                if(Objects.equals(arr.get(i), arr.get(j))) {
                    count++;
                    element = arr.get(j);
                }
            }

            if(count > max) {
                max = count;
            }
        }

        System.out.println("Element " + element + " has occured " + max + " times");
    }


}

