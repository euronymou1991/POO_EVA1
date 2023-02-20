
package eva1_5_circulo;


public class EVA1_5_CIRCULO {

  
    public static void main(String[] args) {
    
        Circulo circu1 = new Circulo();
        circu1.setRadio(10);
        double area = circu1.calcularArea();
        System.out.println("Área: "+ circu1.calcularArea());
        System.out.println("Perímetro: "+circu1.calcularPeri());
        
        circu1.setRadio(20);
        System.out.println("Área: " +circu1.calcularArea());
        System.out.println("Perímetro: " + circu1.calcularPeri());
    }
    
}
