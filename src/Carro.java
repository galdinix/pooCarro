public class Carro{
     private String marca, modelo, cor, placa;

     Carro(String marca, String modelo, String cor, String placa){
         this.marca = marca;
         this.modelo = modelo;
         this.cor = cor;
         this.placa = placa;
     }

     void setMarca(String marca){

         this.marca = marca;
    }
    String getMarca(){
         return (marca);
    }
    void setModelo(String modelo){
         this.modelo = modelo;
    }
    String getModelo(){
         return (modelo) = modelo;
    }
    void SetCor(String cor){

         this.cor=cor;
    }
    String getCor(){
         return (cor) = cor;
    }
    void setPlaca(String placa){

         this.placa = placa;
    }
    String getPlaca(){
         return (placa);
    }
     void printCarro(){
         System.out.println(marca);
        System.out.println(cor);
        System.out.println(modelo);
        System.out.println(placa);
    }

}

