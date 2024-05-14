/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.iphone;

import com.dio.iphone.aparelhotelefone.FuncionalidadesTelefone;
import com.dio.iphone.reproduzirmidia.Ipod;
import com.dio.iphone.navegador.Safari;
import com.dio.iphone.aparelhotelefone.AparelhoTelefonico;


/**
 *
 * @author flavio
 */
public class Iphone{
    public static void main(String[] args) {
        
        
    FuncionalidadesTelefone iphone1 = new FuncionalidadesTelefone();
    iphone1.realizarChamadas();
    
    Ipod iphone2 = new Ipod();
    iphone2.reproduzirMidia();
    
    Safari iphone3 = new Safari();
    iphone3.carregarMapa2D();
    
    }
}