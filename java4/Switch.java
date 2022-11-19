public class Switch {
    public static void main(String[] args) {
        String estacion = "INVIERNO";
        estacion = estacion.toLowerCase();

        switch(estacion){
            case "invierno":
              System.out.println("La estación es Invierno");
              break;

              case "verano":
              System.out.println("La estación es Verano");
              break;

              case "otoño":
              System.out.println("La estación es Otoño");
              break;

              case "primavera":
              System.out.println("La estación es Primavera");
              break;
               case default:
              System.out.println("No hay estación");
              break;
        }
    }
}
