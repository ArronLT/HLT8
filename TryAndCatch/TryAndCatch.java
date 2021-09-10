package TryAndCatch;


// TRY AND CATCH ARRAY 3 NOT FOUND

public class TryAndCatch {

    public static void main(String[] args) {
        try {
            int[] a = {4, 5, 1};
            System.out.println(a[3]);
        } catch(Exception e) {
            System.out.println("There is a problem here!");
        }
    }
}




