<html>
<body>

<p>Alex is attending a Halloween party with his girlfriend Silvia. At the party, Silvia spots a giant chocolate bar. 
If the chocolate can be served as only 1 x 1 sized pieces and Alex can cut the chocolate bar exactly <em>K</em> times, what is the maximum number of chocolate pieces Alex can cut and give Silvia?</p>

<p><strong>Input Format</strong><br>
The first line contains an integer T, the number of test cases. <em>T</em> lines follow.<br>
Each line contains an integer <em>K</em><br></p>

<p><strong>Output Format</strong><br>
<em>T</em> lines. Each line contains an integer that denotes the maximum number of pieces that can be obtained for each test case.<br></p>

<p><strong>Constraints</strong><br>
1&lt;=<em>T</em>&lt;=10<br>
2&lt;=<em>K</em>&lt;=10<sup>7</sup><br></p>

<p><strong>Note</strong> <br>
Chocolate must be served in size of 1 x 1 size pieces. <br>
Alex can't relocate any of the pieces, nor can he place any piece on top of other.</p>

<p><strong>Sample Input #00</strong>  </p>

<pre><code>4
5
6
7
8
</code></pre>

<p><strong>Sample Output #00</strong>  </p>

<pre><code>6
9
12
16
</code></pre>

<p><strong>Explanation</strong><br>
The explanation below is for the first two test-cases. The rest of them follow a similar logic.<br></p>

<p>For the first test-case where <em>K</em> = 5,You need 3 Horizontal and 2 vertical cuts. <br> 
<img src="https://hr-challenge-images.s3.amazonaws.com/halloween-party.jpg" alt="halloweenboard" title="">
For the second test-case where <em>K</em> = 6,You need 3 Horizontal and 3 vertical cuts.</p>

</body>
</html>