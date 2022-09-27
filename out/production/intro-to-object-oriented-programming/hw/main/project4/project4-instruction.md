HW4 - Evil Chipotle

Doctor CS and the AIs
=====================

Introduction
------------

The world-famous hero, the Doctor CS, was checking his numerous emails one day when suddenly he gets a call from his sidekick Burdell Boy warning him of a surprise attack from his arch nemesis Dr. Chipotle. He needs your help using his programming superpowers to create AIs to stop the villain’s highly destructive guac cannon from destroying the World before it’s too late! While you’re there, you might as well get some revenge on Dr. Chipotle as well. You know, for the good of humanity.

Problem Description
-------------------

Write five classes, AI, RandomAI, RogueAI, DoctorCS, and Coordinates to help our hero pull off his perilous plan. The AI class and by extension, its subclasses (RandomAI and RogueAI), have some important information we need in order to get revenge on our sworn enemy, including the location of Dr. Chipotle’s secret lair. Once you get this information, you can change the cannon to attack Dr. Chipotle’s lair instead of Doctor CS’s HQ. However, Dr. Chipotle anticipated the counterattack and has installed a security measure into his cannons: a self-destruct sequence virus. Should the virus activate, any AI trying to stop the cannon will be destroyed, and the cannon will fire anyways at its original target. If it is possible without triggering the self destruct, you should change the cannon target to Dr. Chipotle’s lair. If it is not possible, then Dr. Chipotle will have succeeded in his plan to destroy the World.

**TL;DR** (Too Long; Didn’t Read) Dr. Chipotle is trying to destroy the World, and you have to make some classes that use the features of object-oriented programming to stop him.

Solution Description
--------------------

Complete the AI, RandomAI, RogueAI, DoctorCS, and Coordinates classes following the instructions below. **Note**: When creating the specified getter and setter methods for each class, use the naming convention taught in class, e.g. getFirewallProtection() and setSecretIdentity().

For all of the classes you write, **Don’t add any unneeded fields**.

