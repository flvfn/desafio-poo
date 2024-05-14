/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.iphone.aparelhotelefone;

/**
 *
 * @author flavio
 */
public interface AparelhoTelefonico {
    
    //Acões de Chamada
    
    void realizarChamadas();
    
    void atenderChamadas();
    
    void encerrarChamadas();
    
    //Acoes Extra Chamada
    
    void ativarMudoChamada();
    
    void colocarChamadaEspera();
    
    void adicionarChamadaConf();
    
    void ativarVivaVoz();
    
   
    //Acoes de Agenda
    
    void salvarContatos();
    
    void atualizarContatos();
            
    void removerContatos();
    
    
    //Acoes ExtraAgenda

    void acessarContatos();

    void acessarFavoritos();
    
    void acessarRecentes();
        
    
    //Acoes Correio de Voz
    
    void acessarCorreioDeVoz();
    
    void selecionarMensagemVoz();
    
    
    
    //Acoes Conexao
    
    void registrarRedeGSM();
    
    void registrarRedeEDGE();
    
    void conexaoWIFI();
    
    void conexaoBluetooth();
    
    //Acoes Toque
    
    void definirToque();
    
    //SMS
    
    void enviarSMS();
    
    void receberSMS();
    
    
    
       
}
