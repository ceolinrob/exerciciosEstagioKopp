 package main;
import java.text.DecimalFormat;
import java.util.*;

public class ClasseExercicio {
    static double funcao(List <Double> val){
        List <Double> valores = val; //entrada de exemplo
        DecimalFormat df = new DecimalFormat("0.00");

        int aux = 0;            //auxiliar utilizado para formatação do texto
        double total = 0;

        /*  
        a lista é transformada em array para ser iterada, 
        e o valor em objeto da lista é então transformado em string, para poder ser lido como double
        */

        System.out.print("Remessa gerada: ");
        for(int i = 0; i+1 < valores.size(); i++) {
                System.out.print((i+1)+" cujo valor é R$"+df.format(valores.toArray()[i])+", ");    
                aux += 1;
                double d = Double.valueOf(valores.toArray()[i].toString());     
                total += d;
        }

        double d = Double.valueOf(valores.toArray()[valores.toArray().length-1].toString());        //é feita a leitura do valor da ultima posição da lista
        total += d;

        //é feita a formatação final do texto, para o ultimo valor da lista
        System.out.print("\b\b e "+(aux+1)+" cujo valor é R$"+df.format(valores.toArray()[valores.toArray().length-1])+".");
        return total;
        
    }
    
}
