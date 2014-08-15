<html>
<body>

<p>In the previous challenge, it was easy to print all the integers in order, since you did not have to access the original list. Once you had obtained the frequencies of all the integers, you could simply print each integer in order the correct number of times. However, if there is other data associated with an element, you will have to access the original element itself. </p>

<p>In the final counting sort challenge, you are required to print the data associated with each integer. This means, you will go through the original array to get the data, and then use some "helper arrays" to determine where to place everything in a sorted array. </p>

<p>If you know the frequencies of each element, you know how many times to place it, but which index will you start placing it from? It will be helpful to create a helper array for the "starting values" of each element. </p>

<p><strong>Challenge</strong> <br>
You will be given a list that contains both integers and strings. In this challenge you just care about the integers. For every value <em>i</em> from 0 to 99, can you output <em>L</em>, the number of elements that are less than or equal to <em>i</em>? </p>

<p><strong>Input Format</strong> <br>
  n - the size of the list <em>ar</em>.</p>

<p><em>n</em> lines follow, each containing an integer <em>x</em>, and a string, <em>s</em>.</p>

<p><strong>Output Format</strong> <br>
Output <em>L</em> for all numbers from 0 to 99 (inclusive). </p>

<p><strong>Constraints</strong> <br>
1 &lt;= n &lt;= 1000000 <br>
0 &lt;= x &lt; 100 ,  x ∈ ar </p>

<p><strong>Sample Input</strong></p>

<pre>10
4 that
3 be
0 to
1 be
5 question
1 or
2 not
4 is
2 to
4 the
</pre>

<p><strong>Sample Output</strong></p>

<pre>1 3 5 6 9 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 
</pre>

<p><strong>Explanation</strong> <br>
0 appears 1 time, so the 0<sup>th</sup> number is 1. <br>
0 and 1 combined appear 3 times, so the next number is 3. <br>
This continues for the rest of the list, until no more new numbers appear.  </p>

<footer><a href="#" class="js-suggest-edits btn btn-line fade in challenge_suggestion-toggle fullscreen-hide">Suggest Edits</a></footer>


</body>
</html>