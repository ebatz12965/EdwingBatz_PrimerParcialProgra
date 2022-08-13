/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edwing
 */
public class Libro {
    ClassLibro[] tablaLibro;
    int indiceArray;
    
    public Libro(){
        this.tablaLibro = new ClassLibro[100];
        this.indiceArray=0;
    }
    
     public void guardarLibro(ClassLibro libro){
        this.tablaLibro[this.indiceArray]=libro;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public ClassLibro[] getLibro(){
        return this.tablaLibro;
    }
    
}
