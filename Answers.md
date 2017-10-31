# COMP 271 002 F17


# Q1
By having these zuxillary methods we can implement certain features, such as populating a list,
recursively instead of using a while loop.

# Q2
The argument is neccessary because we need to tell eaech call to the method
what object they are modifying, for example in populate list we use the result as 
the argument becasue we add one element to it each time we call the method

# Q3
populateList is O(n) time dependent and linearly space dependent
populateFifoList is O(n^2) time dependent because it has to move all the previous elements of the list to work 
and is O(n) space dependent
ReverseLines is O(n) time dependent and O(n) space dependent

# Q4
all 3 can be done using a while loop, the LinkedStack ones can do so using a curr = curr.next statement and printReverse can because we can modify the stack

