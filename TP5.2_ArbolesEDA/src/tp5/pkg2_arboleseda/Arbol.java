/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.pkg2_arboleseda;



/**
 *
 * @author Hollmann
 */
public class Arbol {
   
   private int[] arbolbinario;

    public Arbol(int[] arbolbinario) {
        arbolbinario = new int[10];
        for (int i = 0; i < 10; i++) {
            arbolbinario[i] = -1;
        }
    }
    
   
public void insertar(int valor){
    int tamaño = 0;
         if (arbolbinario[tamaño] == -1){
        arbolbinario[tamaño] = valor;
        tamaño ++;
    }
    
}   

}
        
 

 
    
    
    

