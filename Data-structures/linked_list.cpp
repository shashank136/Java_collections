// Linked list implementaion.
#include<iostream>
using namespace std;

class linklist{
	private:
		struct node{
			int data;
			node *link;
		}*p;
	
	public:
	
		linklist();
		void append(int n);
		void addatbeg(int n);
		void addatend(int n);
		void addatend(int c, int n);
		void del(int n);
		void display();
		void count();
		~linklist();
};

linklist::linklist(){
	p=NULL; // p always points at start it not NULL.
}

//code to add new node.
void linklist::append(int n){
	node *q,*t; // use q to iterate over the linked list and t to store the new node temporarly.
	
	if(p==NULL){
		p = new node;
		p->data=n;
		p->link=NULL;
	}
	else{
		q=p;
		while(q->link!=NULL)
			q=q->link;
		
		t=new node;
		t->data=n;
		t->link=NULL;
		q->link=t;
	}
}

// code to add node at the begining.
void linklist::addatbeg(int n){
	node *q;
	
	q = new node;
	q->data=n;
	q->link=p;
	p=q;
}

//code to add node at the end.
void linklist::addatend(int n){
	node *q,*t;
	
	q=p;
	while(q->link!=NULL){
		q=q->link;
	}
	t= new node;
	t->data=n;
	t->link=NULL;
	q->link=t;
}

//code to add new node after c nodes.
void linklist::addatend(int c, int n){
	node *q,*t;
	int i=1;
	q=p;
	while(i<=c){
		q=q->link;
		
		if(q=NULL){
			cout<<endl<<"There are lesser number of nodes then "<<c<<endl;
			return;
		}
	}
	t= new node;
	t->data=n;
	t->link=NULL;
	q->link=t;	
}

//code to delete a specific node from linked list.
void linklist::del(int n){
	node *q,*r;
	
	q=p;
	while(q->data==n){
		p=q->link;
		delete q;
		return;
	}
	
	r=q;
	while(q!=NULL){
		if(q->data==n){
			r->link=q->link;
			delete q;
			return;
		}
		r=q;
		q=q->link;
	}
}

//code to display all nodes.
void linklist::display(){
	node*q;
	q=p;
	cout<<endl;
	while(q->link!=NULL){
		cout<<q->data<<" ";
		q=q->link;
	}
}

// code to count number of nodes in linklist.
void linklist::count(){
	int i=0;
	node *q;
	q=p;
	while(q!=NULL){
		i++;
		q=q->link;
	}
	cout<<endl<<i;
}

linklist::~linklist(){
	node *q;
	if(p==NULL) return;
	
	while(p!=NULL){
		q=p->link;
		delete p;
		p=q;
	}
}

int main(){
	
	linklist l;
	l.append(11);
	l.append(12);
	l.append(13);
	l.append(14);

	l.addatbeg(45);
	l.addatend(35);
	l.addatend(4,58);
	
	l.display();
	
	l.del(13);
	l.display();
	
	l.del(45);
	l.display();
	
	return 0;
}
