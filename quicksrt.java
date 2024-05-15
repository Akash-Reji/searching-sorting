import java.util.Scanner;

public class quicksrt {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int x = sc.nextInt();
        int[] a = new int[x];
        System.out.print("Enter element of array: ");
        for(int i=0;i<x;i++){
            a[i] = sc.nextInt();
        }
        //int[] a ={3,2,1,5,4,0};
        int lb=0,ub=a.length-1;
        quicksrtdemo(a,lb,ub);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
    public static void quicksrtdemo(int[] a,int lb,int ub){
        if(lb<ub){
            int pos = sort(a, lb, ub);
            quicksrtdemo(a,lb,pos-1);
            quicksrtdemo(a,pos+1,ub);
        }
    }
    public static int sort(int[] a,int lb,int ub){
        int start=lb;
        int end=ub;
        int pivot = start;
        while(start<end){
            while(a[start]<=a[pivot]){
                start++;
            }while(a[end]>a[pivot]){
                end--;
            }if(start<end){
                int temp = a[start];
                a[start]=a[end];
                a[end]=temp;
            }
        }
        int temp= a[pivot];
        a[pivot]= a[end];
        a[end]=temp;
        return end;
    }
}