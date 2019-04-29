package javaprogrammes;

public class Javaarray {

	public static void main(String[] args) {
		/*int a[]=new int[5];//declaration and instantiation 
		a[0]=10;//intialization
	    a[1]=20;
	    a[2]=30;
	    a[3]=40;
	    a[4]=50;*/
		int a[]={10,20,30,40,50};//onother way for declaration,instantiation &intialization
	    
	    //length is the property of array
	    for(int i=0; i<a.length; i++){
	    	System.out.println(a[i]);
	    }	
	}
}
