package com.LibraryManagement;

public class Book {
	private int Bookid;
	private String title;
	private String author;
	private boolean isavailable;
	private static int counter;
	public Book(int Bookid,String title,String author,boolean isavailable)
	{
		counter++;
		this.Bookid=counter;
		this.title=title;
		this.author=author;
		this.isavailable=isavailable;
	}
	public String DisplayInfo()
	{
		return "Bookid:"+Bookid+" Title:"+title+" Author:"+author+" isavailable:"+isavailable;
	
	}
	 public String toString(int Bookid,String title,String author,boolean isavailable)
	 {
		 return "Bookid:"+Bookid+" Title:"+title+" Author:"+author+" isavailable:"+isavailable;
	 }
	public int getBookid() {
		return Bookid;
	}
	public void setBookid(int bookid) {
		Bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isavailable() {
		return isavailable;
	}
	public void setisavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Book.counter = counter;
	}
	 

}
