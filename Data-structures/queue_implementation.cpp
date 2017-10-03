// implementation of queues using arrays.
#include<iostream>
#include<stdlib.h>
# define MAX 6
using namespace std;

class queue{
	private:
		int front,back;
		int a[MAX];
		
	public:
		queue(){
			front=-1;
			back=-1;
		}
		
		void enqueue(int x){
			if(back==MAX-1)
				cout<<"Queue is full";
			else{
				back++;
				a[back]=x;
				
				if(front==-1)
					front++;
			}
		}
		
		int dequeue(){
			if(front==-1){
				cout<<"Queue is empty.";
				return NULL;
			}
			else{
				int y = a[front];
				front++;
								
				if(front>back && back==MAX-1){
					front=-1;
					back=-1;
				}
				return y;
			}
		}
};

int main(){
	
	queue q;
	int k;
	
	while(true){
		cout<<endl<<"Enter your choice:"<<endl;
		cout<<"1. Enqueu"<<endl;
		cout<<"2. Deque"<<endl;
		cout<<"3. EXIT"<<endl;
		cin>>k;
		switch(k){
			case 1: {int x; cin>>x; q.enqueue(x);break;}
			case 2: {int y = q.dequeue(); cout<<endl<<y<<endl; break;}
			case 3: exit(1);break;
			default: cout<<"Enter valid choice"<<endl;break;
		}
	}
	
	return 0;
}
