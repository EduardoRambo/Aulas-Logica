public class Calculadora { 
 
    //Atributo(s)
    private double numero1;
    private double numero2;
    private double numero3;
        
    //Getters
    public double getNumero1() {
        return this.numero1;
    }
    
    public double getNumero2() {
        return this.numero2;
    }
    
    public double getNumero3() {
        return this.numero3;
    }
 
    //Setters
    public void setNumero1(double numero1) {
        this.numero1 = numero1;   
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;   
    }
    
    public void setNumero3(double numero3) {
        this.numero3 = numero3;   
    }

    public double calcularProduto() {
        return this.numero1 * this.numero2 * this.numero3;
    
    }
    
    @Override
    public String toString(){
        return
        "Valor do produto: " +this.calcularProduto();
    }
    
}