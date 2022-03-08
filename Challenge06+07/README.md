# Challenge 06 LinkedList

## Introduction

---
This Challenge is created to extend the linkedlist in Challenge 05.  

- LinkedList has append, insertBefore, insertAfter Methods.  

> `Append(value)`: to add node to last the LinkedList
> `InsertBefore(item, value)` : to add node after the item  
> `InsertAfter(item, value)` : to add node before the item in the linkedList

Challenge 07 :  
> `KthFormEnd`: to return the value using the index from the end of The linkedList  

## Whiteboard Process
<!-- Embedded whiteboard image -->
append whiteBoard:
![append](https://i.ibb.co/89DXgQ5/Screenshot-from-2022-03-06-15-28-06.png)

---

insertBefore whiteboard:
![insertBefore](https://i.ibb.co/m4JthB3/Screenshot-from-2022-03-06-15-41-36.png)

---

insertAfter whiteboard:
![insertAfter](https://i.ibb.co/CzKyf39/After.png)

---

KthFormEnd whiteboard:
![kthFormEnd Method whiteboard](https://i.ibb.co/hsSz3x0/Screenshot-from-2022-03-08-22-49-29.png)

---

## Approach & Efficiency

---
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Big O of insert in the first Element is : O(1)  
Big O of Append method is: O(n)  
Big O of insertBefore in the first middle method is: O(n/2) ~ O(n)  
Big O of insertAfter method is: O(n)  
Big O of search is O (n)  
Big O of kth method is O(n)

## Solution
<!-- Show how to run your code, and examples of it in action -->

the steps to run this code in your machine:  

1. Clone the the repo to your local machine.  
2. Open the project in IntelliJ IDE
3. Then, create the configuration to the App (New Application) and Test (Junit) As the Figure below Show:

![Configuration setup](https://i.ibb.co/cJ6kNWs/Screenshot-from-2022-03-06-14-59-53.png)

4. Run the project and test it in intelliJ environment  
 `OR`
test the code in terminal:

> `renad@renad-HP-Notebook:~/data-structures-and-algorithms/Challenge06$` ./gradlew test

Example of the output of the code using the methods:

Challenge 06 output:

![Running the code](https://i.ibb.co/qkgXRxQ/Screenshot-from-2022-03-06-14-52-54.png)

---

Challenge 07 output:

![Running code Ch07](https://i.ibb.co/BzFvBQ0/Screenshot-from-2022-03-08-22-56-13.png)

---

## The code Test for Challenge 06 + 07

---
![Test the code image](https://i.ibb.co/ZMy8tt3/Screenshot-from-2022-03-08-22-55-43.png)
