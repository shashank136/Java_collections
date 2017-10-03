#include<iostream>
#include<stdlib.h>
# define SIZE 5
using namespace std;

// Implementation of Stack data structure using arrays.
class Stack{
	private:
		int top;
		int a[SIZE];
		
	public:
		
		Stack(){
			top = -1;
		}
		
		void push(int x){
			if(top==SIZE-1)
				cout<<"Stack is Full.";
			else{
				top++;
				a[top] = x;
			}			
		}
		
		int pop(){
			if(top==-1){
				cout<<"Stack is Empty.";
				return NULL;
			}else{
				int res = a[top];
				top--;
				return res;
			}
		}
};

int main(){
	
	Stack s;
	int k;

	while(true){
		cout<<endl<<"Enter your choice:"<<endl;
		cout<<"1. PUSH"<<endl;
		cout<<"2. POP"<<endl;
		cout<<"3. EXIT"<<endl;
		cin>>k;
		switch(k){
			case 1: {int x; cin>>x; s.push(x);break;}
			case 2: {int y = s.pop(); cout<<endl<<y<<endl; break;}
			case 3: exit(1);break;
			default: cout<<"Enter valid choice"<<endl;break;
		}
	}	
	
	return 0;
}
