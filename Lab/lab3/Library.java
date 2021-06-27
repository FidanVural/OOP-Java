package lab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.LinkedList;

public class Library {
	
	Map<Student, Book> map = new HashMap<Student, Book>();
	ArrayList <Student> s_list;
	LinkedList <Book> b_list;
	Student snext;
	boolean flag = false;
	
	public void borrowBook(ArrayList<Student> s_list, LinkedList<Book> b_list) {
		this.s_list = s_list;
		this.b_list = b_list;
		int i = 0;
		
       while(i != b_list.size()) {
    	   map.put(s_list.get(i), b_list.get(i));
    	   i++;
       }
       
       snext = s_list.get(i);
    }
	
	public void mapPrint() {
		for (Entry<Student, Book> m : map.entrySet()) {
			System.out.println(m.getKey().getNumber() + "numbered student borrowed -> " + m.getValue().getBook_name());
		}
		
		if(map.isEmpty()==true)
			System.out.println("No students to borrow book");
	}
	
	public void returnBook(Student stu) {
		Book book = null;
		
		for(Entry<Student, Book> m : map.entrySet())
			if(m.getKey().getNumber() == stu.getNumber())
				book = m.getValue();
		
		if(book != null){
			map.remove(stu);
			if(flag != true){
				map.put(snext, book);
				if(snext==s_list.get(s_list.size()-1))
					flag=true;
			}
		}
		else {
			System.out.println(stu.getName() +" has already returned the book.");
			return;
		}
	}
	
	
	public void newBook() throws BookException{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter book name: ");
		String b_name = in.nextLine();
		System.out.println("Enter author name: ");
		String a_name = in.nextLine();
		in.close();
		
		int i=0;
		while(i != b_list.size()){
			if(b_list.get(i).getBook_name().equalsIgnoreCase(b_name)  && b_list.get(i).getAuthor().equalsIgnoreCase(a_name)){
				throw new BookException("Library has this book!");
			}
			i++;
		}
		
		b_list.add(new Book(b_name,a_name));
		System.out.println("New book added.");
		
	}
}
