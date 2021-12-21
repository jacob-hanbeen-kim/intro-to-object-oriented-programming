# What's the Word?

## Introduction

This homework will cover:
- Basic Java control structures
- Scanner
- String manipulation
- Conditionals and Loops

## Problem Description

You learned enough of Programming to write some interesting codes now.
While thinking about interesting project you could create to impress your friends,
you decided to create a word guessing game that you could play with your friends.

## Solution Description

Edit [WhatsTheWord.java](WhatsTheWord.java) and complete the definition of the `WhatsTheWord` class so that it implements a simple word guessing game.
Write your code in the `main` method so that you can run the class as a console program. Fill in the rest of the main method -- under the `// Your code here:` line -- with code that implements a console-based word guessing game.

### Rules of the Game

- If the player makes five incorrect guesses ("misses"), the player loses.
- Player can only guess one letter at time.
- If a player guesses a letter that occurs in the secret word multiple times, each occurrence of the letter is revealed.

### Game Play

- As long as the player has made fewer than five misses and has not guessed all the letters in the word:
  - Print a line reporting the current missed letters and the number of remaining misses before the player loses.
  - Print a line reporting the current guess with underscores, `'_'`, for letters which haven't yet been guessed.
  - Print a prompt for the user to enter a letter on the same line as the prompt.
  - Read a letter from the console.
  - Update the current guess and the number of misses accordingly.
- Print a line reporting all the letters the player missed in the game.
- Print a line reporting the final guess, including `'_'` characters for letters that weren't guessed.
- If the player lost, print a line saying "Sorry, too many missess." and what the secret word was.
- If the player won, print a line saying "Congratulations! You got it!" (the full secret word will have already been printed).

### Sample Output

Successful run with a couple of misses and a repeated letter:
```sh
$ java WordGuess
Missed letters (5 left):
Current guess: ___
Guess a letter: c

Missed letters (4 left): c
Current guess: ___
Guess a letter: a

Missed letters (4 left): c
Current guess: _a_
Guess a letter: t

Missed letters (3 left): ct
Current guess: _a_
Guess a letter: d

Missed letters: ct
Final guess: dad
Congratulations! You got it!
```

Unsuccessful run with a couple of hits:
```sh
$ java WordGuess
Missed letters (5 left):
Current guess: ___
Guess a letter: q

Missed letters (4 left): q
Current guess: ___
Guess a letter: w

Missed letters (3 left): qw
Current guess: ___
Guess a letter: e

Missed letters (2 left): qwe
Current guess: ___
Guess a letter: r

Missed letters (2 left): qwe
Current guess: r__
Guess a letter: t

Missed letters (2 left): qwe
Current guess: r_t
Guess a letter: y

Missed letters (1 left): qwey
Current guess: r_t
Guess a letter: u

Missed letters: qweyu
Final guess: r_t
Sorry, too many misses. The secret word was rat
```

### Solution Constraints

- **IMPORTANT**: Your output must match the examples above **exactly**.
- You must use a [Scanner](https://docs.oracle.com/javase/9/docs/api/java/util/Scanner.html) reading from `System.in` to get the player's input.
- You may not import any classes other than the ones already imported in the provided code. Yes, certain classes from, e.g.,  `java.util` make sense for this task, but we want you to practice using primitive features of Java.

## Tips and Considerations

- You get the length of a [String](https://docs.oracle.com/javase/9/docs/api/java/lang/String.html) with the `length` method, e.g., `"cat".length()` returns `3`.
- You may want to use an instance of the [StringBuilder](https://docs.oracle.com/javase/9/docs/api/java/lang/StringBuilder.html) class to hold the player's guess.
  - After you create a new `StringBuilder`, e.g., `StringBuilder sb = new StringBuilder()`, it's empty.
  - Use the `append` method to add a character to the String, e.g. `sb.append('_')`.
    - How would you append a particular number of `'-'` characters?
  - Use the `toString` method to get a printable `String` with the current contents of the `StringBuilder`.
  - Use the `setCharAt` method to set the `char` at a particular index of a `StringBuilder` object, e.g., if you have a `StringBuilder` `sb` whose content is `"___"`, then after `sb.setCharAt(1, 'a')` its content is `"_a_"`.
  - You can play around with `StringBuilder` in [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm) to get a feel for it.
- There is no `Scanner` method that returns a `char`. You can use the `next` method, which returns a `String` and use `String`s `charAt` method to get a `char` value. For example `"a".charAt(0)` returns `'a'`.
- The provided code includes a means to pre-select a secret word instead of randomly selecting a secret word. For example, if you run `java WordGuess 0` the secret word will be `"cat"`, if you run `java WordGuess 1` the secret word will be `"dad"`. You can use this feature to test your code.

## Check Points

- [ ] Correctly prints missed letters at beginning of game.
- [ ] Correctly prints current guess at beginning of game.
- [ ] Correct prompt for player input.
- [ ] Reads player input on same line as prompt.
- [ ] Uses first character of player's input and ignores the rest, if supplied.
- [ ] Correctly prints missed letters after a miss.
- [ ] Correctly prints number of misses remaining after a miss.
- [ ] Correctly prints current guess after a miss.
- [ ] Correctly prints missed letters after a hit.
- [ ] Correctly prints number of misses remaining after a hit.
- [ ] Correctly prints current guess after a hit that occurs once in the secret word.
- [ ] Correctly prints current guess after a hit that occurs more than once in the secret word.
- [ ] Terminates after five misses.
- [ ] Terminates after correctly guessing secret word.
- [ ] Correctly prints total misses at end of game.
- [ ] Correctly prints final guess at end of game.
- [ ] Prints correct message on loss.
- [ ] Prints correct message on win.
- [ ] No extraneous blanks, lines, etc.


## Checkstyle

For each of your homework assignments we will run checkstyle and deduct one point for every checkstyle error.

*   You can run checkstyle on your code by using the jar file. To check the style of your code run `java -jar checkstyle-6.2.2.jar *.java`.
*   To check your Javadocs run `java -jar checkstyle-6.2.2.jar -j *.java`.
*   Note that the command for checking code and the command for checking Javadocs are different. You will have to run both commands to fully test for style errors.
*   Depending on your editor, you might be able to change some settings to make it easier to write style-compliant code. See the [customization tips](http://cs1331.gatech.edu/customization-tips.html) page for more information.


## Check Your Answers

*   You can check your answer by running the JUnit Test for your homework.

## Good Luck! ```  \(°□°)/```