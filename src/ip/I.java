package ip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class I {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String hola = leer.nextLine();
        int num;
        int num2;
        int pos=7;
        String cadena="";
        int cont=1;
        ArrayList<Integer> numeros = new ArrayList<>();
        Integer numeros2[] = new Integer[32];
        num = hola.length();
        String prueba[] = new String[num];
        prueba = hola.split("\\.");
        for (int i = 0;i<prueba.length;i++) {
            num2 = Integer.parseInt(prueba[i]);
            numeros.add(num2);
        }
        for (int i = 0; i < numeros2.length; i++) {
            numeros2[i]=0;
        }
        for (int i = 0; i < numeros.size(); i++) {
            int aux=0;
            int res;
            aux=numeros.get(i);
            while(aux!=0){
                res=aux%2;
                aux=aux/2;
                numeros2[pos]=res;
                pos=pos-1;   
        }
            cont++;
            pos=8*cont-1;           
        }
        for (int i = 0; i<numeros2.length; i++) {
            cadena=cadena+numeros2[i];
        }
        System.out.println(cadena); 
    } 
}