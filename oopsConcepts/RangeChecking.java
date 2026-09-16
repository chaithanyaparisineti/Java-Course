package oopsConcepts;
public class RangeChecking {
	public static void main(String[] args) {
		int[][]ranges= {
				{1,6},
				{2,3},
				{0,5},
				{1,8},
		};
		for(int i=0;i<ranges.length;i++) {
			if(i==ranges.length-1) {
				System.out.println("0");
			}else if(ranges[i+1][0]>=ranges[i][0] &&
					ranges[i+1][1]<=ranges[i][1]
					) {
			System.out.println("1");
			}
		else {
			System.out.println("0");
		}
		}
	}
}
		
	

	


