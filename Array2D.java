package Day8cw;
import java.util.*;
public class Array2D {
	public static void main(String[] args) {
		int [][]Number= {
				{1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
		};
		for(int i=0;i<Number.length;i++) {
			for(int j=0;j<Number.length;j++) {
				System.out.print(Number[i][j]+"");
			}
			System.out.println();
		}
	}
}
