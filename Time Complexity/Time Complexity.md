#Deriving complexity of a algorithm
The usual method to calculate the complexity is to determine the cost of each line in your algorithm separately and then compute the overall complexity.
But remember : only those lines in the algorithm where the number of times an operation is performed depends on the input value are the ones we have to watch out for. Other steps are usually considered asymptotically constant.
Complexities are calculated for recursive and iterative algorithms in different ways.

For recursive algorithms, generally, we form a recurrence relation which correctly represents the recursive calls and the base conditions, and then we solve them using any of these methods:

1. Substitution
2. Recursive Tree method
3. Master Theorem
4. Change of variable method
5. Generating function method

The method to be used depends on the type of recurrence relation you get. For most cases, first three methods suffice.For iterative algorithms, we usually watch out for the loop(s). 
There are (basically) three types of template for a loop (only the usual ones here!):

###Linear
for(i = 1; i <= n; i = i + c)
    
    //some statement;
OR

for(i = n; i >= 1; i = i - c)
    
    //some statement;

Complexity = [(n−1)÷c]+1=θ(n)[(n−1)÷c]+1=θ(n)

###Logarithmic
for(i = 1; i <= n; i = i * c)
    
    //some statement;
   
OR

for(i = n; i >= 1; i = i / c)
    
    //some statement;

Complexity = [logc(n)]+1=θ(log(n))[logc⁡(n)]+1=θ(log⁡(n))

###Log-logarithmic
for(i = c; i <= n; i = i ^ c)
    
    //some statement;
OR

for(i = n; i >= c; i = i ^ (1/c))
    
    //some statement;

Complexity = [logclogc(n)]+1=θ(loglog(n))[logc⁡logc⁡(n)]+1=θ(log⁡log⁡(n))

If there are nested loops, start with the outermost loop, and compute its complexity first using this approach. Then, you have to carefully observe the next inner loop.

If in the inner loop header, there is any counter variable which depends on its parent loop, then for each value of the (immediate) outer loop’s counter variable, you have to manually list the value range for the inner loop’s counter. This is done for all successive inner loops. After doing this manual enumeration, you will finally get the innermost loop’s value range for each of the values of its parent loops. This usually forms a pattern or series and can be easily solved using AP/GP/Summation methods.
Example:

for(i = 1; i <= n; i++)
  
    for(j = 1; j <= i; j++)
      
      //some statement;

Here, expand the inner loop for each value of ‘i’ and add them. Time complexity of this loop comes to be θ(n2)θ(n2)

If the inner loop is completely independent of the outer loop’s variables, then you can simply compute the complexities of those loops independently and their product will be the effective complexity.
Example:

for(i = 1; i <= n; i++)
  
    for(j = 1; j <= n; j++)
    
    //some statement;

If there are multiple statements in a loop body, we consider only the statement with the highest asymptotic complexity.

Now, if some line contains a function call, then, you must compute the complexity of that function call first. If that call is in a loop, then multiply its complexity with the loop’s complexity.

For the overall complexity of an (iterative) algorithm, we add the complexities of each step and the one which is asymptotically largest (in the sum) is the overall complexity of an algorithm.

##References
1. [Ref 1](https://www.quora.com/What-are-some-easy-ways-to-understand-and-calculate-the-time-complexity-of-algorithms)
