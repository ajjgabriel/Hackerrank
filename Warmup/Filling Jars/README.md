<html>
<body>

<p><a href="https://hr-testcases.s3.amazonaws.com/1637/1637-chinese.md">Chinese Version</a><br>
<a href="http://hr-testcases.s3.amazonaws.com/1637/1637_rus.md">Russian Version</a><br></p>

<p>Animesh has <em>N</em> empty candy jars, numbered from 1 to <em>N</em>, with infinite capacity. He performs <em>M</em> operations. Each operation is described by 3 integers <em>a, b</em> and <em>k</em>. Here, <em>a</em> and <em>b</em> are index of the jars, and <em>k</em> is the number of candies to be added inside each jar whose index lies between <em>a</em> and <em>b</em> (both inclusive).
Can you tell the average number of candies after <em>M</em> operations?  </p>

<p><strong>Input Format</strong> <br>
The first line contains two integers <em>N</em> and <em>M</em> separated by a single space. <br>
<em>M</em> lines follow. Each of the <em>M</em> lines contain three integers <em>a, b</em> and <em>k</em> separated by single space.  </p>

<p><strong>Output Format</strong> <br>
A single line containing the average number of candies across <em>N</em> jars, <em>rounded down</em> to the nearest integer.</p>

<p><strong>Note</strong> <br>
<em>Rounded down</em> means finding the greatest integer which is less than or equal to given number. Eg, <em>13.65</em> and <em>13.23</em> is rounded down to <em>13</em>, while <em>12.98</em> is rounded down to <em>12</em>.  </p>

<p><strong>Constraints</strong> <br>
3 &lt;= <em>N</em> &lt;= 10<sup>7</sup> <br>
1 &lt;= <em>M</em> &lt;= 10<sup>5</sup> <br>
1 &lt;= <em>a</em> &lt;= <em>b</em> &lt;= <em>N</em> <br>
0 &lt;= <em>k</em> &lt;= 10<sup>6</sup>  </p>

<p><strong>Sample Input #00</strong>  </p>

<pre><code>5 3
1 2 100
2 5 100
3 4 100
</code></pre>

<p><strong>Sample Output #00</strong>  </p>

<pre><code>160
</code></pre>

<p><strong>Explanation</strong> <br>
Initially each of the jar contains 0 candies  </p>

<pre><code>0 0 0 0 0  
</code></pre>

<p>First operation  </p>

<pre><code>100 100 0 0 0  
</code></pre>

<p>Second operation  </p>

<pre><code>100 200 100 100 100  
</code></pre>

<p>Third operation  </p>

<pre><code>100 200 200 200 100  
</code></pre>

<p>Total = 800, Average = 800/5 = 160  </p>

<footer><a href="#" class="js-suggest-edits btn btn-line fade in challenge_suggestion-toggle fullscreen-hide">Suggest Edits</a></footer>

</body>
</html>