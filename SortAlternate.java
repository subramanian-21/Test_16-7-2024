import java.util.Arrays;

class SortAlternate{
    public static void main(String args[]){
        int[] arr = {13,2,4,15,12,10,5,3,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        
        bubble(arr, true);
        bubble(arr, false);
    }
    static void bubble(int[] arr, boolean descending){
        if(descending){
            for(int i = 0;i<arr.length;i+=2){
                for(int j = 0;j<arr.length;j+=2){
                    if(arr[i] > arr[j]){
                        swap(arr, i, j);
                    }
                }
            }
        }else{
            for(int i = 1;i<arr.length;i+=2){
                for(int j = 1;j<arr.length;j+=2){
                    if(arr[i] < arr[j]){
                        swap(arr, i, j);
                    }
                }
            }
        }
        
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}


    /**
     * 
     * 
     * int n = arr.length;
        int[] odd = new int[n/2+1];
        int[] even = new int[n/2];
        int oddInd = 0;
        int eveInd = 0;
        for(int i=  0;i<arr.length;i++){
            if(i%2 == 0){
                odd[oddInd] = arr[i];
                oddInd++;
            }else{
                even[eveInd] = arr[i];
                eveInd++;
            }
        }
        Arrays.sort(odd);
        Arrays.sort(even);
        oddInd = odd.length-1;
        eveInd = 0;
        for(int i = 0;i<arr.length;i++){
            if(i%2 == 0){
                arr[i] = odd[oddInd];
                oddInd--;
            }else{
                arr[i] = even[eveInd];
                eveInd++;
            }
        }
     */