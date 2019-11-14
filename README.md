# Non-Adjacent-Sum-Dynamic-Programming

Given an array for integers, find out the maximum sum that can be calculated using any number of integers but they all must be non adjacent to each other.

For example:

array[] = 5, 11, 15, 7, 2, 9, 12, 15
Output : 44 (5+15+9+15)

How to do:
Take the starting element as second number
The first number must be maximum of the first two numbers.

Now, starting at index 2 till the end of the array, calculate Maximum of first number and second number + i'th element in the array.
That maximum must be the new first number and the old first number becomes second.
Finally, first number is the required sum.

Remember: second is always behind first.
