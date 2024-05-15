public class mergesrt {
    public static void main(String args[]) 
    {
       int a[]={3,2,1,5,4,0};
       int lb=0;
       int ub=a.length-1;
       mergesort(a,lb,ub);
       for(int i=0;i<a.length;i++)
       {
           System.out.println(a[i]);
       }
    } 
    public static void mergesort(int[]a,int lb,int ub)
    {
      if(lb<ub)
      {
          int mid=(lb+ub)/2;
          mergesort(a,lb, mid);
          mergesort(a,mid+1,ub);
          merge(a,lb,mid,ub);
      }
    }
    public static void merge(int []a,int lb,int mid,int ub)
     {
       int i=lb,j=mid+1,k=lb;
       int[]b=new int [a.length];
       while(i<=mid && j<=ub)
       {
           if(a[i]<a[j])
           {
            b[k]=a[i];
            i++;
            k++;
           }
            else {
                b[k]=a[j];
                j++;
                k++;
            }
       }if(i<=mid){
            while(i<=mid){
                b[k]=a[i];
                i++;
                k++;
            }
       }
        if(j<=ub){
            while(j<=ub){
                b[k]=a[j];
                j++;
                k++;
            }
        }for(int p=lb;p<=ub;p++){
            a[p]=b[p];
        }
    }
}
