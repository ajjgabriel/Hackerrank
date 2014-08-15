<html>
<body>

<p>In the previous challenge, you wrote code to perform an Insertion Sort on an unsorted array. But how would you prove that the code is correct? I.e. how do you show that for any input, your code will provide the right output?</p>

<p><strong>Loop Invariant</strong> <br>
In computer science, you could prove it formally with a <strong>loop invariant</strong>, where you state that a desired property is maintained in your loop. Such a proof is broken down into 3 parts: </p>

<ul>
<li><em>Initialization</em> - It is true (in a limited sense) before the loop runs.</li>
<li><em>Maintenance</em> - If it's true before an iteration of a loop, it remains true before the next iteration.</li>
<li><em>Termination</em>. It will terminate in a useful way, once it is finished. </li>
</ul>

<p><strong>Insertion Sort's Invariant</strong> <br>
Say you have some InsertionSort code, where the outer loop goes through the whole array <em>A</em>:</p>

<pre><code>for(int i = 1; i &lt; A.length; i++){
//insertion sort code
</code></pre>

<p>You could then state the following loop invariant:</p>

<blockquote>
  <p>At the start of every iteration of the outer loop (indexed with <em>i</em>), the subarray until <em>ar[i]</em> consists of the original elements that were there, but in sorted order. </p>
</blockquote>

<p>To prove Insertion Sort is correct, you will then demonstrate it for the three stages:</p>

<ul>
<li><p>Initialization - The subarray starts with the first element of the array, and it is (obviously) sorted to begin with.</p></li>
<li><p>Maintenance - Each iteration of the loop expands the subarray, but keeps the sorted property. An element <em>V</em>  gets inserted into the array, only when it is &gt;= to the element to the left of it. Since the elements to the left have already been sorted, it means <em>V</em> &gt;= all the elements to the left, so the array remains sorted.  (In InsertionSort2, we saw this by printing array each time an element was 'inserted' into it.)  </p></li>
<li><p>Termination - The code will terminate after <em>i</em> has reached the last element in the array, which means the sorted subarray has expanded to encompass the entire array. So the array is now fully sorted.</p></li>
</ul>

<p><img src="https://s3.amazonaws.com/hr-challenge-images/insertion-sort/InsertionSortCorrect-small.png" alt="Loop Invariant Chart" title=""></p>

<p>You can often use a similar process to demonstrate the correctness of many algorithms. You can see <a href="http://www.cs.uofs.edu/~mccloske/courses/cmps144/invariants_lec.html">these notes</a> for more information.</p>

<p><strong>Challenge</strong></p>

<p>In the InsertionSort code below, there is an error. Can you fix it? Print the array only once, when it is fully sorted. </p>

<p><strong>Details</strong> <br>
The Input format and the constraints are the same as the previous challenges and are presented below. </p>

<hr>

<p><strong>Input Format</strong> <br>
There will be two lines of input:</p>

<ul>
<li>s - the size of the array</li>
<li>ar - the list of numbers that makes up the array</li>
</ul>

<p><strong>Output Format</strong> <br>
Output the numbers in order, space-separated.</p>

<p><strong>Constraints</strong> <br>
1&lt;=s&lt;=1000 <br>
-1500&lt;=x&lt;= 1500 ,  x ∈ ar </p>

<p><strong>Sample Input</strong></p>

<pre>6
1 4 3 5 6 2
</pre>

<p><strong>Sample Output</strong></p>

<pre>1 2 3 4 5 6 
</pre>

<footer><a href="#" class="js-suggest-edits btn btn-line fade in challenge_suggestion-toggle fullscreen-hide">Suggest Edits</a></footer>


</body>
</html>