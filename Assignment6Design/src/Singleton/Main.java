package Singleton;

public class Main {
   
        public static void main(String[] args){
            Apiary a = Apiary.getInstance();
            Apiary b = Apiary.getInstance();
            
            
            if(a == b){ // Shows only one instance is made
                System.out.println(a.s); 
            }
        }

}
