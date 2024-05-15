import java.util.Scanner;

public class bubblesort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array: ");
        int x = sc.nextInt();
        int[] a = new int[x];
        for(int i=0;i<x;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<x-1;i++){
            boolean swap =false;
            for(int j=0;j<x-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }for(int i=0;i<x;i++){
        System.out.print(a[i]);
        }
    }
}