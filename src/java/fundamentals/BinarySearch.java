/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

/**
 *
 * @author POCHI
 */
public class BinarySearch {
    
    /*
     Esta clase no debe de ser inicializada
     */
    private BinarySearch(){}
    

    public static int rank(int key, int[] arr){
        int min = 0, max = (arr.length-1);
        
        while(min <= max){
            int mid = min + ((max-min)/2);//esto se hace asi porque no siempre el minimo sera 0
            
            if(key < arr[mid]) max = mid-1;//si el valor que se busca es menor que el medio, se cambia el valor del maximo y se pone menos que el medio menos uno
            else if(key > arr[mid]) min = mid+1;//si el valor que buscamos es mayor, se cambia el valor del minimos a el medio mas uno
            else return arr[mid];//si son iguales ya se encontro el valor
        }
        
        return -1;
    }
            
    
    public static void main(String[] args){
        int[] arr = {10,11,12,16,18,23,29,33,48,54,68,77,84,98};
        System.out.println(rank(23,arr));
        System.out.println(rank(50,arr));
    }
}
