public class InsertionSort {
    
    public static int[] insertionSort(int[] inputArray) {
        
        int index;
        
        for(int i = 0; i < inputArray.length; i++) {
            
            //Select the number
            index = i;
            
            //Check numbers below the selected number
            for(int j = i; j > 0; j--) {
            
                if(inputArray[index] < inputArray[j - 1]) {
                    
                    //Swap and keep track of the selected number
                    HelperMethods.swap(inputArray, index, j - 1);
                    index = j - 1;
            
                }
            
            }

        }
        
        return inputArray;
        
    }
    
}
