 public class Coche {
    int numPuertas = 4;
    public void Incrementa(){
        this.numPuertas += 1;
        }
  
    
    public static void main(String[] args){
         Coche miCoche = new Coche(); 
          miCoche.Incrementa();
          System.out.println("Total puertas: " + miCoche.numPuertas);
    }
    }