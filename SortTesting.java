import java.lang.Math;

public class SortTesting {
    
    public static void main(String[] args) {
        
        //Initialize the testing array and fill it with random integers
        int[] testArray = new int[100];
        
        for(int i = 0; i < testArray.length; i++) {
            
            testArray[i] = (int)(Math.random() * 1000);
        
        }
        
        //Sort the array
        //int[] outputArray = BubbleSort.bubbleSort(testArray);
        //int[] outputArray = InsertionSort.insertionSort(testArray);
        //int[] outputArray = SelectionSort.selectionSort(testArray);
        int[] outputArray = MergeSort.mergeSort(testArray, 0, testArray.length);
        
        //Print out the result
        for(int i = 0; i < outputArray.length; i++) {
        
            System.out.println(outputArray[i]);
        
        }
        
    }
    
}
