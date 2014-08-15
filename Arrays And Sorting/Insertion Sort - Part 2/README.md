<html>
<body>

<p>In Insertion Sort Part 1, you sorted one element into an array. Using the same approach repeatedly, can you sort an entire unsorted array?</p>

<p><em>Guideline:</em> You already can place an element into a sorted array. How can you use that code to build up a sorted array, one element at a time? Note that in the first step, when you consider an element with just the first element - that is already "sorted" since there's nothing to its left that is smaller than it.</p>

<p>In this challenge, don't print every time you move an element. Instead, print the array every time an element is "inserted" into the array in (what is currently) its correct place. Since the array composed of just the first element is already "sorted", begin printing from the second element and on. </p>

<p><strong>Input Format</strong> <br>
There will be two lines of input:</p>

<ul>
<li>s - the size of the array</li>
<li>ar - the list of numbers that makes up the array</li>
</ul>

<p><strong>Output Format</strong> <br>
On each line, output the entire array at every iteration</p>

<p><strong>Constraints</strong> <br>
1&lt;=s&lt;=1000 <br>
-10000&lt;=x&lt;= 10000 ,  x ∈ ar </p>

<p><strong>Sample Input</strong></p>

<pre>6
1 4 3 5 6 2
</pre>

<p><strong>Sample Output</strong></p>

<pre>1 4 3 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 2 3 4 5 6 
</pre>

<p><strong>Explanation</strong> <br>
Insertion Sort checks the '4' first and doesn't need to move it, so it just prints out the array. Next, the 3 is inserted next to the 4 and the array is printed out. This continues one element at a time until the entire array is sorted. </p>

<p><strong>Task</strong> <br>
The method <strong>insertionSort</strong> takes in one parameter: <strong>ar</strong>, an unsorted array. Use an Insertion Sort Algorithm to sort the entire array.  </p>

<footer><a href="#" class="js-suggest-edits btn btn-line fade in challenge_suggestion-toggle fullscreen-hide">Suggest Edits</a></footer>



</body>
</html>