public class Main {   
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
         System.out.print("\n");   
        }
        
        System.out.print("\n\n");
        
        int x = 1;
        for(int i = 5; i > 0; i--) {
          for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
          
            for(int j = 0; j < x; j++) {
                System.out.print("*");
            }
            x += 2;
            System.out.print("\n");
        }
        
        
        System.out.print("\n\n");
        for(int i = 6; i >= 1; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
         System.out.print("\n");   
        }
    }
    
}
