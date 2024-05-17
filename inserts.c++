#include<iostream>
using namespace std;
// int main(){
//     int n=6;
//     int arr[]={5,17,3,9,15,1};
//     int min,loc,temp;
//     for (int i = 0; i < n; i++){
//         min=arr[i];
//         loc=i;
//         for (int j=i+1; j < n; j++)
//         {
//             if (arr[j]<min){
//                 min=arr[j];
//                 loc=j;
//             }
//         }
//         temp=arr[i];
//         arr[i]=arr[loc];
//         arr[loc]=temp;
//     }
//     for (int i = 0; i < n; i++){
//             cout<<arr[i]<<" ";
//         }
// }

int main(){
    int n=6;
    int arr[]={5,17,3,9,15,1};
    int min,loc,temp;
    for (int i = 0; i < n; i++){
        min=arr[i];
        loc=i;
        for (int j=i+1; j < n; j++)
        {
            if (arr[j]<min){
                min=arr[j];
                loc=j;
            }
        }
        temp=arr[i];
        arr[i]=arr[loc];
        arr[loc]=temp;
        for (int i = 0; i < n; i++){
            cout<<arr[i]<<" ";
        }
        cout<<endl;
    }
    for (int i = 0; i < n; i++){
            cout<<arr[i]<<" ";
        }
}