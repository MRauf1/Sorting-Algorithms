public class CountingSort {
    
    public static int[] countingSort(int[] inputArray, int maxValue) {
        
        int inputLength = inputArray.length;
        int[] counterArray = new int[maxValue];
        
        //Fill the counter array with frequencies of the numbers
        //Index represents the number. Value represents the frequency.
        for(int i = 0; i < inputLength; i++) {

            counterArray[inputArray[i]] += 1;
            
        }
        
        int index = 0;
        
        //Sort the array
        for(int i = 0; i < maxValue; i++) {
            
            int valueCounter = counterArray[i];
            
            for(int j = 0; j < valueCounter; j++) {
                
                inputArray[index] = i;
                index++;
                
            }
            
        }
        
        return inputArray;
        
    }
    
}
