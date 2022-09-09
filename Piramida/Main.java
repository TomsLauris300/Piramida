
    public class Main {
        public static void main(String[] args) {

            for (int i = 0; i < 5; i++) {
                for (int a = 5; a >=i; a--) {
                    System.out.print(" ");
                }
                for (int b=0; b<=i; b++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

