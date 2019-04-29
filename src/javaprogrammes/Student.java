package javaprogrammes;

public class Student {
	
	int id;
	String name;
	
	public void insertrecord(int iddetail, String namedetail){
		id=	iddetail;
		name=namedetail;		
	}
	public void displayresult(){
		System.out.println(id);
		System.out.println(name);
		
	}

}

