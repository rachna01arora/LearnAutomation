package javaprogrammes;

public class Studentarray {
	
	int rollno;
	String name;
	Studentarray (int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}
	public static void main(String[] args) {
		
		Studentarray[] arr= new Studentarray[2];
		arr[0]=new Studentarray(1, "rachna");
		arr[1]=new Studentarray(2, "lolo");  
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i].rollno+" "+arr[i].name);
		}
}
}
