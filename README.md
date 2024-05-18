MEMORY GAME

You will write a java applet memory game similar to the example above. 


The game board

Think of the game board as a 2-dimensional array that holds matching pairs of integers. Each 
integer will display a circle with a different color on the board.
Build an array that holds the values for your game board. Your board must be random. I 
recommend writing a method to display the values in your array to make sure they are correct 
An example for the game board:
3 7 3 2
4 6 6 1
5 1 2 0
4 0 5 7
• Declare and initialize a 4 x 4 2D array that holds integers.
• Your array will need to hold 8 different integers and each integer will need to appear in 
the array twice. The matched integers will be your memory pairs.
• Your integers need to be randomly located in your array.
Start simple. Declare and initialize a 4 x 4 array and put the integers 0-15 in order in your array. 
(Display your array to make sure it is correct). Now change the numbers 8-15 to 0-7 (think %). 
Randomizing the numbers is the hard part and there are many different ways to do this but you 
will probably want to use Random rnd = new Random(); rnd.nextInt(...). Check Java API if you 
don't know how to use it.



Mouse Clicking

You should write codes that gets mouse clicks and sets xMouse and yMouse to the location of 
the mouse click. xMouse and yMouse will range from 0 to 399. You will be using the Graphics 
class to display your game board. The window is 400 x 400 with (0,0) in the upper left corner. You 
should think of the board as a visual array with board[0][0] as the top left corner and each square 
is 100 x 100. To determine which square the user has selected you will need to convert the 
location of xMouse and yMouse to your array indices. There is a very easy way to do 
this without using if statements or switch statements. Note: the indices, (i, j), correspond to (y, x), not (x, y). You will need to write a method that determines the current index location the user 
has selected
index 0: 0 - 99
index 1: 100 - 199
index 2: 200 - 299
index 3: 300 - 399



Game Display

Once you know which index the user has selected you will need to display a circle (or you can 
choose other shapes if you want) in the correct square on the board. You can determine the 
location of your shape by multiplying and adding your current index by numbers.
The color of your shape is determined by the integer in your 2D array. Finish the method 
displayCircle to draw circles with different colors. The value you will pass in will be 
board[xIndex][yIndex] (the integer located in the xIndew, yIndex location in the array).
