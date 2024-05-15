import java.util.Scanner;

public class binaryarr {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out .print("Enter array size: ");
        int x= sc.nextInt();
        int[] arr = new int[x];
        System.out .print("Enter a number: ");
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
       System.out .print("Search a number: ");
       int y= sc.nextInt();
       boolean flag =false;
       int start=0,end=x-1;

       while(start<=end){
        int mid =(start+end)/2;
        if(arr[mid]==y){
            System.out.println("Element found at pos" +(mid+1));
            flag = true;
            break;
        }else if(arr[mid]< x){
            start=mid+1;
        }else{
            end=mid-1;
        }
        }
        if(flag==false){
            System.out.println("Element not found");
        }
    }
}