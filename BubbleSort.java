public class BubbleSort {
    
    public static int[] bubbleSort(int[] inputArray) {
        
        for(int i = 0; i < inputArray.length; i++) {
            for(int j = 0; j < (inputArray.length - i) - 1; j++) {
                if(inputArray[j] > inputArray[j + 1]) {
                    HelperMethods.swap(inputArray, j, j + 1);
                }
            }
        }
        
        return inputArray;
        
    }
    
}
