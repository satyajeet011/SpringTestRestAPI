package com.springrest.springrest.entities;

public class Course {
	private long id;
	private String title;
	private String description;
	private long price;
	private String  mentor;
	public Course(long id, String title, String description, long price, String mentor) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.mentor = mentor;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", mentor=" + mentor + "]";
	}
	

} 