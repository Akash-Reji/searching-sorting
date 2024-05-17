#include<iostream>
using namespace std;
void mergeSort(int list1[] ,int size1,int list2[], int size2,int list3[]){
    int i=0,j=0,k=0;
    while (i < size1 && j < size2) {
        if (list1[i] <= list2[j]) {
            list3[k++]=list1[i++];
        } else {
            list3[k++]=list2[j++];
        }
    }
        while (i<size1)
        {
            list3[k++]=list1[i++];
        }while (j<size2){
        {
            list3[k++]=list2[j++];
        }
        }
 
}
int main(){
    int n=5;
    int list1[]={1,3,7,12};
    int size1=4;
    int list2[]={2,4,5,6,8,9};
    int size2=sizeof(list2)/ sizeof(list2[0]);
    
    int list3[size1+size2];
    mergeSort(list1,size1,list2,size2,list3);
    for (int i = 0; i < size1+size2; i++)
    {
        cout<<list3[i] <<" ";
    }
    
    
}