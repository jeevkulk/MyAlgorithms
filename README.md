# List of Algorithms

# 1. Array Algorithms

**1.1 Rotate 1D Array:** Given a one-dimensional array, write a program to rotate the array by N elements. This needs to be done without making a copy of entire array.
Refer: src/main/java/algorithm/array/ArrayRotation

**1.2 Rotate Matrix:** Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
Refer: src/main/java/algorithm/array/MatrixRotation

**1.3 Max Sum of Sub-Array:** Given an array of integers - find the maximum sum of its sub-array.
Refer: src/main/java/algorithm/array/MaxSumOfSubArray


# 2. Sorting Algorithms
 
**2.1 BubbleSort**
Refer: src/main/java/algorithm/algorithm.assignment.sort/BubbleSort
 
**2.2 InsertionSort**
Refer: src/main/java/algorithm/algorithm.assignment.sort/InsertionSort
 
**2.3 SelectionSort**
Refer: src/main/java/algorithm/algorithm.assignment.sort/SelectionSort
 
**2.4 QuickSort**
Refer: src/main/java/algorithm/algorithm.assignment.sort/QuickSort
 
**2.5 MergeSort**
Refer: src/main/java/algorithm/algorithm.assignment.sort/MergeSort


# 3. String Algorithms

**3.1. Is Unique:** Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
Refer: src/main/java/algorithm/string/HasUniqueChars

**3.2. Check Permutation:** Given two strings, write a method to decide if one is a permutation of the other
Refer: src/main/java/algorithm/string/CheckPermutation

**3.3. Palindrome Permutation:** Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
_EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat", "atco eta", etc.)_
Refer: src/main/java/algorithm/string/CheckPalindromePermutation


# 4. Search Algorithms

**4.1 Knuth-Morris-Pratt Pattern Search Algorithm:** Given a string pattern - find the first occurrence that pattern in the text using Knuth-Morris-Pratt algorithm.
Refer: src/main/java/algorithm/search/KnuthMorrisPrattPatternSearch 

**4.2 Rabin-Karp Pattern Search Algorithm:** Given a string pattern - find the first occurrence that pattern in the text using Rabin-Karp algorithm.
Refer: src/main/java/algorithm/search/RabinKarpPatternSearch

**4.3. Shakespeare Word Usage Analysis** Given two files (refer to resoruces directory), one containing words used by Shakespeare and the other containing all the words in Webster dictionary - find the following:
 _(i) Total Number of Distinct Words in Webster Dictionary
 (ii) Total Number of Distinct Words used by Shakespeare
 (iii) Number of Words in dictionary used by Shakespeare
 (iv) Number of Words in dictionary but not used by Shakespeare
 (v) Number of Words used by Shakespeare but not in dictionary_
 Refer: src/main/java/algorithm/search/ShakespeareWordSearch


# 5. Caching Algorithms

**5.1 Caching Algorithm:** Provides LRU and LFU caching service using LinkedList 
Refer: src/main/java/algorithm/cache/service/CacheService


# 6. Tree Algorithms 

**6.1. Puzzle 1 :** Get maximum number of movies that can be viewed in a day. This uses maximum depth of a tree using DFS. 
Refer: src/main/java/algorithm/tree/MaxNumberOfMoviesCalculator
 
 
# List of Data Structures
 
# 1. Map Implementation 
 
**1.1 HashMap Implementation**
Refer: src/main/java/datastructure/map/HashMap
 
**1.2 LinkedHashMap Implementation**
This has special enhancement for LFU caching (LRU is also present)
Refer: src/main/java/datastructure/map/LinkedHashMap


# 2. Queue Implementation

**2.1. ArrayBlockingQueue** Refer: src/main/java/datastructure/queue/ArrayBlockingQueue


# 3. Tree Implementation

**3.1 Binary Tree** Refer: src/main/java/datastructure/tree/binarytree/BinaryTree

**3.2 Binary Search Tree** Refer: src/main/java/datastructure/tree/binarytree/BinarySearchTree

**3.3 Minimum Heap** Refer: src/main/java/datastructure/tree/binarytree/MinimumHeap

**3.4 Maximum Heap** Refer: src/main/java/datastructure/tree/binarytree/MaximumHeap

**3.5 Trie** Refer: src/main/java/datastructure/tree/Trie


# 4. Graph

**4.1 Adjacency LinkedList Graph**
Graph data structure is built using Adjacency LinkedList storage.   
Refer: src/main/java/datastructure/graph/AdjacencyLinkedListGraph

**4.2 Adjacency Matrix Graph**
Graph data structure is built using Adjacency 2-D array as storage.   
Refer: src/main/java/datastructure/graph/AdjacencyMatrixGraph
