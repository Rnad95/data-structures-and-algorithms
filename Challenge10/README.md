# Stacks and Queues
<!-- Short summary or background information -->

## Introduction

---

- Stack is a data structure which is liner list. It store the data over each other and we can access to the top (Last). The stack principles depending on (Last-In First-out(LIFO))

![Stack operation](https://cdn.programiz.com/sites/tutorial2program/files/stack.png)

- Queue is another data structure which is liner list also. It store the data as the stack but the access started First. The Queue principles depending on (First-In First-out(FIFO)).

- There are four types of Queue:

1. Simple Queue
2. Priority Queue
3. Circular Queue
4. Double Ending Queue (Dequeue)

### Simple Queue

![Queue operation](https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Data_Queue.svg/800px-Data_Queue.svg.png)

## Challenge

---
<!-- Description of the challenge -->
In this challenge, we will create a queue and stack data structure using a Linked List.

## Approach & Efficiency

---
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

### Stack

- the complexity of push, pop, isEmpty, and peek methods are  O(1)

### Queue

- the complexity of enqueue, dequeue, isEmpty, and peek methods are  O(1)

## API

---
<!-- Description of each method publicly available to your Stack and Queue-->
### Stack

`push(NodeStack value)` which is using to add node on the top(Last the linked list)

`pop()` which is using to remove node on the top.  

`isEmpty()`is created to check if the Stack empty or not.

`peek()` to render the top element.

### Queue

`enqueue(NodeQueue value)` which is using to add node on the last element

`dequeue()` which is using to remove node from the **First**  

`isEmpty()`is created to check if the Stack empty or not.

`peek()` to render the First element.
