#include<iostream>
using namespace std;

void swap(int* a, int* b)
{
    int t = *a;
    *a = *b;
    *b = t;
}

int partition(int a[], int p, int r){
	// p=0, r=7, x=4, i=-1(initially), j=0
	int x = a[r]; 
	int i = p-1;
	for(int j=p; j<r; j++){
		if(a[j]<=x){
			i++;
			swap(&a[i],&a[j]);
		}
	}
	swap(&a[i+1],&a[r]);
	return i+1;
}

void quicksort(int a[], int start, int end){
	if(start<end){
		int index = partition(a,start,end);
		quicksort(a,start,index-1);
		quicksort(a,index+1,end);
	}
}

int main(){
	int a[] = {13, 19, 9, 5, 12, 8, 7, 4, 11, 2, 6, 21};
	int n = sizeof(a)/sizeof(a[0]);
	
	quicksort(a,0,n-1);
	
	for(int i=0; i<n; i++)
		cout<<a[i]<<" ";
	
	return 0;
}
