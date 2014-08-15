<html>
<body>


<p>Isaac has to buy a new <em>HackerPhone</em> for his girlfriend Amy. He is exploring the shops in the town to compare the prices whereupon he finds a shop located on the first floor of a building, that has a unique pricing policy. There are N steps leading to the shop. A numbered ball is placed on each of the steps. <br>
The shopkeeper gives Isaac a fair coin and asks him to toss the coin before climbing each step. If the result of the toss is a 'Heads', Isaac should pick up the ball, else leave it and proceed to the next step.</p>

<p>The shopkeeper then asks Isaac to find the sum of all the numbers he has picked up (let's say S). The price of the <em>HackerPhone</em> is then the <a href="https://en.wikipedia.org/wiki/Expected_value">expected value</a> of S. Help Isaac find the price of the <em>HackerPhone</em>.</p>

<p><strong>Input Format</strong> <br>
The first line of the input contains an integer N, the number of steps.
N lines follow, which are the numbers written on the ball on each step.  </p>

<p><strong>Output Format</strong> <br>
A single line containing expected value. </p>

<p><strong>Note</strong> : Expected value must be printed as a decimal number having exactly one digit after decimal. It is guaranteed that the correct answer will have at most one digit after decimal.</p>

<p><strong>Constraints</strong> <br>
1 &lt;= N &lt;= 40 <br>
1 &lt;= number on any ball &lt;=10<sup>9</sup></p>

<p><strong>Sample Input #00:</strong></p>

<pre><code>3
1 
1
2
</code></pre>

<p><strong>Sample Output #00:</strong></p>

<pre><code>2.0
</code></pre>

<p><strong>Sample Input #01:</strong></p>

<pre><code>4
1 
2
2
2
</code></pre>

<p><strong>Sample Output #01:</strong></p>

<pre><code>3.5
</code></pre>

<p><strong>Explanation</strong> <br>
In the first case there can be 8 different ways depending on the ball choice. So, we can multiply sum for each way by its probability to occur i.e. 1/8 and sum up to get the expected value as 2. <br>
Similarly in the second case we have 4 items , there can be 16 ways and following the expected value one gets is 3.5.</p>

<footer><a href="#" class="js-suggest-edits btn btn-line fade in challenge_suggestion-toggle fullscreen-hide">Suggest Edits</a></footer>



</body>
</html>