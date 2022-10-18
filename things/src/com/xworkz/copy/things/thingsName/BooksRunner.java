package com.xworkz.copy.things.thingsName;

import com.xworkz.copy.things.Books;

public class BooksRunner {

	public static void main(String[] args) {
		String[] BookType= {"written","blank","newBook","oldBook","poetry","notes"};
		String[] authors= {"vikramSeth","ChetanBhagat","ArundhatiRoy","AmitavGhosh"};
		String[] BookBrand= {"classmate","vidhya","vikky"};
		String[] pageType= {"white","buff","a4sheet","ruled","unruled"};
		String[] bindType= {"thin","thick","long","short"};
		String[] pageNum= {"200page","150page","50pages"};
		
		Books book=new Books("Notes", BookType, authors, BookBrand, 7, 4.4f, false, true, pageType, bindType, pageNum);
		book.display();
	}

}
