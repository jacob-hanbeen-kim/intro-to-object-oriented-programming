List
====

Introduction
------------

In this homework assignment, you will be exploring the implementation of interfaces. You can think of an interface as a skeleton for a type of object; interfaces give method signatures that must be implemented in any class, which implements the interface. Click this link to learn more about interfaces: [https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html) Remember to refer to the Java API if you are struggling with the concept of interfaces: [https://docs.oracle.com/javase/10/docs/api/overview-summary.html](https://docs.oracle.com/javase/10/docs/api/overview-summary.html)

Problem Description
-------------------

You will be implementing the methods from the interface, `List`, into the concrete class, `MyList`. You will also be using `IllegalArgumentException` and `IndexOutOfBoundsException`.

List
----

This interface is already written and provided for you: [List.java](List.java)

It has the following fields:

*   `int INITIAL_CAPACITY` Represents the default initial capacity of our list.

It has the following methods:

*   `void add(E e)` Adds the passed-in element to the last position in the list and throws an `IllegalArgumentException` if e is null. Consider how you can store this list and the possible problems to account for when using this.
*   `E get(int index)` Selects an element from the given index in the list.
*   `void replace(E e, E replaceWith)` Replaces all instances of `e` with `replaceWith` in the list. This method throws an `IllegalArgumentException` if either of the passed-in elements are `null`.
*   `int remove(E e)` Removes all instances of `e` and returns a count of how many instances were removed. The method throws an `IllegalArgumentException` if `e` is `null`. This method should also be ensuring that null elements are not left in the middle of the list. For example, if there is `{1, 2, 3}` and `remove(2)` is called then the list should not become `{1, null, 3}`.
*   `int contains(E e)` Checks to see how many instances of `e` are in the list and returns this count. The method throws an `IllegalArgumentException` if `e` is `null`.
*   `boolean isEmpty()` Checks to see if there are any objects in the list. If there is at least one object, then this should return `false`. Otherwise, this should return `true`.
*   `void clear()` Should make the entire List empty; all objects are removed from the list.
*   `int size()` Returns the number of non-null elements in the list.
*   `E[] toArray(E[] e)`. Returns the array `e` that was input. `e` should be filled with as many non null elements of the list as it can fit, starting from the beginning of the list (e.g. if `e` is length 3 and the list is `{1,2,3,4,5}`, `e` should be returned as ‘{1,2,3}’). Any extra spots in `e` should be set to null.

MyList
------

Represents a custom array list with generics. Should implement `List`. When the add method is called and the backing array is full, double the size of the backing array then add the element.

It has the following instance fields:

*   `E[] elements` The backing array of generic type E
*   `int size` An int that represents the count of all non-null elements in the array

It has the following constructors:

*   `MyList()` No arg constructor that sets the instance fields.
*   `MyList(int capacity)` Takes in an int capacity to set the initial capacity of the backing array.

NOTE: Since the class implements `List`, it should implement all the methods declared in the interface.

Imports
-------

For this homework, you may not import classes, especially those from `java.util`. Any imports will result in major points deductions.


Tips & Considerations
---------------------

*   Writing a Main class with a main method to test your code would be very useful.
*   Use `toArray()` for debugging purposes
*   We should be able to test your code using any input.