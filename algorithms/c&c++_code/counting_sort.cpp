#include<iostream>
using namespace std;

void countingsort(int a[], int size, int k){

	int c[k]; // store the frequency of elements in array a.
	int b[size]; // store the sorted output for array a.
	int i,j;

	// initializing array c.
	for (i=0; i<k; i++)
		c[i]=0;

	// storing the frequency of each element in array a into c.
	for(i=1; i<size; i++)
		c[a[i]] = c[a[i]]+1;

	// storing the rank for each element.
	for(i=1; i<k; i++)
		c[i] = c[i] + c[i-1];

	// updating the array b with sorted list of elements.
	for(j=size-1; j>0; j--){
		b[c[a[j]]] = a[j];
		c[a[j]] = c[a[j]]-1;
	}

	// print the output array.
	for(i=1; i<size; i++)
		cout<<b[i]<<" ";
	
}

int main(){

	int size,k,i;
	cin>>size>>k;

	int a[size];
	for(i=1; i<size; i++)
		cin>>a[i];

	countingsort(a,size,k);

	return 0;
}
