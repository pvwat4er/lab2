public class Outer {
    private String message = "gnhhnhn";
    private static String staticMessage = "jjjytj";

    class Inner {

        void viewMessage() {
            System.out.println(message);
        }
    }
    static class Nested{
           void viewMessage() {
               System.out.println(staticMessage);
           }

        }

}
