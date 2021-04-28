

public class Main {

	public static void main(String[] args) {
		Post post1 = new Post(1,"java.png","Java Programlama","Engin Demiroð");
		Post post2 = new Post(2,"csharp.png","C# Programlama","Ahmet Bayrak");
		Post post3 = new Post(3,"phyton.png","Phyton Programlama","Zeynep Demir");
		
		Post[] posts = {post1,post2,post3};
		for (Post post : posts) {
			System.out.println();
			System.out.println(post.id);
			System.out.println(post.pictures);
			System.out.println(post.courseName);
			System.out.println(post.teacherName);
		}
		
		Menu block1 = new Menu();
		block1.id = 1;
		block1.blockName = "Kurslarým";
		
		Menu block2 = new Menu();
		block2.id = 2;
		block2.blockName = "Tüm kurslar";
		
		Menu block3 = new Menu();
		block3.id = 3;
		block3.blockName = "Kampa Hazýrlýk";
		
		Menu block4 = new Menu();
		block4.id = 4;
		block4.blockName = "Sýk Sorulan Sorular";
		
		Menu[] blocks = {block1,block2,block3,block4};
		for(Menu block : blocks) {
			System.out.println(); 
			System.out.println(block.id);
			System.out.println(block.blockName);
		}
		
		MenuOperations menu = new MenuOperations();
		System.out.println();
		menu.addBlockTheMenu(block4);
		menu.deleteBlockTheMenu(block3);
		
	}
	
}
