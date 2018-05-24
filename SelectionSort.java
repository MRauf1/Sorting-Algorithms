public class SelectionSort {
    
    public static int[] selectionSort(int[] inputArray) {
        
        int index = 0;
        
        for(int i = 0; i < inputArray.length; i++) {
            
            //Select the number
            index = i;
            
            //Find and select the lowest number
            for(int j = i; j < inputArray.length - 1; j++) {
            
                if(inputArray[index] > inputArray[j + 1]) {
                
                    index = j + 1;
                
                }
            
            }
            
            //Put the lowest numbers in the beginning
            HelperMethods.swap(inputArray, i, index);
        
        }
        
        return inputArray;
        
    }
    
}
