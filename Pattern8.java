package Day8cw;
import java.util.*;
public class Pattern8 {
	public static void main(String[] args) {
		for(int i=0;i<9;i++) {
			for(int j=0; j<5;j++) {
			if(j-i>=-4 && j+i>=4)
				System.out.print("*");
			else
				System.out.print(" ");
				
	}
			System.out.println();
		}
	}
		
	}

