List
Introduction
In this homework assignment, you will be exploring the implementation of interfaces. You can think of an interface as a skeleton for a type of object; interfaces give method signatures that must be implemented in any class, which implements the interface. Click this link to learn more about interfaces: https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html Remember to refer to the Java API if you are struggling with the concept of interfaces: https://docs.oracle.com/javase/10/docs/api/overview-summary.html

Problem Description
You will be implementing the methods from the interface, List, into the concrete class, MyList. You will also be using IllegalArgumentException and IndexOutOfBoundsException. Make sure to check Piazza for updates. There will not be announcements about clarifications on homeworks.

List
This interface is already written and provided for you: List.java

It has the following fields:

int INITIAL_CAPACITY Represents the default initial capacity of our list.
It has the following methods:

void add(E e) Adds the passed-in element to the last position in the list and throws an IllegalArgumentException if e is null. Consider how you can store this list and the possible problems to account for when using this.
E get(int index) Selects an element from the given index in the list.
void replace(E e, E replaceWith) Replaces all instances of e with replaceWith in the list. This method throws an IllegalArgumentException if either of the passed-in elements are null.
int remove(E e) Removes all instances of e and returns a count of how many instances were removed. The method throws an IllegalArgumentException if e is null. This method should also be ensuring that null elements are not left in the middle of the list. For example, if there is {1, 2, 3} and remove(2) is called then the list should not become {1, null, 3}.
int contains(E e) Checks to see how many instances of e are in the list and returns this count. The method throws an IllegalArgumentException if e is null.
boolean isEmpty() Checks to see if there are any objects in the list. If there is at least one object, then this should return false. Otherwise, this should return true.
void clear() Should make the entire List empty; all objects are removed from the list.
int size() Returns the number of non-null elements in the list.
E[] toArray(E[] e). Returns the array e that was input. e should be filled with as many non null elements of the list as it can fit, starting from the beginning of the list (e.g. if e is length 3 and the list is {1,2,3,4,5}, e should be returned as ‘{1,2,3}’). Any extra spots in e should be set to null.
MyList
Represents a custom array list with generics. Should implement List. When the add method is called and the backing array is full, double the size of the backing array then add the element.

It has the following instance fields:

E[] elements The backing array of generic type E
int size An int that represents the count of all non-null elements in the array
It has the following constructors:

MyList() No arg constructor that sets the instance fields.
MyList(int capacity) Takes in an int capacity to set the initial capacity of the backing array.
NOTE: Since the class implements List, it should implement all the methods declared in the interface.

Imports
For this homework, you may not import classes, especially those from java.util. Any imports will result in major points deductions.

Grading
This is a tentative rubric and may be changed.

MyList.java

[10] Properly written constructors for List
[5] Correct instance field names for List
[5] MyList properly implements List
[5] Add method correctly adds valid data to the back of the list
[5] Add method correctly throws Exception for invalid data
[5] Add method resizes the backing array to twice the current capacity
[5] Get method correctly accesses the value in the list of the given index
[5] Get method throws IndexOutOfBoundsException if index is not a valid index in the list
[5] Replace correctly replaces all instances of e with replaceWith
[5] Replace method throws IllegalArgumentException if either e or replaceWith is null
[5] Remove correctly removes all instances of e returning the number of instances removed
[5] Remove method correctly shifts all non-null elements to the front of the backing array after removing
[5] Remove method throws IllegalArgumentException if e is null
[5] Contains correctly removes all instances of e returning the number of instances found
[5] Contains method throws IllegalArgumentexception if e is null
[5] Valid isEmpty method
[5] Valid clear method
[5] Valid size method
[5] toArray method returns as many non-null elements in the list as it can fit
Tips & Considerations
Writing a Main class with a main method to test your code would be very useful.
Use toArray() for debugging purposes
We should be able to test your code using any input.
Javadocs
You will need to write Javadoc comments for this homework.

Every class should have a class level Javadoc that includes @author <GT Username>.

Every method should have a Javadoc explaining what the method does and includes any of the following tags if applicable.

@param <parameter name> <brief description of parameter>

@return <brief description of what is returned>

@throws <Exception> <brief explanation of when the given exception is thrown>

See the CS 1331 Style Guide section on Javadoc comments for examples

Checkstyle
You will be required to follow checkstyle. For each violation the tool finds, you will lose one point on your total grade for this assignment.

For this homework, the checkstyle cap is 100, meaning you can lose up to 100 points on this assignment due to style errors. Run checkstyle early, and get in the habit of writing style compliant code the first time. Don’t wait until 5 minutes before the deadline to find out that you have 100+ violations.

If you encounter trouble running checkstyle, check Piazza for a solution and/or ask a TA as soon as you can!

You can run checkstyle on your code by using the jar file found on the course website like so: java -jar checkstyle-6.2.2.jar -a *.java.

Note that the above is different from the normal method for running checkstyle.* Now, because we want you to javadoc your code, you must add the -a flag. To run checkstyle just for javadocs, you can use the -j flag instead.

Javadoc errors are the same as checkstyle errors, as in each one is worth a single point and they are counted towards the checkstyle cap.

** You will be responsible for running checkstyle on ALL of your code. **

Depending on your editor, you might be able to change some settings to make it easier to write style-compliant code. See the customization tips page (at the bottom) for more information.

Submission
Submit your MyList.java file as attachments to the hw5 assignment on Canvas. You can submit as many times as you want, so feel free to submit as you make substantial progress on the homework. We only grade your last submission, meaning we will ignore any previous submissions. Submit every file every time you resubmit.

As always, late submissions will not be accepted and non-compiling code will be given a score of 0. MyList.java must compile with List.java to receive credit. For this reason, we recommend submitting early and then confirming that you submitted ALL of the necessary files by re-downloading your file(s) and compiling/running them.

Good luck, and have fun!