/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Javier
 */
public class triangulo {
    private float base, altura;

    public triangulo() {
    }

    public triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getArea(){
     return this.base*this.altura/2;   
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    
    
}
