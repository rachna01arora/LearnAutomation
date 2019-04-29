package javaprogrammes;

public class sortingarray {
	
	public static void main(String[] args) {
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println(i.length);
	
		for(int j=0; j<i.length; j++){
			System.out.println(i[j]);
			
		}
		System.out.println("*****************************");
		Object ob[]=new Object[5];
		ob[0]=10;
		ob[1]="Hello";
		ob[2]='a';
		ob[3]=true;
		ob[4]=10.55;
		
		for (int k=0; k<ob.length; k++){
			System.out.println(ob[k]);
		}
		System.out.println("*****************************");
		Object obj1[][]=new Object[3][5];
		
		obj1[0][0]="S.No";
		obj1[0][1]="RollNo";
		obj1[0][2]="Username";
		obj1[0][3]="Id";
		obj1[0][4]="Detail";
		
		obj1[1][0]=1;
		obj1[1][1]=01;
		obj1[1][2]="Akshat";
		obj1[1][3]=1111;
		obj1[1][4]="student";
		
		
		obj1[2][0]=2;
		obj1[2][1]=02;
		obj1[2][2]="Bini";
		obj1[2][3]=1112;
		obj1[2][4]="student";
		
		//System.out.println(obj1.length);
		//System.out.println(obj1[1].length);
		
		for (int row=0; row<obj1.length; row++){
			for(int col=0; col<obj1[0].length; col++){
				System.out.println(obj1[row][col]);
			}
		}
		
		
		}
	}
	


