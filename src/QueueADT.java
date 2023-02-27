//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:    QueueADT<T>
// Course:   CS 300 Spring 2022
//
// Author:   Heewon Kim
// Email:    hkim936@wisc.edu
// Lecturer: Hobbes LeGault
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:    NONE
// Partner Email:   NONE
// Partner Lecturer's Name: NONE
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//   ___ Write-up states that pair programming is allowed for this assignment.
//   ___ We have both read and understand the course Pair Programming Policy.
//   ___ We have registered our team prior to the team registration deadline.
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Persons:         NONE
// Online Sources:  NONE
//
///////////////////////////////////////////////////////////////////////////////

public interface QueueADT<T> {

    /**
     * Adds the given data to this queue; every addition to a queue is made at the back
     *
     * @param element the data to add
     */
    public void enqueue(T element);

    /**
     * Removes and returns the item from this queue that was least recently added
     *
     * @return the item from this queue that was least recently added
     */
    public T dequeue();

    /**
     * Returns the item least recently added to this queue without removing it
     *
     * @return the item least recently added to this queue
     */
    public T peek();

    /**
     * Checks whether the queue contains any elements
     *
     * @return true if this queue is empty; false otherwise
     */
    public boolean isEmpty();

    /**
     * Returns the number of items in this queue
     *
     * @return the number of items in this queue
     */
    public int size();

    /**
     * Returns a string representation of this queue, beginning at the front (least recently
     * added) of the queue and ending at the back (most recently added). An empty queue is
     * represented as an empty string; otherwise items in the queue are represented using their
     * data separated by spaces
     *
     * @return the sequence of items in FIFO order, separated by spaces
     */
    public String toString();
}
