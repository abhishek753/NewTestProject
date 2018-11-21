package arrays;

public class TwodimArray {

	public static void main(String[] args) {
		int rows=3;
		int cols=3;
		
		int table[][]=new int[rows][cols];
		
		//aasign the value in first row.
		
		table[0][0]=1;
		table[0][1]=2;
		table[0][2]=3;
		
		table[1][0]=4;
		table[1][1]=5;
		table[1][2]=6;
		
		table[2][0]=7;
		table[2][1]=8;
		table[2][2]=9;
		//Row length.
		System.out.println(table.length);
		
		//column length.
		System.out.println(table[0].length);
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(" "+table[i][j]);
			}System.out.println(" ");
		}
		

	}

}
