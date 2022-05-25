/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapLapTrinh;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Student extends Person implements Serializable{
    private String studentId;
    private String major;
    private Date enrolledDate;

    public Student() {
    }

    public Student(String studentId, String major, Date enrolledDate, String name, Date birthday, byte gender) {
        super(name, birthday, gender);
        this.studentId = studentId;
        this.major = major;
        this.enrolledDate = enrolledDate;
    }
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(Date enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    @Override
    public String toString() {
        String ketQua = super.toString();
        return "Student{" +ketQua+ ",studentId=" + studentId + ", major=" + major + ", enrolledDate=" + enrolledDate + '}';
    } 
}


 
