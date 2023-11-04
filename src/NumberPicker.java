import java.util.ArrayList;
import java.util.List;

//Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1
public class NumberPicker {
    
    public static void main(String[] args) {
        // int[] a = {1,1,2,2,4,4,5,5,5};
        int[] a = {4,6,5,3,3,1};
        //convert the above array to list
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            l.add(a[i]);
        }
        
        System.out.println(pickingNumbers(l));
    }

    public static int pickingNumbers(List<Integer> l){
        int subArrayLength = 0;
        for(int i=0; i<l.size(); i++){
            int count = 0;
            for(int j=0; j<l.size(); j++){
                if((l.get(i)-l.get(j))==1 || (l.get(i)-l.get(j))==0){
                    count++;
                }
            }
            if(count>subArrayLength){
                subArrayLength = count;
            }
        }
        return subArrayLength;
    }
}
