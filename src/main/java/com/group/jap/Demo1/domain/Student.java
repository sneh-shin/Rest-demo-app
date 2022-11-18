/*
 *Author Name: Sneha Shinde
 *Date: 11/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.group.jap.Demo1.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student {
    @Id
    private int sid;
    private String sname;
    private int smarks;

    public Student() {
    }

    public Student(int sid, String sname, int smarks) {
        this.sid = sid;
        this.sname = sname;
        this.smarks = smarks;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSmarks() {
        return smarks;
    }

    public void setSmarks(int smarks) {
        this.smarks = smarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", smarks=" + smarks +
                '}';
    }
}
