package com.xworkz.copy.AccessSpecifier;

public class StoryDetail {
public void modifyNovel(Stories story) {
		
		story.setBookName("The girl in room 105");
		System.out.println(story.getBookName());
		story.setPrice(150);
		System.out.println(story.getPrice());
		story.setLanguage("English");
		System.out.println(story.getLanguage());
		story.setWriter("ChetanBhagat");
		System.out.println(story.getWriter());
		story.setBookQuality(true);
		System.out.println(story.isBookQuality());
		story.setNoOfPages(500);
		System.out.println(story.getNoOfPages());
		story.setNoOfchapters(20);
		System.out.println(story.getNoOfchapters());
		story.setIntresting(true);
		System.out.println(story.isIntresting());
		story.setTypeOfNovel("thrillers");
		System.out.println(story.getBookName());
		story.setReleasedYear(2015);
		System.out.println(story.getReleasedYear());
		
	}

}
