package Arrays;

public class DeviationDemo {
    public static void main(String[] args) {

        // Initialize array
        int arr[] = new int[] { 750, 900, 800, 700, 950 };
        int sum = 0;
        int avg = 0;

        // Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
        avg = sum / arr.length;
        System.out.println("Avg is : " + avg);

        // Loop through the array to display the array elements
        int j = 1;
        for (int num : arr) {
            System.out.println("Student " + j + " Mark is :" + num);
            System.out.println("Deviation with mean is : " + (avg - num) + "\n");
            j++;
        }
    }
}
