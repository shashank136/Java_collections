#include<iostream>
using namespace std;

int main(){
	int size,i,j;
	cin>>size;
	
	int a[size];
	
	for(i=0;i<size;i++)
		cin>>a[i];
		
	j=size-1;
	
	while(j>=3){
		for(i=0;i<j;i++){
			if(a[i]>a[i+1]){
				a[i]=a[i]+a[i+1];
				a[i+1]=a[i]-a[i+1];
				a[i]=a[i]-a[i+1];
			}
		}
		j--;
	}
	
	for(i=0;i<size;i++)
		cout<<a[i]<<" ";
		
	return 0;
}
