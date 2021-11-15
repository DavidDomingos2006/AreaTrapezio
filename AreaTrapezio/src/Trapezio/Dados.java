/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trapezio;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class Dados {
    
    private float baseMaior;
    private float baseMenor;
    private float altura;
    private float total;
    public Dados(){
        this.setAltura(0);
        this.setBaseMaior(0);
        this.setBaseMenor(0);
        this.setTotal(0);
    }
    public void setBaseMenor(float baseMenor){
    this.baseMenor = baseMenor;}
    public float getBaseMenor(){
    return baseMenor;}
    public void setTotal(float total){
    this.total = total;}
    public float getTotal(){
    return total;}
    public void setBaseMaior(float baseMaior){
    this.baseMaior = baseMaior;}
    public float getBaseMaior(){
    return baseMaior;}
    public void setAltura(float altura){
    this.altura = altura;}
    public float getAltura(){
    return altura;}
    
    public void areaTrapezio (){
        digitarDados();
        this.setTotal(((getBaseMaior()+ getBaseMenor())*getAltura())/2); 
        
        System.out.println("Valor da area do trapezio é:"+ getTotal());
    }
    
    private void digitarDados(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Olá digite os valores para saber o calculo da area do trapezio");
        System.out.println("Digite o valor da base menor\n");
        setBaseMenor(tec.nextFloat());
        System.out.println("Digite o valor da base maior\n");
        setBaseMaior(tec.nextFloat());
        System.out.println("Digite o valor da base altura\n");
        setAltura(tec.nextFloat());
    }
}
