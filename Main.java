//Elena Voinu
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        // create an array with 5 number the user inputs
        int [] numArray = getNumbers(5);
        
        int[] sorted = sortArray(numArray);
        printArray(sorted);
        
    }
    // get the numbers from the user
    public static int[] getNumbers(int num){
        int [] values = new int[num];
        System.out.println("Enter " + num + " numbers");
        
        for(int i = 0; i< values.length; i++){
            //populate the array with the user's input, assuming only integers are entered
            values[i] = sc.nextInt();
        }
        return values;
    }
    public static void printArray(int[]array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contains " + array[i]);
        }

    }
    public static int[] sortArray(int[] array){
        /* built in java way to sort an array
        * int sorted[] = Arrays.copyOf(array, array.length)
        * */
        int [] sorted = new int[array.length];
        
        for(int i = 0; i < array.length; i ++){
            //create a copy of array and save it into the sorted array
            sorted[i] = array[i];
        }
        boolean flag = true;
        int temp;
        //sort the  array
        while(flag){
            flag = false;
            for(int i = 0; i< sorted.length-1; i++){
                if(sorted[i] < sorted[i+1]){
                    //swap the the elements
                    temp = sorted[i];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sorted;
    }
}
