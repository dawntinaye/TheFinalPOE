/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chitunhulearnertasktwo;

/**
 *
 * @author RC_Student_lab
 */
public class ChitunhuLearnerTaskTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

public class Learner {
    // Attributes
    private String fullName;
    private String subject;
    private double assignmentMark;
    private double testMark;
    private double examMark;

    // Default Constructor
    public Learner() {
        fullName = "";
        subject = "";
        assignmentMark = 0.0;
        testMark = 0.0;
        examMark = 0.0;
    }

    // Accessor Methods
    public String getFullName() {
        return fullName;
    }

    public String getSubject() {
        return subject;
    }

    public double getAssignmentMark() {
        return assignmentMark;
    }

    public double getTestMark() {
        return testMark;
    }

    public double getExamMark() {
        return examMark;
    }

    // Mutator Methods
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAssignmentMark(double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }

    public void setTestMark(double testMark) {
        this.testMark = testMark;
    }

    public void setExamMark(double examMark) {
        this.examMark = examMark;
    }

    // Method to calculate the final mark
    public double calcFinalMark() {
        return (assignmentMark + testMark + examMark) / 3.0;
    
  // Method to get the student's details
    }
   
