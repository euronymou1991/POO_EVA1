
package eva1_3_constructores;


public class EVA1_3_CONSTRUCTORES {

    
    public static void main(String[] args) {
        // CLASE IDENTIFICADOR = new CONSTRUCTOR();
        CuentaBancaria cuenta1 = new CuentaBancaria("100",1000000,"Carlos Slim"); 
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta1.getnomCliente());
        System.out.println(cuenta1.getsaldo());
        System.out.println(cuenta1.getnocuenta());
        
        CuentaBancaria cuenta2 = new CuentaBancaria("500",45, "Daniel");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta2.getnomCliente());
        System.out.println(cuenta2.getsaldo());
        System.out.println(cuenta2.getnocuenta());
        
        CuentaBancaria cuenta3 = new CuentaBancaria("300",10, "Juana");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta3.getnomCliente());
        System.out.println(cuenta3.getsaldo());
        System.out.println(cuenta3.getnocuenta());
    }
    
}