Don’t forget to answer the [Analysis](#analysis) questions.

Coordinates.java
----------------

This class should be **concrete**.

### Fields

This class has the following private fields, and **associated getter methods**:

*   `final double latitude`. This constant double represents the latitude in a set of coordinates.

*   `final double longitude`. This constant double represents the longitude in a set of coordinates.


### Constructor

This class has the following constructor:

*   `public Coordinates(double latitude, double longitude)`. This constructor takes in two doubles that should be assigned to `latitude` and `longitude` respectively.

### Methods

This class has the following public methods:

*   `boolean equals(Object other)`. This returns a boolean representing whether another object is logically equivalent to this instance of Coordinates. For two Coordinates instances to be equivalent, their latitude and longitude must be equal. **Implement this method as you have been taught in lecture.**

*   `String toString()`. This returns the String representation of this Coordinate object’s stored information in the following format: `"latitude: (latitude), longitude: (longitude)"`

For example, a possible output of the toString() method could look like this: `"latitude: 12.34, longitude 56.78"`

*   Getters for both `latitude` and `longitude`.


AI.java
-------

The foundation for any AI Doctor CS creates. This class should be made **abstract**.

### Fields

This class has the following private fields, **and associated getter methods** for them:

*   `boolean destructed`. A boolean that represents whether the AI has self-destructed or not. Default value is false.

*   `Coordinates cannonTarget`. An instance of Coordinates that represents the location at which Dr. Chipotle’s guacamole cannon is aimed.

*   `Coordinates secretHQ`. An instance of Coordinates that represents the location of Dr. Chipotle’s secret headquarters.


### Constructor

This class will have the following constructor:

*   `public AI(Coordinates cannonTarget, Coordinates secretHQ)`. This constructor should assign the arguments to the `cannonTarget` instance variable and `secretHQ` instance variable respectively.

### Methods

This class will have the following methods alongside the getters specified in the Fields section:

*   `public boolean swapCannonTarget(Coordinates newCoords)`. This method will attempt to change the `cannonTarget` instance variable. The following boolean checks determine if `cannonTarget` is changed:

*   If both `destructed` is false and `newCoords` does not equal `cannonTarget` then:

*   If `shouldSwapCannonTarget()` returns true, then `cannonTarget` should be set equal to `newCoords`. Return true after the assignment.

*   Else if `shouldSelfDestruct()` returns true, invoke the `selfDestruct()` method then return false.

*   In any other case, the method should return false.

*   `public abstract boolean shouldSwapCannonTarget()`. This method will be implemented in the subclasses of `AI`. Do not make this method concrete or you will not get credit for it.

*   `public void selfDestruct()`. This method functions as a setter for the `destructed` instance variable, but it will only set `destructed` to true whenever invoked.

*   `public abstract boolean shouldSelfDestruct()`. This method will be implemented in the subclasses of `AI`. Do not make this method concrete or you will not get credit for it.

*   `public String toString()`. This method returns a String representation of the AI object which should have the following structure:

`"Dr. Chipotle’s guacamole cannon is currently pointed at (cannonTarget)."` (**Properly reuse code or you can lose points**)

For example, a possible output of the toString() method could look like this:

`"Dr. Chipotle's guacamole cannon is currently pointed at latitude: 13.31, longitude: 13.01."`


RandomAI.java
-------------

RandomAI extends AI but isn’t very smart. When you tell it to swapCannonTarget(), there’s a 50% chance that it will, and a 50% that it won’t. If it doesn’t swap the target, there’s a 50% chance that it will self destruct. This class should be **concrete**.

### Fields

This class has the following private static final field:

*   `Random randomizer`. This is an instance of the `Random` class. `RandomAI` will use the power of indeterminate, psuedo-randomly generated numbers to determine if the weather today will be cloudy with a chance of guacamole (i.e. use randomizer to make the 50% chance decisions).

### Constructor

This class will have the following constructor:

*   `public RandomAI(Coordinates cannonTarget, Coordinates secretHQ)`. Assign both Coordinates instances to their respective instance variables. (**Hint**: Where are the instance variables `cannonTarget` and `secretHQ` located?)

### Methods

This class will have the following methods:

*   `public boolean shouldSwapCannonTarget()`. This method should override the abstract method found in `AI.java`. It should return true 50% of the time.

*   `public boolean shouldSelfDestruct()`. This method should override the abstract method found in `AI.java`. It should also return true 50% of the time.


RogueAI.java
------------

RogueAI extends AI and can detect firewalls in the guac cannon’s software as well as alert levels. RogueAI can lower the firewalls, but that increases the alert level as well. If the alert level exceeds the maximum alert level, then the self-destruct virus will be activated, and that instance of RogueAI will be destroyed. This class should be **concrete**.

### Fields

This class has the following private fields **and associated getter methods** for them:

*   `int firewallProtection`. This is an int that represents security level of the firewall. Doctor CS must first lower it to `0` in order to access the secret info.

*   `int alertLevel`. This is an int that represents the current alert level of the computer. It will raise every single time Doctor CS tries to either lower the firewall or swap the guac cannon’s target. More on that later.

*   `final int maxAlert`. This is a constant int variable that represents the alert level at which the computer self destructs. If `alertLevel` goes above this threshold, it will be impossible for Doctor CS to save the day.


Be sure to make the instance fields **private** so that only your methods within the class have access to them!

### Constructor

This class will have the following constructors:

*   `public RogueAI(int firewallProtection, int alertLevel, int maxAlert, Coordinates cannonTarget, Coordinates secretHQ)`. This constructor takes in three ints and two Coordinates objects and assigns them to their corresponding instance fields. (**Hint**: Where is the instance variable `cannonTarget` located?)

*   `public RogueAI(int firewallProtection, int maxAlert, Coordinates cannonTarget, Coordinates secretHQ)`. This constructor takes in two ints and two Coordinates objects and assigns them to their corresponding instance fields. It also sets `alertLevel` to 0.(**Hint**: Where is the instance variable `cannonTarget` located?)

*   `public RogueAI(int firewallProtection, Coordinates cannonTarget, Coordinates secretHQ)`. This constructor takes in one int and two Coordinates objects and assigns them to their corresponding instance fields. It also sets `alertLevel` to 0 and `maxAlert` to 10.(**Hint**: Where is the instance variable `cannonTarget` located?)


Use constructor delegation! For this homework, make constructors with fewer arguments delegate to constructors with more arguments.

### Methods

This class has the following methods alongside the getters specified in the Fields section:

*   `public void lowerFirewall()`. This method should decrement `firewallProtection` by 2, and increment `alertLevel` by 1 when invoked.

*   `public boolean shouldSwapCannonTarget()`. This method should override the abstract method found in `AI.java`. It should return whether or not `firewallProtection` is less than or equal to 0.

*   `public boolean shouldSelfDestruct()`. This method should override the abstract method found in `AI.java`. It should return whether or not `alertLevel` is greater than or equal to `maxAlert`.

*   `public String toString()`. This method returns the String representation of the RogueAI’s fields in the following format:

`"Dr. Chipotle’s guacamole cannon is currently pointed at (cannonTarget), and is at alert level (alertLevel) with firewall protection (firewallProtection)."` **Properly reuse code here or you could lose points**

For example, a possible output of the toString() method could look like this:

`"Dr. Chipotle's guacamole cannon is currently pointed at latitude: 13.31, longitude: 13.01, and is at alert level 10 with firewall protection 5."`


DoctorCS.java
-------------

Our hero, Doctor CS, gets his own class. He will have an AI at his disposal to stop Dr. Guacamole’s evil plan, and has a secret identity that no person, aside from himself, knows about. This class should be **concrete**.

### Fields

This class has the following private fields, **and associated getter and setter methods** for them unless otherwise specified:

*   `AI ai`. This is the AI object upon which you can invoke the various methods to save the day. **Do not create a setter method for this field**.

*   `String secretIdentity`. This contains the Doctor CS’s hidden identity. This **should not be publicly accessible**, and **it should be immutable**. (**Hint**: Based on the description, does this need a setter? Does this need a getter?)

*   `int jlaid`. This is an integer representation of the Doctor CS’s Justice League of America ID. It should be publicly accessible, but like his secret identity, this should also be **immutable**.

*   `boolean safe`. **Do not write a getter for this variable.** This is a boolean that represents whether the threat of Dr. Chipotle has been alleviated. **This instance variable should not be changed outside of the `DoctorCS` class.** (Does this need a setter?)


### Constructor

This class has the following constructor:

*   `public DoctorCS(AI ai, String secretIdentity, int jlaid)`. This constructor takes in an AI object and assigns it to `ai`, a String that is assigned to `secretIdentity`, and an int and stores it in `jlaid`. It should also initialize `safe` to be false.

### Methods

This class has the following public methods:

*   `void saveTheDay()`. This method functions as a conditional setter for the `safe` instance variable. If `ai` is an instance of a `RogueAI`, then continuously invoke the `lowerFirewall()` method while `firewallProtection` is greater than 0. After that is done or if `ai` is simply a `RandomAI`, call `swapCannonTarget()` on the `ai` and pass in the `ai`’s `secretHQ` field. The return value should be assigned to `safe`.

*   `String getStatus()`. This method will return a different String depending on the value of `safe` and the value of `destructed` in the instance `ai`.

If `safe` is true, then return the following: “Doctor CS has saved the day!”

If `safe` is false and the value of `destructed` in the `ai` instance is true, then return the following: “Dr. Chipotle has succeeded in his plan…”

Otherwise, return the following: “The World is still in danger!”

*   `String toString()`. This returns the String representation of Doctor CS’s information in the following format: `"(secretIdentity) aka Doctor CS with JLAID: (jlaid)"`

For example, a possible output of the toString() method could look like this: `"Robert Paulson aka Doctor CS with JLAID: 12345678"`

*   Getters and setters for all fields (unless specified otherwise).


Analysis
--------

`DoctorCS`’s `saveTheDay` method forces you to use `instanceof`. Answer the following questions as a comment at the top of DoctorCS.java:

1.  Why is this not good style?
2.  What changes could we make to AI and it’s subclasses to avoid using instanceof?

**Use no more than 100 words in total to answer both questions.** [Word counter](https://wordcounter.net/)

Grading
-------

General Points (35 points)

*   \[9\] Properly declaring variables for every class. (-1 per missing field)
*   \[5\] `AI.java` is **abstract**, and all other classes besides `AI.java` are **concrete**.
*   \[3 x 7\] Constructors for each class.

`AI.java` (15 points)

*   \[5\] `AI.swapCannonTarget(Coordinates newCoords)`.
*   \[5\] Getters and setters for `AI.java`.
*   \[1\] `AI.selfDestruct()`.
*   \[2\] `AI.toString()`.
*   \[2\] `shouldSwapCannonTarget()` and `shouldSelfDestruct()`.

`RandomAI.java` (4 points)

*   \[4\] Properly overriden and functioning `shouldSwapCannonTarget()` and `shouldSelfDestruct()` methods.

`RogueAI.java` (16 points)

*   \[2\] `RogueAI.lowerFirewall()`.
*   \[4\] `RogueAI.toString()`.
*   \[6\] Getter methods for `RogueAI.java`.
*   \[4\] Properly overriden and functioning `shouldSwapCannonTarget()` and `shouldSelfDestruct()` methods.

`DoctorCS.java` (17 points)

*   \[8\] `DoctorCS.saveTheDay()`.
*   \[3\] `DoctorCS.getStatus()`.
*   \[4\] Getter methods for `DoctorCS.java`.
*   \[2\] `DoctorCS.toString()`.

`Coordinates.java` (13 points)

*   \[8\] The equals method for `Coordinates.java`.
*   \[4\] Getter methods for `Coordinates.java`
*   \[1\] toString() method for `Coordinates.java`.

Analysis (10 bonus points)

Running and Testing
-------------------

[CrimeSimulator.java](CrimeSimulator.java) has been provided for you. It creates an instance of a DoctorCS, RogueAI, and Coordinates and invokes various methods on each. You can run the main method to test the functionality of your code. The tester may not cover all cases described above, so **be sure to write your own code to test your classes and methods**.

Here is the expected output from CrimeSimulator:

Robert Paulson aka DoctorCS with JLAID: 13310001
Dr. Chipotle’s guacamole cannon is currently pointed at latitude: 13.31, longitude: 23.16, and is at alert level 0 with firewall protection 10.
Dr. Chipotle’s guacamole cannon is currently pointed at latitude: 50.00, longitude: 25.50, and is at alert level 5 with firewall protection 0.
Doctor CS has saved the day!
false


Tips and Considerations
-----------------------

**Please start as soon as possible!** The earlier you start this assignment, the more time you will have to think and ask questions. If anything seems confusing, read through the entire description and instructions again. As always, feel free to contact your TAs, post on Piazza, or come in for office hours. In addition, here are some tips specific to this homework:

*   Don’t be intimidated by how long this homework seems! There isn’t any complicated math to deal with, just a lot of methods that need creating.

*   Start by creating the private fields and associated getter (and setter, if applicable) methods in each class, so you can be guaranteed the easiest points.

*   Next, create the constructors for each of the classes as per the specifications. There shouldn’t be anything in the body of the constructors besides variable initializations/assignments.

*   Most of the DoctorCS.java class’s non-getter and setter methods will be invoking methods from RogueAI.java, so keep that in mind when writing your methods and especially if you want to start testing your code early.


Allowed imports
---------------

You are allowed to import the following classes and only the following classes:

*   java.util.Random

Javadocs
--------

*   You will need to write Javadoc comments. Not following the Javadoc requirements will count as checkstyle errors.

*   Every class should have a class level Javadoc that includes `@author <Your Name>`.

    *   Every method should have a Javadoc explaining what the method does and includes any of the following tags if applicable.

    *   `@param <parameter name> <brief description of parameter>`

        *   `@returns <brief description of what is returned>`

            *   `@throws <Exception> <brief explanation of when the given exception is thrown>`

                *   See the [CS 1331 Style Guide](https://cs1331.gitlab.io/cs1331-style-guide.html) section on Javadoc comments for examples as well as the provided `Driver.java` file.


                Checkstyle
                ----------

                You must run checkstyle on your code to check for violations. For each violation the tool finds, you will lose one point on your total grade for this assignment.

                For _this homework_, the **checkstyle cap is 50**, meaning you can lose up to **50** points on this assignment due to style errors. As the semester goes on, this cap will increase with each homework and will eventually go away. **Run checkstyle early, and get in the habit of writing style compliant code the first time**. Don’t wait until 5 minutes before the deadline to find out that you have 100+ violations.

                *   If you encounter trouble running checkstyle, check Piazza for a solution and/or ask a TA as soon as you can!
                *   You can run checkstyle on your code by using the jar file found on the course website that includes xml configuration file specifying our checks. **To check the style of your code run** `java -jar checkstyle-6.2.2.jar *.java`.
                *   **To check your Javadocs run** `java -jar checkstyle-6.2.2.jar -j *.java`.
                *   Note that the command for checking code and the command for checking Javadocs are different. **You will have to run both commands to fully test for style errors.**
                *   Javadoc errors are the same as checkstyle errors, as in each one is worth a single point and they are counted towards the checkstyle cap.

                Collaboration
                -------------

                When completing homeworks for CS1331 you may talk with other students about:

                *   What general strategies or algorithms you used to solve problems in the homeworks
                *   Parts of the homework you are unsure of and need more explanation
                *   Online resources that helped you find a solution
                *   Key course concepts and Java language features used in your solution

                You may **not** discuss, show, or share by other means the specifics of your code, including screenshots, file sharing, or showing someone else the code on your computer, or use code shared by others.

                Examples of approved/disapproved collaboration:

                *   **Approved**: “Hey, I’m really confused on how we are supposed to implement this part of the homework. What strategies/resources did you use to solve it?”
                *   **Disapproved**: “Yo it’s 10:40 on Thursday… Can I see your code? I won’t copy it directly I promise”

                In addition to the above rules, note that it is not allowed to upload your code to any sort of public repository. This could be considered an Honor Code violation, even if it is after the homework is due.

                Submission
                ----------

                Submit your `DoctorCS.java`, `AI.java`, `RandomAI.java`, `RogueAI.java`, and `Coordinates.java` files as attachments to the hw4 assignment on Canvas. Be sure to check Piazza for clarifications and updates before submitting. You can submit as many times as you want, so feel free to submit as you make substantial progress on the homework. We only grade your last submission, meaning we will ignore any previous submissions. **Submit every file every time you resubmit**.

                As always, **late submissions will not be accepted and non-compiling code will be given a score of 0**. For this reason, we recommend submitting early and then confirming that you submitted ALL of the necessary files by re-downloading your file(s) and compiling/running them.

                **Good luck, and have fun!**