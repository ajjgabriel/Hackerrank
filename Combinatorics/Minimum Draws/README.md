<html>
<body>

<p>Jim is off to a party and is searching for a matching pair of socks. His drawer is filled with socks, each pair of a different color. In its worst case scenario, how many socks (x) should Jim remove from his drawer after which he finds a matching pair?</p>

<p><strong>Input Format</strong> <br>
The first line contains the number of test cases T. <br>
Next T lines contains an integer N which indicates the total pairs of socks present in the drawer.</p>

<p><strong>Output Format</strong> <br>
Print the number of Draws (x) Jim makes in the worst case scenario.</p>

<p><strong>Constraints</strong> <br>
1 &lt;= T &lt;= 1000 <br>
0 &lt; N &lt; 10<sup>6</sup></p>

<p><strong>Sample Input</strong></p>

<pre><code>2
1
2
</code></pre>

<p><strong>Sample Output</strong></p>

<pre><code>2
3
</code></pre>

<p><strong>Explanation</strong> <br>
Case 1 : A pair of socks are present, hence exactly 2 draws for the socks to match. <br>
Case 2 : 2 pair of socks are present in the drawer. The first and the second draw might result in 2 socks of different color. The 3rd socks picked will definitely match one of previously picked socks. Hence, 3. </p>

<footer><a href="#" class="js-suggest-edits btn btn-line fade in challenge_suggestion-toggle fullscreen-hide">Suggest Edits</a></footer>


</body>
</html>