public class Taegeukgi {
	
	
	public static void main(String[] args) {
		String[][] taegeukgi = new String[21][42];
		for(int row=0; row<21; row++) {
			for(int col=0; col<42; col++) {
				taegeukgi[row][col] = " ";
			}
		}
		
		for(int i=1; i<=5; i++) {
			draw(taegeukgi, i);
		}
		
		for(int i=0; i<21; i++) {
			for(int j=0; j<42; j++) {
				System.out.print(taegeukgi[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n\n\n1945년 8월 15일, 대한독립만세!!");
	}
	
	public static void draw(String[][] taegeukgi, int i) {
		
		
		if(i == 1) {
			int col=0;
			for(int row=6; row>=0; row--) {
				taegeukgi[row][col] = "*";
				taegeukgi[row][col+1] = "*";
				taegeukgi[row][col+3] = "*";
				taegeukgi[row][col+4] = "*";
				taegeukgi[row][col+6] = "*";
				taegeukgi[row][col+7] = "*";
				
				col ++;
			}
			
		} else if(i == 2) {
			int col=0;
			for(int row=14; row<21; row++) {
				taegeukgi[row][col] = "*";
				taegeukgi[row][col+1] = "*";
				if(row != 17 ) {
					taegeukgi[row][col+3] = "*";
					taegeukgi[row][col+4] = "*";
				}
				taegeukgi[row][col+6] = "*";
				taegeukgi[row][col+7] = "*";
				
				col++;
			}
		} else if(i == 3) {
			int col=28;
			for(int row=0; row<=6; row++) {
				if(row != 3) {
					taegeukgi[row][col] = "*";
					taegeukgi[row][col+1] = "*";
				}
				taegeukgi[row][col+3] = "*";
				taegeukgi[row][col+4] = "*";
				
				if(row != 3) {
					taegeukgi[row][col+6] = "*";
					taegeukgi[row][col+7] = "*";
				}
				col++;
			}
		} else if(i == 4) {
			int col=41;
			for(int row=14; row<21; row++) {
				if(row != 17) {
					taegeukgi[row][col] = "*";
					taegeukgi[row][col-1] = "*";
					taegeukgi[row][col-3] = "*";
					taegeukgi[row][col-4] = "*";
					taegeukgi[row][col-6] = "*";
					taegeukgi[row][col-7] = "*";
				}
				
				col--;
			}	
		} else {
			int row=7;
			for(int col=19; col<=22; col++) {
				taegeukgi[row][col] = "*";
			}
			row ++;
			for(int col=18; col<=23; col++) {
				taegeukgi[row][col] = "*";
			}
			row ++;
			for(int col=17; col<=24; col++) {
				taegeukgi[row][col] = "*";
				if(23<=col && col<=24) taegeukgi[row][col] = "ㆍ";
			}
			row ++;
			
			for(int col=16; col<=25; col++) {
				taegeukgi[row][col] = "*";
				if(21<=col&&col<=25) taegeukgi[row][col] = "ㆍ";
			}
			row++;
			
			for(int col=17; col<=24; col++) {
				taegeukgi[row][col] = "ㆍ";
				if(17<=col && col<=18) taegeukgi[row][col] = "*";
			}
			row++;
			for(int col=18; col<=23; col++) {
				taegeukgi[row][col] = "ㆍ";
			}
			row ++;
			for(int col=19; col<=22; col++) {
				taegeukgi[row][col] = "ㆍ";
			}
		}
}
}
