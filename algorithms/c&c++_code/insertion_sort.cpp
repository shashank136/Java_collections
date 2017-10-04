#include<iostream>
using namespace std;

int main(){
	int size,temp=0,i=0,j=0;
	cin>>size;	// read the size of array
	int a[size];
	
	// reading the elements
	for(i=0;i<size;i++){
		cin>>a[i];
	}
	
	// insertion sort
	for(i=1;i<size;i++){
		temp=a[i];
		for(j=i;j>0;j--){
			if(a[j]<a[j-1]){
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}
	
	// displaying the elements in the array.
	for(i=0;i<size;i++){
		cout<<a[i]<<", ";
	}
	
	return 0;
}

