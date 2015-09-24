package somadivisores;

public class SomaDivisores {
    
    public static double somaDivisores(double n){
        
       double d = 2;
       double s = 1;
       
       while(d <= (n/2)){
           if((n%d) == 0){
               s = s + d;
           }
           d = d + 1;
       }
       return s;
    }

    public static void main(String[] args) {
        
        System.out.println(somaDivisores(6));
       
    }
    
}
