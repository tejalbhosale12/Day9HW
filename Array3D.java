package Day8cw;
import java.util.*;
public class Array3D {
	public static void main(String[] args) {
		int[][][]Number= {
				{
					{1,2},
					{3,4}
				},
				{
					{5,6},
					{7,8}
				}
		};
		for(int i=0; i < Number.length; i++) {
			for(int j=0; j < Number.length; j++) {
				for(int k=0; k < Number.length; k++) {
					System.out.print(Number[i][j][k]+"");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
