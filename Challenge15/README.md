# Challenge 15: Binary Tree and BST Implementation

## Trees

---

Tree is a data structure represents nodes which connect with edges.

- There are many types of tree data structure such as Binary Trees, Binary Search Trees, and K-ary Trees.  

- Tree solved the problem of search, access, and remove to reach `logn` Complexity.

![tree](https://static.javatpoint.com/ds/images/tree2.png)

### Traversals

---

- This is Term to access all Elements in the data structure only once.

There are two categories of traversals in tree:

1. Depth First
2. Breadth First

### Depth First

- Prioritize going through the depth (height) of the tree first.

- There are three methods for depth first traversal:

1. Pre-order: root => left => right
2. In-order: left => root => right
3. Post-order: left => right => root

## Challenge

- Implement the Binary tree and traverse the node using Depth First approach: Pre-Order,in-Order,post-Order.

- Then Implement Binary search tree and add the node in order and find if the element exist in the BST or not.

## Approach & Efficiency

- To implement this data structure, we use Recursion.

O(n) for Binary tree.  
O(log h) for Binary search tree where h is Height.

## API
<!-- Show how to run your code, and examples of it in action -->

The steps to run this code in your machine:  

1. Clone the the repo to your local machine.  
2. Open the project in IntelliJ IDE
3. Then, create the configuration to the App (New Application) and Test (Junit) As the Figure below Show:

![Configuration setup](https://i.ibb.co/cJ6kNWs/Screenshot-from-2022-03-06-14-59-53.png)

4. Run the project and test it in intelliJ environment  
 `OR`
test the code in terminal:

> `renad@renad-HP-Notebook:~/data-structures-and-algorithms/Challenge15$` ./gradlew test  

### Example of the Test of the code using the methods

![Test](https://i.ibb.co/zPK8yDW/Screenshot-from-2022-03-30-19-42-01.png)

### Example of the output of the code using the methods

![output](https://i.ibb.co/nBDhm48/Screenshot-from-2022-03-30-19-40-11.png)
