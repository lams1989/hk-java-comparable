package com.luiggy.java;

public class Student implements Comparable<Student> {
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
    @Override
    public int compareTo(Student o2) {
        if (this.getCgpa() == o2.getCgpa()) {
            if (this.getFname().compareTo(o2.getFname()) == 0) {
                if (this.getId() == o2.getId()) {
                    return 0;
                }else if (this.getId() > o2.getId()) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                return this.getFname().compareTo(o2.getFname());
            }
        } else if (this.getCgpa() > o2.getCgpa()) {
            return -1;
        }else {
            return 1;
        }
    }
}