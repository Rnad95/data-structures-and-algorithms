# Challenge 18: K-ary Tree

## Challenge Summary

---

Determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:

If the value is divisible by 3, replace the value with “Fizz”  
If the value is divisible by 5, replace the value with “Buzz”  
If the value is divisible by 3 and 5, replace the value with “FizzBuzz”  
If the value is not divisible by 3 or 5, simply turn the number into a String.

## Whiteboard Process

---

![FizBuzz binarytree whitboard](https://i.ibb.co/g9hBg9y/Screenshot-from-2022-04-05-22-04-39.png)

## Approach & Efficiency

- To implement this function, we use Queue.

> Complexity time: O(n)  
> space time: O(n)

## API

---
<!-- Show how to run your code, and examples of it in action -->

The steps to run this code in your machine:  

1. Clone the the repo to your local machine.  
2. Open the project in IntelliJ IDE
3. Then, create the configuration to the App (New Application) and Test (Junit) As the Figure below Show:

![Configuration setup](https://i.ibb.co/cJ6kNWs/Screenshot-from-2022-03-06-14-59-53.png)

4. Run the project and test it in intelliJ environment  
 `OR`
test the code in terminal:

> `renad@renad-HP-Notebook:~/data-structures-and-algorithms/Challenge18$` ./gradlew test  

### Example of the Test of the code using the methods

![Test](https://i.ibb.co/gyYZ12C/Screenshot-from-2022-04-05-22-15-17.png)

### Example of the output of the code using the methods

![output](https://i.ibb.co/x1MNnHv/Screenshot-from-2022-04-05-22-16-14.png)