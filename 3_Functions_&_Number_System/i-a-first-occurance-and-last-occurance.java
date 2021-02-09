import java.io.;
import java.util.;

public class Main {

    public static void main(String[] args) throws Exception {
         write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i  arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int ele = scn.nextInt();

        fandl(arr, ele);
    }
    
    public static int fandl(int[] arr, int ele) {
        int firstindex=-1,lastindex=-1;
        
        for(int idx=0;idxarr.length;idx++){
            if(arr[idx]==ele){
                if(firstindex==-1){
                    firstindex=idx;
                }
                lastindex=idx;
            }
        }
        
        System.out.println(firstindex + n + lastindex);
        
        return 0;

    }

}