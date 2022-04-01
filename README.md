***Nonogram row***

This challenge is inspired by nonogram puzzles, but you don't need to be familiar with these puzzles in order to complete the challenge.

A binary array is an array consisting of only the values 0 and 1. Given a binary array of any length, return an array of positive integers that represent the lengths of the sets of consecutive 1's in the input array, in order from left to right.

nonogramrow([]) => []

nonogramrow([0,0,0,0,0]) => []

nonogramrow([1,1,1,1,1]) => [5]

nonogramrow([0,1,1,1,1,1,0,1,1,1,1]) => [5,4]

nonogramrow([1,1,0,1,0,0,1,1,1,0,0]) => [2,1,3]