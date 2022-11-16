package Arrays;

public class ForEachExample {
    public static void main(String args[]) {
        int arr[] = { 1634, 8208, 9474 };
        int j = 0;
        int index = 0;
        for (int i : arr) {
            System.out.println(i);
            if (i == 9474)
                index = j;
            j++;
        }

        System.out.println("Element is found at index = " + index);
    }
}
