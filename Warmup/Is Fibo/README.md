<html>
<body>

<p>You are given an integer, <em>N</em>. Write a program to determine if <em>N</em> is an element of the <em>Fibonacci Sequence</em>.  </p>

<p>The first few elements of fibonacci sequence are 0,1,1,2,3,5,8,13.... A fibonacci sequence is one where every element is a sum of the previous two elements in the sequence. The first two elements are 0 and 1. </p>

<p>Formally:   </p>

<p><em>fib<sub>0</sub> = 0</em> <br>
   <em>fib<sub>1</sub> = 1</em> <br>
   <em>fib<sub>n</sub> = fib<sub>n-1</sub> + fib<sub>n-2</sub></em> ∀ <em>n</em> &gt; 1</p>

<p><strong>Input Format</strong> <br>
The first line contains <em>T</em>, number of test cases. <br>
<em>T</em> lines follows. Each line contains an integer <em>N</em>.</p>

<p><strong>Output Format</strong> <br>
Display <code>IsFibo</code> if <em>N</em> is a fibonacci number and <code>IsNotFibo</code>  if it is not a fibonacci number. The output for each test case should be displayed on a new line.</p>

<p><strong>Constraints</strong> <br>
1 &lt;= <em>T</em> &lt;= 10<sup>5</sup> <br>
1 &lt;= <em>N</em> &lt;= 10<sup>10</sup></p>

<p><strong>Sample Input</strong>  </p>

<pre><code>3
5
7
8
</code></pre>

<p><strong>Sample Output</strong>  </p>

<pre><code>IsFibo
IsNotFibo
IsFibo
</code></pre>

<p><strong>Explanation</strong> <br>
5 is a Fibonacci number given by <em>fib<sub>5</sub></em>  = 3 + 2 <br>
7 is not a Fibonacci number <br>
8 is a Fibonacci number given by <em>fib<sub>6</sub></em> = 5 + 3  </p>

<p><strong>TimeLimit</strong>
Time limit for this challenge is given <a href="https://www.hackerrank.com/environment">here</a></p>

<footer><a href="#" class="js-suggest-edits btn btn-line fade in challenge_suggestion-toggle fullscreen-hide">Suggest Edits</a></footer>


</body>
</html>