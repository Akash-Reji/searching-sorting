#include<iostream>
using namespace std;
int main(){
    int n=5;
    int arr[]={5,17,3,9,15,1};
    int temp;
    for (int i = 0; i < n; i++){
        for (int j = 0; j <n; j++){
            if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        }
        
    }
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
        }
}