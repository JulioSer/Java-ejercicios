

    class Persona{
        private String nombre;
        private int edad;
        private String telefono;

        //Bloque de setters y getters
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){
            return this.nombre;
        } 

        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return this.edad;
        }

        public void setTelefono(String telefono){
            this.telefono = telefono;
        }
        public String getTelefono(){
            return this.telefono;
        }
      
        public static void main(String[] args){
            Persona persona = new Persona();
            persona.setNombre("Julio");
            persona.setEdad(58);
            persona.setTelefono("+58 426 8802469");

            System.out.println(persona.getNombre());
            System.out.println(persona.getEdad());
            System.out.println(persona.getTelefono());
            
        }

    }