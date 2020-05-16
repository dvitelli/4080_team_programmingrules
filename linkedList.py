class Node:
    def __init__(self, num=None):
        self.num = num
        self.nextNum = None

class linkedList:
    def __init__(self):
        self.front = None

    def addToEnd(self, newdata):
        NewNode = Node(newdata)
        if self.front is None:
            self.front = NewNode
            return
        laste = self.front
        while(laste.nextNum):
            laste = laste.nextNum
        laste.nextNum=NewNode

    def printList(self):
        printNum = self.front
        while printNum is not None:
            print (printNum.num, "\n")
            printNum = printNum.nextNum


list = linkedList()
list.front = Node("Apple")
e2 = Node("Pear")
e3 = Node("Peach")
e4 = Node("Orange")

list.front.nextNum = e3
e3.nextNum = e4

list.addToEnd("Cherry")
list.printList()