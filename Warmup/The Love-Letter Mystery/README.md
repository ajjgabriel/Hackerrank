<html>
<body>

<p>James got hold of a love letter that his friend Harry has written for his girlfriend. Being the prankster that James is, he decides to meddle with it. He changes all the words in the letter into <a href="https://en.wikipedia.org/wiki/Palindrome">palindromes</a>.   </p>

<p>While modifying the letters of the word, he follows 2 rules:  </p>

<p><em>(a)</em> He always reduces the value of a letter, e.g. he changes 'd' to 'c', but he does not change 'c' to 'd'. <br>
<em>(b)</em> If he has to repeatedly reduce the value of a letter, he can do it until the letter becomes 'a'.  Once a letter has been changed to 'a', it can no longer be changed.  </p>

<p>Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations he carries out to convert a given string into a palindrome.  <br><br></p>

<p><strong>Input Format</strong> <br>
The first line contains an integer <em>T</em>, i.e., the number of test cases. <br>
The next <em>T</em> lines will contain a string each.  </p>

<p><strong>Output Format</strong> <br>
A single line containing the number of minimum operations corresponding to each test case.</p>

<p><strong>Constraints</strong> <br>
1 ≤ <em>T</em> ≤ 10<br> 
1 ≤ <em>length of string</em> ≤ 10<sup>4</sup> <br>
All characters are lower cased english letters.  </p>

<p><strong>Sample Input #00</strong>  </p>

<pre><code>3
abc
abcba
abcd
</code></pre>

<p><strong>Sample Output #00</strong>  </p>

<pre><code>2
0
4
</code></pre>

<p><strong>Explanation</strong>  </p>

<p>For the first test case, ab*c* -&gt; ab*b* -&gt; ab*a*. <br>
For the second test case, abcba is a palindromic string. <br>
For the third test case, abc*d* -&gt; abc*c* -&gt; abc*b* -&gt; abc*a* = ab*c*a -&gt; ab*b*a.  </p>

</body>
</html>