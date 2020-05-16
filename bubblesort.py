def bubbleSort(array):

    for x in range(len(array)-1, 0, -1):

        for y in range(x):

            if array[y]>array[y+1]:
                
                temp = array[y]
                array[y] = array[y+1]
                array[y+1] = temp

array = [69, 22, 2, 0, 99, 100, 55]
bubbleSort(array)
print(array)

