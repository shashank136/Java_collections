#include<iostream>
using namespace std;

int getres(int poly[], int n, int x){
	int result = poly[0];  // Initialize result
 
    // Evaluate value of polynomial using Horner's method
    for (int i=1; i<n; i++)
        result = result*x + poly[i];
 
    return result;
}

int main(){
	int size,i,j,x;
	cin>>size>>x;
	int a[size];
	
	int res=0;
	
	for(i=0;i<size;i++){
		cin>>a[i];
	}
	int n = sizeof(a)/sizeof(a[0]);
	cout<<getres(a,n,x);
	
	return 0;
}
