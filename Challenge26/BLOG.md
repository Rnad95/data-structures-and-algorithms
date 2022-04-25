# Selection Sort

## Definition

---

Selection Sort is a sorting algorithm (in-place algorithm) that traverses the array multiple times as it slowly builds out the sorting sequence. The Algorithm keeps the minimum value in the front and replace the variable has a small value with the index.

- It is used for array that has a rather small size.

- It doesn't need extra space

- The Selection Sorted has two way to sort: Ascending, Descending.

## Algorithm Rules

---

1. Create a variable called `min` for example save the first value that has index 0 in the min.  

2. Go through the array and compare the `min` with the values in array. Then, but the minimum inside our variable, `min`.  

3. Swap between the first element in the array and the `min` variable.  

4. Make the minimum equals the next i and go through again in the array.

**NOTE**

- The three steps above called "Pass #" to describe what one operation do. We need to repeat the `Pass` except the elements we already search about them for example, until now the first element will be excepted.  

- When we reach to the middle we have terms called: right, and left most. The left most has a sorted half of our array and the right most has random numbers.

- The last element in the array should not save and search about another minimum because of that our array is sorted and the last number is the largest number in our array.

## Efficiency

---

**The time Complexity:**

- The average case : O( n<sup>2</sup> )
- The worst case : O( n<sup>2</sup> )

**The Space Complexity** is O(1)

## why we Used it then?

---
When we have a small size array and we do not want to use extra space to save elements like the other sorting algorithm.

## Example 1

- Let's Assume we Have array contains the following elements: [10,5,3,9,11 (Jack),8]

![Array](https://i.ibb.co/N68KKfq/Screenshot-from-2022-04-25-19-06-08.png)

The solution to sort these card is:

1. Create `min` and put inside it the first element in the array which is `10`.

2. Go Through inside the array and compare `10` with the other elements.

3. make the min variable points to `3`. Then put the value in temporary variable `temp`.

4. change the place of ten to be in the index equal the index of three.

5. put the three in the first element.

- The result will be as the figure shown below:

![first swap](https://i.ibb.co/Yy6DLJn/photo1650908251.jpg)

We will repeat the the 5 steps above with 5 (index 2) as a starting point to get min 5. Then we start with 10 as starting point and the put it as a minimum to retrieve 8 as `min` value, as shown in image below:

![second swap](https://i.ibb.co/LYvv6CC/photo1650908259.jpg)

Then repeat the steps to get 10 instead Jack(11)
![third swap](https://i.ibb.co/vwNfH9p/photo1650908267.jpg)

---

The way above is talking about sorted Ascending meanwhile the Descending approach is shown below in gif figure

![Descending](https://miro.medium.com/max/1280/1*jdXtqXw0EQVpqdZZoGnwsQ.gif)