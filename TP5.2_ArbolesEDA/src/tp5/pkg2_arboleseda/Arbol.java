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
   
    private int[] arbolBinario;
    Nodo raiz;

    public Arbol(int[] arbolBinario, Nodo raiz) {
        this.arbolBinario = arbolBinario;
        this.raiz = raiz;
    }

 
        
    public void insertar(int valor) {
        if (raiz == null){
            raiz= new Nodo(valor);
          insertar();
       
    }
}
        
 

 
    
    
    

