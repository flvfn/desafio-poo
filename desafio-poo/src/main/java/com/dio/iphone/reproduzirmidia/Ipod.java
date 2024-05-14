/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.iphone.reproduzirmidia;
        

/**
 *
 * @author flavio
 */

public class Ipod implements Controles{
    
    public void pesquisarMidia(){
       System.out.println("Buscado Midia");
              
   }
    
   public void reproduzirMidia(){
       System.out.println("Reproduzido Midia");
              
   }
   public void avancarMidia(){
       System.out.println("Avançado Midia");
              
   }
   
   public void pausarMidia(){
       System.out.println("Pausado Midia");
   }
   
   public void favoritarMidia(){
       System.out.println("Favoritado Midia");
              
   }
   public void criarPlaylist(){
       System.out.println("Selecionar ou Criar Playlist");
       System.out.println("Adiocinado Midia");
              
   }
   
   public void aumentarVolume(){
       System.out.println("Aumentado Volume");
    }
   
   public void diminuirVolume(){
          System.out.println("Diminuido Volume");   
    }
   
   public void rotacionarTela(){
       int posicaoVertical = 1;
       if (posicaoVertical !=1){ 
            System.out.println("Tela Rotacionada");
        }
    }
}
