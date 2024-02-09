import java.util.Arrays;

public class tst1{
    public static void main(String[] args){
        System.out.print("How are you");
        System.out.println("Swapping an array ");
        int [] arr = {1,2,3,34,5};
        System.out.println(Arrays.toString(swapping(arr,0,arr.length-1)));
    }
    static int [] swapping(int [] arr,int s,int e){
        if (s >= e) {
            return arr;
        }
        int temp = arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        swapping(arr,s+1,e-1);
        return arr;
    }
}