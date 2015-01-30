ASCIIFORMER RELEASE_2.5 README:

INSTALLATION:
1. Compile ASCIIformer.java and its levels and methods with a java interpreter
2. Run ASCIIformer.class by going into a terminal emulator and "cd"-ing to the ASCIIformer folder. Run by typing in 
"java ASCIIformer"

CONTROLS:
wasd to move
type in quit to quit

CHANGES: The game now features a movement method which is more modular. Some experimental (and non-functional) code for 
a bot or enemy is also added in the badcode folder. There are more levels, now with a tutorial stage.

PHYSICS:
At one jump, the character will go up one unit on the array. At 2 jumps, the character will fall down with any 
increments in jumping.
At one jump, the character can go right or left once, while falling to the ground. At 2 jumps, the character can 
advance 2 times on the array by pressing right or left. The chearacter will fall after stepping off a ledge.

HP AND LIVES:
The character starts off with 3 lives and 500 HP. Each inverted v they step on causes them to lose 100 HP. If he loses
all his HP, they must restart the level they are on, and lose 1 life, regaining 500 HP in the process. If the character 
reaches 0 HP on his last life, the screen clears, displaying "GAME OVER" and a final score.

SCORE:
The character can increment his score by collecting asteriks. Each asterik he recieves increments his score by 100. Each 
time the character steps on an inverted v, he loses 100 points along with 100 HP. Every time the character collcts an 
asterik, it dissapears. It is possible to recieve a negative score by stepping on an inverted v repeatedly.

HUD:
The HUD appears displays HP and lives at the top. Directly under it, it displays the score.

LEVEL CREATION
1. Look at Release_2.5's example levels for formatting levels
2. Compile the levels
3. Edit ASCIIformer.java and in the array level[][][], look at how the example levels are formatted. Then place your 
level's name as an object in the array in order. Actual level first, and the backup display second.
4. Add the level class into the level array in variables.java
5. Compile ASCIIformer.java
6. Have fun! :)

KNOWN BUGS: 
Asteriks above the character are collected when the character walks by them, without adding to the score.
level0 has a strange missing chunk in the botom right corner which can be walked into, and upon exiting it, has a chunk 
reappear.
The bot code is completely nonfunctional.
