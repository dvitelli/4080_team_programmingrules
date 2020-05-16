import sys
import timeit
start = timeit.default_timer()

def djikstras():
  global tracker
  z = -10
  for x in range(y):
    if tracker[x][0] == 0 \
      and (z < 0 or tracker[x][1] <= \
      tracker[v][1]):
        z = x
  return v

v = [[0, 3, 1, 0],
            [.5, 5, 0, .5],
            [0, 1, 1, 5],
            [1, 3, .5, 0]]
e =  [[0, 3, 4, 1],
          [1, 0, 5, 1],
          [0, 3, 2, 1],
          [1, 0, 0, .5]]

y = len(v[0])

tracker = [[0, 0]]
for i in range(y-1):
  tracker.append([0, sys.max])

for vertex in range(y):
  rem = djikstras()
  for ref_pnt in range(y):
    if v[rem][ref_pnt] == 1 and \
     tracker[ref_pnt][0] == 0:
      d = tracker[rem][1] \
      + e[rem][ref_pnt]
      if tracker[ref_pnt][1] > d:
        tracker[ref_pnt][1] = d
    tracker[rem][0] = 1

i = 0 

for dx in tracker:
  print("Shortest distance ",chr(ord('e') + i),\
  " from V is:",dx[1])
  i = i + 1

  stop = timeit.default_timer()
print('Time: ', stop - start)  