#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

void bucketsort(float a[],int n){
	vector<float> b[n];
	int i,j;
	for(i=0;i<n;i++){
		int temp = n*a[i];
		b[temp].push_back(a[i]);
	}
	
	for (i=0; i<n; i++)
       sort(b[i].begin(), b[i].end());
       
    int index=0;
    for(i=0;i<n;i++){
    	for(j=0; j<b[i].size();j++)
    		a[index++] = b[i][j];
	}
}

int main(){
	int size,i;
	cin>>size;
	
	float a[size];
	
	for(i=0;i<size;i++)
		cin>>a[i];
		
	bucketsort(a,size);
	
	for(i=0;i<size;i++)
		cout<<a[i]<<" ";
		
	return 0;
}
