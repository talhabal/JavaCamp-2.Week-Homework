
public class Post {
	int id;
	String pictures;
	String courseName;
	String teacherName;
	
	public Post() {
		System.out.println("Constructor Çalýþtý!");
		
	}
	public Post(int id, String pictures, String courseName, String teacherName ) {
		this();
		this.id =id;
		this.pictures = pictures;
		this.courseName = courseName;
		this.teacherName = teacherName;
	}

}
