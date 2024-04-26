package com.LibraryManagement;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(1,"1984","George Orwell",true);
		Book b2=new Book(2,"To kill a mocking bird","Harper Lee",true);
		Book b3=new Book(3,"The Great Gatsby","F.scott",false);
		System.out.println(b1.DisplayInfo()); 
		System.out.println(b2.DisplayInfo()); 
		System.out.println(b3.DisplayInfo());
		System.out.println("Title of book is: "+b1.getTitle());
		System.out.println("Author of book is: "+b2.getAuthor());
		System.out.println("Availability of the book is: "+(b3.isavailable()?"Available":"Not Available"));
		b3.setTitle("The great gatsby(Updated Edition)");
		b3.setisavailable(true);
		System.out.println("Updated version of book is: "+b3.DisplayInfo());
		System.out.println("Total no of books:"+Book.getCounter());
		

	}

}
