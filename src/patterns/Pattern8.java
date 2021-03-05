package patterns;

public class Pattern8 {

    public static void main(String[] args) {

        System.out.print("       @");
        System.out.println();
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i;
                 j++) {
                System.out.print(" ");
            }
            System.out.print("@");
            for (int
                 k = 6; k >= i; k--) {
                System.out.print(" ");
            }
            for (int k = 6; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print("@");
            System.out.println();
        }

        /*  inverse part*/

        for (int i = 6; i >= 1; i--) {
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print("@");
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            System.out.print("@");
            System.out.println();
        }


    }


}
/*
  @
     @  @
    @    @
   @      @
  @        @
 @          @
@            @
 @          @
  @        @
   @      @
    @    @
     @  @
      @@
 */