<html>
<body>

<p>There are <em>N</em> integers in an array <em>A</em>. All but one integer occur in pairs. Your task is to find out the number that occurs only once. </p>

<p><strong>Input Format</strong></p>

<p>The first line of the input contains an integer <em>N</em> indicating number of integers. <br>
The next line contains <em>N</em> space separated integers that form the array <em>A</em>. </p>

<p><strong>Constraints</strong></p>

<p>1 &lt;= <em>N</em> &lt; 100 <br>
<em>N</em> % 2 = 1  ( <em>N</em> is an odd number ) <br>
0 &lt;= <em>A[i]</em> &lt;= 100, ∀ <em>i ∈ [1, N]</em></p>

<p><strong>Output Format</strong></p>

<p>Output <em>S</em>, the number that occurs only once. </p>

<p><strong>Sample Input:1</strong></p>

<pre><code>1
1
</code></pre>

<p><strong>Sample Output:1</strong></p>

<pre><code>1
</code></pre>

<p><strong>Sample Input:2</strong> </p>

<pre><code>3
1 1 2
</code></pre>

<p><strong>Sample Output:2</strong></p>

<pre><code>2
</code></pre>

<p><strong>Sample Input:3</strong></p>

<pre><code>5
0 0 1 2 1
</code></pre>

<p><strong>Sample Output:3</strong></p>

<pre><code>2
</code></pre>

<p><strong>Explanation</strong></p>

<p>In the first input, we see only 1 element and that element is the answer (1). <br>
In the second input, we see 3 elements, 1 is repeated twice. The element that occurs only once is 2. <br>
In the third input, we see 5 elements, 1 and 0 are repeated twice. And the element that occurs only once is 2.  </p>

<footer><a href="#" class="js-suggest-edits btn btn-line fade in challenge_suggestion-toggle fullscreen-hide">Suggest Edits</a></footer>


</body>
</html>