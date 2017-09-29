#include<iostream>
#include<stdlib.h>
#include<vector>
using namespace std;

// functions to get index of parent, leftchild and right child.
int getparent(int index); 
int getLeftchild(int index); 
int getRightchild(int index);

// functions to check if parent,leftchild and rightchild exists.
bool hasparent(int index);
bool hasleftchild(vector<int> &a,int index);
bool hasrightchild(vector<int> &a,int index);

//function to do min_heapify
void heapify_up(vector<int> &a, int pos); 
void heapify_down(vector<int> &a,int x); 
void heapify_swap(vector<int> &a, int p1,int p2);
void swap_fun(vector<int> &a);

// functions to add and delete elements.
void addelement(vector<int> &a, int num);
int delete_max_ele(vector<int> &a);
int delete_last_ele(vector<int> &a);

int main(){
	
	int len,i,j,temp,op,index=0;
	
	vector<int> a;
		
	while(true){
		
		cout<<endl<<"1:insert element :"<<endl;
		cout<<"2:delete minimum element"<<endl;
		cout<<"3:delete last element"<<endl;
		cout<<"4:display heap"<<endl;
		cout<<"5.EXIT"<<endl;
		
		cout<<endl<<"Enter the choice :";
		cin>>op;
		switch(op){
		case 1: cout<<"Enter number to be inserter :";int n; cin>>n; addelement(a,n); break;
		case 2: {int x = delete_max_ele(a); cout<<endl<<"Maximum element deleted is :"<<x<<endl; break;}
		case 3: {int x = delete_last_ele(a); cout<<endl<<"Last element deleted is :"<<x<<endl; break;}
		case 4: len=a.size();cout<<"----------------------------------------------"<<endl;for(i=0;i<len;i++){cout<<a[i]<<" ";}cout<<endl<<"----------------------------------------------"<<endl; break;
		case 5: exit(1);
		default : cout<<"invalid Input"; break;
		}
	}
	
	return 0;
}

int getparent(int index){
	if(index==0){
		return -1;
	}
	return (index-1)/2;
}

int getLeftchild(int index){
	return (index*2)+1;
}

int getRightchild(int index){
	return (index*2)+2;
}

void addelement(vector<int> &a, int num){
	a.push_back(num);
	int pos = a.size()-1;
	/*cout<<endl<<"----------------------------------------";
	cout<<endl<<"position at which inserted is :"<<pos;
	cout<<endl<<"----------------------------------------";*/
	heapify_up(a,pos); // yet to be initialized.
}

int delete_max_ele(vector<int> &a){
	int res = a[0]; // minimum value.
	if(a.size()>1)
		swap_fun(a); // swap the root(contains minimum element) with last element inserted.
	a.pop_back();
	if(a.size()>1)
		heapify_down(a,0); // yet to be initialized.
	return res;
}

int delete_last_ele(vector<int> &a){
	// simply removing the last element inserted.
	if(a.size()<=0){
		cout<<endl<<"Heap is empty"<<endl;
		return -1;
	}
	int res = a[a.size()-1];
	a.pop_back();
	return res;
}

void swap_fun(vector<int> &a){
	// this swap function is used swap while removinf the root or min. element
	int x=a.size()-1;
	a[0]=a[0]+a[x];
	a[x]=a[0]-a[x];
	a[0]=a[0]-a[x];
}

void heapify_swap(vector<int> &a, int p1,int p2){ // p1: child, p2: parent
	// this function is used to swap between internal node in heap.
	/*cout<<endl<<"--------------------------";
	cout<<endl<<"swapping :"<<a[p1]<<" & "<<a[p2]<<" at positions :"<<p1<<" & "<<p2;
	cout<<endl<<"--------------------------";*/
	
	a[p1]=a[p1]+a[p2];
	//cout<<endl<<"child + parent :"<<a[p1];
	a[p2]=a[p1]-a[p2];
	//cout<<endl<<"parent :"<<a[p2];
	a[p1]=a[p1]-a[p2];
	//cout<<endl<<"child :"<<a[p1];
}

bool hasparent(int index){
	// checks if parent is present?
	if(index==0){
		return false;
	}
	else{
		return true;
	}
}

bool hasleftchild(vector<int> &a,int index){
	//checks if left child is there?
	int x= getLeftchild(index);
	if(x<a.size()) 
		return true;
	else return false;	
}

bool hasrightchild(vector<int> &a,int index){
	//checks if right child is there?
	int x = getRightchild(index);
	if(x<a.size()) 
		return true;
	else return false;
}

void heapify_up(vector<int> &a, int pos){
	// this function makes sure that the heap is a perfect min heap after insertion of a new node at bottom.
	bool flag = true;
	while(flag){ // first while loop to check if parent node satisfies heapify condition whit child node.
		int parent = getparent(pos);
		if( hasparent(pos) && a[pos]>a[parent]){
			//cout<<endl<<"heapifying for element at :"<<pos<<" value :"<<a[pos]<<endl;
			heapify_swap(a,pos,parent);
			pos = parent;
			heapify_down(a,pos);
		}
		else flag = false;
	}
}

void heapify_down(vector<int> &a,int x){
	// this function makes sure that the heap is a perfect min heap.
	bool flag = true;int pos = x;
	while(flag){
		int lc = getLeftchild(pos);
		int rc = getRightchild(pos);
		if( hasleftchild(a,pos) && a[pos]<a[lc]){
			//cout<<endl<<"heapifying for element at :"<<pos<<" value :"<<a[pos]<<endl;
			heapify_swap(a,pos,lc);
			pos = lc;
			heapify_down(a,pos);
		}
		else if(hasrightchild(a,pos) && a[pos]<a[rc] ){
			//cout<<endl<<"heapifying for element at :"<<pos<<" value :"<<a[pos]<<endl;
			heapify_swap(a,pos,rc);
			pos = rc;
			heapify_down(a,pos);
		}
		else flag = false;
	}
}
