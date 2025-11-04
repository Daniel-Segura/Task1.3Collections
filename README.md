# **Task 1.3 Collections Level 1 y 2**

## Description - Statement of the exercise. 
The purpose of the exercise is to learn how to use collections like ArrayList or HashSet to avoid duplicates, Iterators and the comparator interface

### **- Level 1 (Exercise 1)**
Create a class called Month with a "name" attribute (which will store the name of the month of the year). 
Add 11 Month objects (each with a different attribute) to an ArrayList, except for the object with the "August" attribute.
Then, insert the corresponding month into the ArrayList and demonstrate that it maintains the correct order.
Convert the ArrayList from the previous exercise into a HashSet and ensure that it does not allow duplicates.
Iterate through the list using a for loop and an iterator.

### **- Level 1 (Exercise 2)**
Create and populate a List<Integer>.
Create a second List<Integer> and insert the elements from the first list into the second list in reverse order.
Use ListIterator objects to read the elements from the first list and insert them into the second.

## ----------------------------------------------------------------------------------------------
### **- Level 2 (Exercise 1)**
Create a class called Restaurant with two attributes: name(String) and score(int).
Implement the necessary methods to prevent Restaurant objects with the same name and score from being added to a HashSet created in the application's main() method.

#### *Important*
There can be restaurants with the same name but different ratings, 
but there cannot be restaurants with the same name and the same rating.

### **- Level 2 (Exercise 2)**
Using the class from the previous program, create the necessary implementation so that the objects of the Restaurant class are sorted by name and by score in descending order.

#### *Example:*

Name: restaurant1, Rating: 8

Name: restaurant1, Rating: 7

## **Technologies Used**
**IDE:** IntelliJ IDEA.

**Compiler:** Apache Maven 4.0.0.

**Lenguage:** Java 25.

## **How to Run the Exercises?**
Simply clone the repository, open the project in your IDE, and run the main file of each exercise.

## **Instructions for Reviewers**
I would like it reviewed to ensure that good practices are being used, 
that the methods and classes comply with conventions and are well implemented, 
and that a good structure and good programming logic are verified.
