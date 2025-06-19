package com.example.comp1011spring2025thursdays5pm;
public class Student {
    public int StudentNumber;
    public String StudentFirstName;
    public String StudentLastName;
    public String StudentPhoneNumber;
    public String StudentAddress;

    public Student(int studentNum, String firstName, String lastName, string telephone, String address, String province, int avgGrade, String major) {
    this.StudentNumber = studentNum;
    this.StudentFirstName = firstName;
    this.StudentLastName = lastName;
    this.StudentPhoneNumber = String.valueOf(telephone);
    this.StudentAddress = address;
    this.averageGrade = avgGrade;
    this.major = major;
    }

    enum Provinces {AB, BC, MB, NB, Nl, NS, NT, NU, ON, PE, QC, SK, YT};
    public int averageGrade;
    public String major;

    public int getStudentNumber() {
        return StudentNumber;
    }
    public void setStudentNumber(int studentNumber) {
        if (studentNumber < 200034000)
            throw new IllegalArgumentException("Student number cannot be less than 200034000");
        this.StudentNumber = studentNumber;
    }
    public String getStudentFirstName() {
        return StudentFirstName;
    }
    public void setStudentFirstName(String studentFirstName) {
        if (studentFirstName == null || studentFirstName.length() < 1)
            throw new IllegalArgumentException("Student first name must have more than 1 character");
        this.StudentFirstName = studentFirstName;
    }
    public String getStudentLastName() {
        return StudentLastName;
    }
    public void setStudentLastName(String studentLastName) {
        if (studentLastName == null || studentLastName.length() < 1)
            throw new IllegalArgumentException("Student last name must have more than 1 character");
        this.StudentLastName = studentLastName;
    }
    public int getStudentPhoneNumber() {
        return StudentPhoneNumber;
    }
    public void setStudentPhoneNumber(int studentPhoneNumber) {
        if (studentPhoneNumber < 1000000)
            throw new IllegalArgumentException("Student phone number must match the american number");
        this.StudentPhoneNumber = studentPhoneNumber;
    }
    public String getStudentAddress() {
        return StudentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        if (studentAddress == null || studentAddress.length() < 6)
            throw new IllegalArgumentException("Student address must have more than 6 characters");
        this.StudentAddress = studentAddress;
    }
    public int getAverageGrade() {
        return averageGrade;
    }
    public void setAverageGrade(int averageGrade) {
        if (averageGrade < 0 || averageGrade > 100)
            throw new IllegalArgumentException("Average grade must be between 0 and 100");
        this.averageGrade = averageGrade;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        if (major == null || major.length() < 5)
            throw new IllegalArgumentException("Major must have more than 5 characters");
        this.major = major;
    }


}