class Main{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1000.00, "Julio", 58, "+58 426 8802469");
        System.out.println("Nombre del cliente: " + cliente1.nombre);
        System.out.println("Edad: " + cliente1.edad);
        System.out.println("Telefono: " + cliente1.telefono);
        System.out.println("Crédito: " + cliente1.credito);
        System.out.println();

        Trabajador trabajador1 = new Trabajador(500.00, "Pedro", 25, "+58 424 7703455");
        System.out.println("Nombre del trabajador: " + trabajador1.nombre);
        System.out.println("Edad: " + trabajador1.edad);
        System.out.println("Telefono: " + trabajador1.telefono);
        System.out.println("Salario: " + trabajador1.salario);
     }

}//fin de class Main

class Persona{
   String nombre;
   int edad;
   String telefono;
        }

class Cliente extends Persona{
       double credito;

    Cliente (double credito, String nombre, int  edad, String telefono){
        this.credito = credito;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
                
        }
  }

class Trabajador extends Persona{
     double salario;

    Trabajador (double salario, String nombre, int  edad, String telefono){
        this.salario = salario;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        
    }
 }