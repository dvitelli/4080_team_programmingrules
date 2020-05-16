import timeit
start = timeit.default_timer()

class Node:
    def __init__(self, Frut=None):
        self.Frut = Frut
        self.nextFrut = None

class linkedList:
    def __init__(self):
        self.front = None

    def addToEnd(self, Frut):
        NewNode = Node(Frut)
        if self.front is None:
            self.front = NewNode
            return
        tail = self.front
        while(tail.nextFrut):
            tail = tail.nextFrut
        tail.nextFrut=NewNode

    def printList(self):
        printFrut = self.front
        while printFrut is not None:
            print (printFrut.Frut, "\n")
            printFrut = printFrut.nextFrut


list = linkedList()
list.front = Node("Apple")
frut2 = Node("Pear")
frut3 = Node("Peach")
frut4 = Node("Orange")

list.front.nextFrut = frut3
frut3.nextFrut = frut4

list.addToEnd("Cherry")
list.printList()

stop = timeit.default_timer()
print('Time: ', stop - start)  