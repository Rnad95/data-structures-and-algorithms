# Repeat Word using Hash

Repeated the word using hashMap

## Challenge
<!-- Description of the challenge -->

Creating the repeatedWord Function to retrieve the first word was repeated in sentence.

## Whiteboard

---

![whiteboard](Challenge31/whiteboard.png
)

[**Link Of The Whiteboard:**](https://wbd.ms/share/v2/aHR0cHM6Ly93aGl0ZWJvYXJkLm1pY3Jvc29mdC5jb20vYXBpL3YxLjAvd2hpdGVib2FyZHMvcmVkZWVtLzRmYzZiZjQ4NjcyMTQ5ZGJiZmM4ZDY1NjY1YWFiOTA4X2ExNjJjNTMyLTdhMGMtNDY0NS05NmZkLTIwZDAxOWNmNGU1YV9kZWU4ZDQ5ZS1lMGVkLTQ4NjctYWRjOC05ZjQ2ZmE4ZWQ3MGU=)

## Approach & Efficiency
<!-- Show how to run your code, and examples of it in action -->
---

**The time Complexity:**

Average Case:

- get method : O(1)
- repeated Function: O (n)

Worst  Case:

- get method : O(n)
- repeated Function: O (n)

## Solution

---
To Find the repeated word we using the hashTable we are built before in [Challenge31](../Challenge30) which Implements the following methods:

- `set:` to add key and value  
- `getSize:` to return the length of the hash-table  
- `isEmpty:` to check if the hash-table is empty  
- `getBucketIndex:` to get the index of the node inside the bucket  
- `hashCode:` to hash the key.  
- `keys:` to retrieve all the keys inside the hashTable  
- `get:` To Retrieve the value of the key
- `contains:` to indicate if the key exists in the table already.

> To Find the repeated words in sentence we used the get method to check if the value of the key is null or not

### The test on intelliJ

![test output](Challenge31/test.png)

### The output of Implementation

![output](Challenge31/output.png)