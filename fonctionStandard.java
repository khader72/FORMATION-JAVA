//Definir le nom de la class HelloWorld et la rendre public
public class Boucle {//Debut class
    //Definir le nom de la methode principal et la rendre public
    public static void main(String[] args) {//Debut methode
        //Afficher un la moyenne
       //Boucle.mabouclesimple();
       Boucle.menu();
    }
   
     public static void menu(){
        String[] eleves = {"Koffi","Diomande","Kone","Fanny","Konan","Tehoua","Tehoua"};
        
        for(String eleve :eleves){
            boolean reponse = eleve.startsWith("D");
            
            if(reponse==true){
                int nb = eleve.length();
                String maj = eleve.toUpperCase();
                System.out.println(eleve);
                System.out.println(nb);
                System.out.println(maj);

                
            }
        }
    }
       
    
    
    
}
