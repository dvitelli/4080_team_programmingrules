#include <iostream>

struct node {

	int payload; 
	struct  node *next;

	};

class linkedList {
private:

	node *head, *tail;

public:

	linkedList(){

		head = NULL;
		tail = NULL;

		}

	void addNode(int input) {

		node *temp = new node; //set up temp
		temp->payload = input;
		temp->next = NULL;

		if (head == NULL) { //check if head null

			head = temp;
			tail = temp;
			
		} else { //if not add to end

			tail->next = temp;
			tail = tail->next;
		
		}

	} void printList() {

		node* temp = new node;
		temp = head;
		while (temp != NULL) {

			std::cout << temp->payload << std::endl;
			temp = temp->next;
		}
		
	
	}
};

int main() {

	//linkedList test;

	//for (int i = 0; i < 10000; i++) {

	//	int rng = rand() % 100;
	//	test.addNode(rng);

	//}

	//test.printList();

	return 0;
}
