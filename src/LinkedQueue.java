//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:    LinkedQueue<T>
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

import java.util.NoSuchElementException;

/**
 * A generic implementation of a linked queue
 *
 * @param <T> The type of data to be contained in the queue
 */
public class LinkedQueue<T> implements QueueADT<T> {

    protected Node<T> back; // The node at the back of the queue, added MOST recently
    protected Node<T> front; // The node at the front of the queue, added LEAST recently
    private int n; // The number of elements in the queue

    @Override
    public void enqueue(T data) {
        Node<T> node = new Node<>(data);

        if (isEmpty()) {
            this.front = node;
            this.back = node;
        } else {
            this.back.setNext(node);
            this.back = this.back.getNext();
        }
        n++;
    }

    @Override
    public T dequeue() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Error: this queue is empty");
        }
        T last = this.front.getData();

        if (n == 1) {
            this.back = null;
        }
        this.front = this.front.getNext();
        n--;
        return last;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Error: this queue is empty");
        }
        return front.getData();
    }

    @Override
    public boolean isEmpty() {
        if (n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public String toString() {
        String items = "";
        if (n != 0) {
            Node<T> curr = this.front;
            for (int i = 0; i < n; i++) {
                items += curr.getData() + " ";
                curr = curr.getNext();
            }
        }
        return items;
    }
}
