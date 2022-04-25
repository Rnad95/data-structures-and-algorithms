# Selection Sort

## Challenge Summary
<!-- Description of the challenge -->
---

Implementing Selection sort algorithm to sort array Ascending.

## Whiteboard Process
<!-- Embedded whiteboard image -->
---

#### Selection sort Algorithm whiteboard

![whiteboard](https://i.ibb.co/3fcKq1Q/Screenshot-from-2022-04-25-22-37-14.png)

The Link of The [Whiteboard](https://wbd.ms/share/v2/aHR0cHM6Ly93aGl0ZWJvYXJkLm1pY3Jvc29mdC5jb20vYXBpL3YxLjAvd2hpdGVib2FyZHMvcmVkZWVtLzQwNWY3NmE2N2VmMDRmMWJiZGI0OWNhMzM2ZTI3NDY4X2ExNjJjNTMyLTdhMGMtNDY0NS05NmZkLTIwZDAxOWNmNGU1YV9jZDRkMDEwMS1hOGU4LTQ3OGYtYWIzMS1hZGJmMjU3ZDUzMjI=)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
---

**The time Complexity:**

- The average case : O( n<sup>2</sup> )
- The worst case : O( n<sup>2</sup> )

**The Space Complexity** is O(1)

## Solution
<!-- Show how to run your code, and examples of it in action -->
---

1. Create a variable called `min` for example save the first value that has index 0 in the min.  

2. Go through the array and compare the `min` with the values in array. Then, but the minimum inside our variable, `min`.  

3. Swap between the first element in the array and the `min` variable.  

4. Make the minimum equals the next i and go through again in the array.
