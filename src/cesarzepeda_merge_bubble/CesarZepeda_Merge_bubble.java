/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesarzepeda_merge_bubble;

/**
 *
 * @author CESAR ZEPEDA
 */

        // TODO code application logic here
        public class CesarZepeda_Merge_bubble {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        int[] numeros = new int[]{8,7,6,5,4,3,2,1};
        int temporal = 0;
        for (int i = numeros.length -1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if (numeros [j] > numeros[j + 1]){
                     temporal = numeros[j];
                     numeros[j] = numeros[j + 1];
                     numeros [j+1] = temporal;
                   
                }
            }
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
       
    }
   
    public static void merge(int A[],int izq, int m, int der){
   int i, j, k;
   int [] B = new int[A.length]; //array auxiliar
for (i=izq; i<=der; i++) //copia ambas mitades en el array auxiliar
             B[i]=A[i];
 
  i=izq; j=m+1; k=izq;
 while (i<=m && j<=der) //copia el siguiente elemento más grande
             if (B[i]<=B[j])
                     A[k++]=B[i++];
             else
                     A[k++]=B[j++];
             while (i<=m) //copia los elementos que quedan de la
                    A[k++]=B[i++]; //primera mitad (si los hay)
 }
 
    }
    


