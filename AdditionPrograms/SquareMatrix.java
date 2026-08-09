package AdditionPrograms;

public class SquareMatrix {

	public static void main(String[] args) {
		int n=5;

        char[][] a=new char[n][n];

        String name="DHONI";

        char ch='A';

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                if(i==j || j==n-1-i){

                    a[i][j]=name.charAt(i);

                }else{

                    while(name.indexOf(ch)!=-1)
                        ch++;

                    a[i][j]=ch;
                    ch++;
                }
            }
        }

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }

	}

}
