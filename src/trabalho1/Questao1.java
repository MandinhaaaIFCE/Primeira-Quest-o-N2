
package trabalho1;
import java.util.Scanner;

public class Questao1 {


    public static void main(String[] args) {
        
        FiguraGeometrica listaDeFiguras[] = new FiguraGeometrica[4];
        double somaPerimetro = 0;
        double somaArea = 0;
        
        Scanner scan = new Scanner(System.in);
        
        for (int i=0;i<listaDeFiguras.length;i++){
            if(i<2){
                System.out.println("Digite o raio de um círculo" +(i+1));
                Circulo c = new Circulo();
                
                c.setR(scan.nextDouble());
                listaDeFiguras[i] = c;
            }else{
                System.out.println("\n Digite a altura do retângulo" +(i-1));
                Retangulo r= new Retangulo();
                r.setAltura(scan.nextDouble());
                listaDeFiguras[i] = r;
            }
            
        }
        for(int i=0;i<listaDeFiguras.length;i++){
            somaArea+=listaDeFiguras[i].calcuArea();
            somaPerimetro+= listaDeFiguras[i].calcuPerimetro();
                    if (i<2){
                        System.out.println("Círculo" +(i+1)+ "-------- \n Área:" +listaDeFiguras[i].getArea() 
                               + "\nPerimetro:" +listaDeFiguras[i].getPerimetro());
                        
                    }else{
                    
                    }
        }
            
        
    }
    
}
