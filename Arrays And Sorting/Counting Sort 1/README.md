<html>
<body>

<p><strong>Comparison Sorting</strong> <br>
Quicksort usually has a running time of <em>n*log(n)</em>, but is there an algorithm that can sort even faster? In general, this is not possible. Most sorting algorithms are <em>comparison sorts</em>, i.e., they sort a list just by comparing the elements with one another. A comparison sort algorithm cannot beat <em>n log(n)</em> (worst-case) running time, since <em>n log(n)</em> represents the minimum number of comparisons needed to know where to place each element. For more details, you can see <a href="http://www.cs.cmu.edu/~avrim/451f11/lectures/lect0913.pdf">these notes</a> (PDF). </p>

<p><strong>Alternative Sorting</strong> <br>
However, for certain types of input, it is more efficient to use a non-comparison sorting algorithm. This will make it possible to sort lists even in linear time. These challenges will cover Counting Sort, a fast way to sort lists where the elements have a small number of possible values, such as integers within a certain range. We will start with an easy task - counting. </p>

<hr>

<p><strong>Challenge</strong> <br>
Given a list of integers, can you count and output the number of times each value appears?</p>

<p><em>Hint:</em> There is no need to sort the data, you just need to count it. </p>

<p><strong>Input Format</strong> <br>
There will be two lines of input:</p>

<ul>
<li>n - the size of the list</li>
<li>ar - <em>n</em> space separated numbers that makes up the list</li>
</ul>

<p><strong>Output Format</strong> <br>
Output the number of times every number from 0 to 99 (inclusive) appears in the list. </p>

<p><strong>Constraints</strong> <br>
100 &lt;= n &lt;= 10<sup>6</sup> <br>
0 &lt;= x &lt; 100 ,  x ∈ ar </p>

<p><strong>Sample Input</strong></p>

<pre>100
63 25 73 1 98 73 56 84 86 57 16 83 8 25 81 56 9 53 98 67 99 12 83 89 80 91 39 86 76 85 74 39 25 90 59 10 94 32 44 3 89 30 27 79 46 96 27 32 18 21 92 69 81 40 40 34 68 78 24 87 42 69 23 41 78 22 6 90 99 89 50 30 20 1 43 3 70 95 33 46 44 9 69 48 33 60 65 16 82 67 61 32 21 79 75 75 13 87 70 33 
</pre>

<p><strong>Sample Output</strong></p>

<pre>0 2 0 2 0 0 1 0 1 2 1 0 1 1 0 0 2 0 1 0 1 2 1 1 1 3 0 2 0 0 2 0 3 3 1 0 0 0 0 2 2 1 1 1 2 0 2 0 1 0 1 0 0 1 0 0 2 1 0 1 1 1 0 1 0 1 0 2 1 3 2 0 0 2 1 2 1 0 2 2 1 2 1 2 1 1 2 2 0 3 2 1 1 0 1 1 1 0 2 2 
</pre>

<p><strong>Explanation</strong></p>

<p>the output states that <code>0</code> appears 0 times. <br>
<code>1</code> appears 2 times. <br>
<code>2</code> appears 0 times. <br>
and so on in the given input array. </p>

<footer><a href="#" class="js-suggest-edits btn btn-line fade in challenge_suggestion-toggle fullscreen-hide">Suggest Edits</a></footer>


</body>
</html>