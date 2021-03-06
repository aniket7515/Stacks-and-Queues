package StacksAndQueues;
import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        // Functionn solution

        // TO find the next greater element if there no greater element return -1


    }
    public static int[] solve(int[] arr){
        int[] nge=new int[arr.length];

        Stack<Integer> st= new Stack<>();

        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;

            }else{
                nge[i]=st.peek();
            }st.push(arr[i]);
        }
        return nge;
    }
}
