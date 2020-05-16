#include <iostream>

struct node {

	int payload;
	struct  node* next;

};

class queue {
private:

	node *front, *rear;

public:

	queue() {

		front = NULL;
		rear = NULL;

	}

	void enqueue(int input) {

		node* temp = new node; //set up temp
		temp->payload = input;
		temp->next = NULL;

		if (front == NULL) { //check if head null

			front = temp;
			rear = temp;
			

		}
		else { //if not add to end

			rear->next = temp;
			rear = rear->next;
			
		}

	} void dequeue() {
		
		if (front == NULL) {

			return;
		}

		front = front->next;
		

		if (front == NULL) {

			front = NULL;
			rear = NULL;
		}

	} void printQueue() {

		node* temp = new node;
		temp = front;
		int counter = 1;

		while (temp != NULL) {

			std::cout << "Payload: "<< temp->payload << " ";
			std::cout << " Postion: "  << counter++ << " in queue. " << std::endl;
			temp = temp->next;
		}


	}
};

int main() {

	//queue test;

	//test.enqueue(4);
	//test.enqueue(5);
	//test.enqueue(6);
	//test.dequeue();
	//test.enqueue(7);
	//test.dequeue();
	
	

	//test.printList();

	return 0;
}
