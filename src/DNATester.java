//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:    DNATester
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
 * Test methods to verify your implementation of the methods for P08.
 */
public class DNATester {

    //TODO: verify your LinkedQueue implementation directly

    /**
     * To test adding and removing things from your queue
     *
     * @return true if enqueue, dequeue and peek work correctly. Otherwise, false.
     */
    public static boolean testEnqueueDequeue() {
        LinkedQueue<Character> testChar = new LinkedQueue<>();
        String expected = "E";

        try {
            testChar.enqueue('A');
            testChar.enqueue('B');
            testChar.enqueue('C');
            testChar.dequeue();
            testChar.dequeue();
            testChar.enqueue('D');
            testChar.enqueue('E');
            testChar.dequeue();
            testChar.dequeue();
            testChar.peek();
        } catch (NoSuchElementException | NullPointerException e) {
            System.out.println(e.getMessage());
            return false;
        }
        if (testChar.size() != 1) {
            return false;
        }
        if (!testChar.toString().trim().equals(expected)) {
            return false;
        }
        return true;
    }

    /**
     * To test the queue’s size and isEmpty methods
     *
     * @return true if is not empty and size is correct. Otherwise, false.
     */
    public static boolean testQueueSize() {
        LinkedQueue<Character> testChar = new LinkedQueue<>();
        try {
            testChar.enqueue('A');
            testChar.enqueue('B');
            testChar.enqueue('C');
            testChar.dequeue();
            testChar.dequeue();
            testChar.peek();
            testChar.enqueue('D');
            testChar.enqueue('E');
            testChar.dequeue();
        } catch (NoSuchElementException | NullPointerException e) {
            System.out.println(e.getMessage());
            return false;
        }
        if (testChar.isEmpty()) {
            return false;
        }
        if (testChar.size() != 2) {
            return false;
        }
        return true;
    }

    /**
     * Tests the transcribeDNA() method
     *
     * @return true if and only if the method works correctly
     */
    public static boolean testTranscribeDNA() {
        DNA testDNA = new DNA("GGAGTCAGTTAAGCGACCGGGACATACTGTCTTGGTAATCTCCGAGCTAGAAAGTCTCTG");
        String mRNA = "CCUCAGUCAAUUCGCUGGCCCUGUAUGACAGAACCAUUAGAGGCUCGAUCUUUCAGAGAC";
        System.out.println(testDNA.transcribeDNA().toString());
        if (testDNA.transcribeDNA().toString().replaceAll(" ", "").equals(mRNA)) {
            return true;
        }
        return false;
    }

    /**
     * Tests the translateDNA() method
     *
     * @return true if and only if the method works correctly
     */
    public static boolean testTranslateDNA() {
        DNA testDNA = new DNA("GGAGTCAGTTAAGCGACCGGGACATACTGTCTTGGTAATCTCCGAGCTAGAAAGTCTCTG");
        System.out.println(testDNA.translateDNA().toString());
        if (testDNA.translateDNA().toString().replaceAll(" ", "").equals("PQSIRWPCMTEPLEARSFRD")) {
            return true;
        }
        return false;
    }

    // TODO: verify the mRNATranslate() method

    /**
     * To test the DNA class’ mRNATranslate method
     *
     * @return true if mRNATranslate method work correctly. Otherwise, false.
     */
    public static boolean testMRNATranslate() {
        DNA testDna = new DNA("GTGACCTTC");
        String expected = "H W K ";
        if (!testDna.mRNATranslate(testDna.transcribeDNA()).toString().equals(expected)) {
            return false;
        }
        return true;
    }

    /**
     * Main method - use this to run your test methods and output the results (ungraded)
     *
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("testTranscribeDNA: " + testTranscribeDNA());
        System.out.println("testTranslateDNA: " + testTranslateDNA());
        System.out.println("testEnqueueDequeue: " + testEnqueueDequeue());
        System.out.println("testQueueSize: " + testQueueSize());
        System.out.println("testMRNATranslate: " + testMRNATranslate());
    }

}
