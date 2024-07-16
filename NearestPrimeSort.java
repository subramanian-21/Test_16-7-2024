
import java.util.Arrays;

public class NearestPrimeSort {
    public static void main(String[] args) {
        int[] arr = {10,12,13,23,35};
        nearestPrimeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void nearestPrimeSort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                int iDiff = diffPrime(arr[i]);
                int jDiff = diffPrime(arr[j]);
                if(iDiff < jDiff){
                    swap(arr, i, j);
                }
                if(iDiff == jDiff && arr[i] < arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
    static  void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int diffPrime(int n){
        int minPrime = 0;
        int maxPrime = 0;

        for(int i = n;i>1;i--){
            if(isPrime(i)){
                minPrime = i;
                break;
            }
        }
        for(int i = n;i < n*2;i++){
            if(isPrime(i)){
                maxPrime = i;
                break;
            }
        }
        return Math.min(Math.abs(n-minPrime),Math.abs(n-maxPrime));
    }
    static boolean isPrime(int n){
        for(int i =2;i<n/2;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

}
