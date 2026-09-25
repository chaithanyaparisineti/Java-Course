package ExceptionHandling;

public class TestEHP {
      static int test() {
    try {
		 System.out.println("A");
		 try {
		  System.out.println("B");
		  int x = 10 / 0;
          System.out.println("C");
        } catch (ArithmeticException e) {
           System.out.println("D");
           try {
               System.out.println("E");
               String s = null;
               System.out.println(s.length());

           } catch (NullPointerException ex) {

               System.out.println("F");

           } finally {

               System.out.println("G");
           }

           return 10;
        } finally {

            System.out.println("H");

            try {
                System.out.println("I");
                return 20;

            } finally {

                System.out.println("J");
                return 30;
            }
        }
    } catch (Exception e) {

        System.out.println("K");
        return 40;

    } finally {

        System.out.println("L");
    }
}

	    public static void main(String[] args) {

	        System.out.println("M");

	        int result = test();

	        System.out.println("N");
	        System.out.println(result);
	    }
}


		               
		          
