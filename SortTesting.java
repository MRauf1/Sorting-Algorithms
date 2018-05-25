import java.lang.Math;

public class SortTesting {
    
    private final static int SIZE = 100;
    private final static int MAX_VALUE = 1000;
    
    public static void main(String[] args) {
        
        //Initialize the testing array and fill it with random integers
        int[] testArray = new int[SIZE];
        
        for(int i = 0; i < testArray.length; i++) {
            
            testArray[i] = (int)(Math.random() * MAX_VALUE);
        
        }
        
        //Sort the array
        //int[] outputArray = BubbleSort.bubbleSort(testArray);
        //int[] outputArray = InsertionSort.insertionSort(testArray);
        //int[] outputArray = SelectionSort.selectionSort(testArray);
        //int[] outputArray = MergeSort.mergeSort(testArray, 0, testArray.length);
        int[] outputArray = CountingSort.countingSort(testArray, MAX_VALUE);
        
        //Print out the result
        for(int i = 0; i < outputArray.length; i++) {
        
            System.out.println(outputArray[i]);
        
        }
        
    }
    
}
