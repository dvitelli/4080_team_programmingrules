import timeit
start = timeit.default_timer()
from queue import Queue 
 
frutQ = Queue(maxsize = 5) 
  
print(frutQ.qsize())  
  
frutQ.put('apple') 
frutQ.put('peach') 
frutQ.put('orange') 
  
print("\nFilled: ", frutQ.full())  
  
print("\nFruits have been removed from queue") 
print(frutQ.get()) 
print(frutQ.get()) 
print(frutQ.get()) 
print("\nEmpty: ", frutQ.empty()) 
  
frutQ.put(1) 
print("\nEmpty: ", frutQ.empty())  
print("Filled: ", frutQ.full())

stop = timeit.default_timer()
print('Time: ', stop - start)  