package AdditionPrograms;

public class FilterEvenNumbers {

	public static void main(String[] args) {
        int arr[]={1,7,8,9,19};

        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0 || arr[i]%10==9){

                System.out.print(arr[i]+" ");
            }
        }

	}

}
