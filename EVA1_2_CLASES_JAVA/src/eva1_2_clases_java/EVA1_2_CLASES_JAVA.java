package eva1_2_clases_java;


public class EVA1_2_CLASES_JAVA {

   
    public static void main(String[] args) {
       //CREAR UN OBJETO
      //INSTACIACIÓN --> DAR MEMORIA RAM
        //NOMBRE DE LA CLASE IDENTIFICADOR = new CONSTRUCTOR DE LA CLASE ();
        Persona perso1 = new Persona (); // Persona () es el constructor
        /*perso1.nombre = "Juan" ;
        perso1.apellidos = "Fernandez" ;
        System.out.println(perso1.nombre + " " +perso1.apellidos);*/
     perso1.setNombre("Juan");
     perso1.setApellidos("Fernandez");
     perso1.setEdad(30);
     perso1.setGenero('H');
        /*System.out.println(perso1.getNombre());
         System.out.println(perso1.getApellidos());
          System.out.println(perso1.getEdad());
           System.out.println(perso1.getGenero());*/
     perso1.imprimirDatos();
     //----               //CONSTRUCTOR
     Persona perso2 = new Persona ();
     perso2.setNombre("Sasha");
     perso2.setApellidos("Ramones");
     perso2.setEdad(65);
     perso2.setGenero('M');
     perso2.imprimirDatos();
    }
    
}
