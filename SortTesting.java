import java.lang.Math;

public class SortTesting {
    
    public static void main(String[] args) {
        
        int[] testArray = new int[100];
        
        for(int i = 0; i < testArray.length; i++) {
            testArray[i] = (int)(Math.random() * 1000);
        }
        
        int[] outputArray = BubbleSort.bubbleSort(testArray);
        
        for(int i = 0; i < outputArray.length; i++) {
            System.out.println(outputArray[i]);
        }
        
    }
    
}
