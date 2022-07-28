package SortigAlgorithms;

public class Sorts {

    
    public static int[] bubbleSort(int[] array){
        int swapcount = 0;
        for(int i = array.length; i > 0; i--){
            for(int j = 0; j < i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapcount++;
                }
            }
            if(swapcount == 0){
                return array;
            }
            swapcount = 0;
        }

        return array;
    }

    public static int[] selectedSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int currentMin = i;
            for(int j = i+1; j<array.length; j++){
                if(array[currentMin] > array[j]){
                    currentMin = j;
                }
            }
            if(i != currentMin){
                int temp = array[i];
                array[i] = array[currentMin];
                array[currentMin] = temp;
            }
        }
        return array;
    }



    public static void main(String[] args){
        int[] array = {1100, 100, 4000, 3, 1, 7, 5, 10, 40, 20, 8};

        for(int n : selectedSort(array)){
            System.out.println(n);
        }
    }

}
