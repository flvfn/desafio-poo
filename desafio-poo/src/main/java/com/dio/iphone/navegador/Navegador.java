/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dio.iphone.navegador;

/**
 *
 * @author flavio
 */
public interface Navegador {
   
    //Acoes Safari
    
    void realizarPesquisa();
    void carregarPagina();
    void atualizarPagina();
    void abrirNovaAba();
    void fecharAba();
        
    //Acoes Mapas e Satelite
    
    void carregarMapa2D();
    void carregarMapaSatelite();
    void carregarRota();
    
    //AcoesEmail
    
    void enviarEmail();
    void receberEmail();
    void visualizarEmails();
    void notificacoesEmail();
    
}
