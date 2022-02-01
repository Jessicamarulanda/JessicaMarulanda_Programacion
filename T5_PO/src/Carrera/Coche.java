package Carrera;

import java.util.Calendar;

public class Coche {
 private int caballos,velocidad;
 private String matricula,modelo;
 private double kilometrsReco;
 public Coche() {
   this.caballos = 0;
   this.velocidad = 0;
   this.matricula = "0000AAA";
   this.modelo = "Sin especificar";
   this.kilometrsReco = 0.0;
 }

 public Coche(String modelo,String matricula,int caballos){
  this.modelo = modelo;
  this.matricula = matricula;
  this.caballos = caballos;
 }
  public void acelerar(int velocidad){
    this.velocidad += velocidad;
   this.kilometrsReco =  this.velocidad *(caballos * (int)((Math.random()* 10) + 1));
   if(this.velocidad > 180){
       this.velocidad = 180;
       System.out.println("Velocidad maxima alcanzada");
   }else{
       System.out.println("Velocidad es:" + this.velocidad);
   }
 }

 public void  frenar(int freno){
     this.velocidad -= freno;
     if(this.velocidad != 0){
         this.velocidad = 0;
         System.out.println("Velocidad minima alcanzada");
     }else{
         System.out.println("Velocidad es:" + this.velocidad);
     }

 }

 public void asignacionVeloci(){
     this.velocidad = 0;
 }

    public void resetear(){
        this.velocidad = 0;
        this.kilometrsReco =0;
    }

    public void mostrarDatos(){
     System.out.printf("Matricula: %s Modelo: %s Cv: %d Valocidad: %d Kilòmetros: %2f %n", matricula,modelo,caballos,velocidad,kilometrsReco);
    }

    public String getModelo() {
        return modelo;
    }

    public double getKilometrsReco() {
        return kilometrsReco;
    }

    public int getCaballos() {
        return caballos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public void setKilometrsReco(double kilometrsReco) {
        this.kilometrsReco = kilometrsReco;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}
