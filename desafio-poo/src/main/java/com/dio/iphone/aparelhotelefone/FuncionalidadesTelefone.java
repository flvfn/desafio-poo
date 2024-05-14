/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.iphone.aparelhotelefone;

/**
 *
 * @author flavio
 */
public class FuncionalidadesTelefone implements AparelhoTelefonico{

    @Override
    public void realizarChamadas() {
        System.out.println("Chamada Realizada");
    }

    @Override
    public void atenderChamadas() {
        System.out.println("Chamada Atendida");
    }

    @Override
    public void encerrarChamadas() {
        System.out.println("Chamada Encerrada");
    }

    @Override
    public void ativarMudoChamada() {
        System.out.println("Mudo Ativado");
    }

    @Override
    public void colocarChamadaEspera() {
        System.out.println("Chamada em Espera");
    }

    @Override
    public void adicionarChamadaConf() {
        System.out.println("Contato Adiciona a Conferência");
    }

    @Override
    public void ativarVivaVoz() {
        System.out.println("Viva Voz Ativado");
    }

    @Override
    public void salvarContatos() {
        System.out.println("Contato Salvo");
    }

    @Override
    public void atualizarContatos() {
        System.out.println("Contato Atualizado");
    }

    @Override
    public void removerContatos() {
        System.out.println("Contato Removido");
    }

    @Override
    public void acessarContatos() {
        System.out.println("Contatos");
    }

    @Override
    public void acessarFavoritos() {
        System.out.println("Favoritos");
    }

    @Override
    public void acessarRecentes() {
        System.out.println("Recentes");
    }

    @Override
    public void acessarCorreioDeVoz() {
        System.out.println("Correio de Voz");
    }

    @Override
    public void selecionarMensagemVoz() {
        System.out.println("Lista Chamadas de Voz");
    }

    @Override
    public void registrarRedeGSM() {
        System.out.println("Registrado Rede GSM");
    }

    @Override
    public void registrarRedeEDGE() {
        System.out.println("Registrado Rede EDGE");
    }

    @Override
    public void conexaoWIFI() {
        System.out.println("Conectado Wifi");
    }

    @Override
    public void conexaoBluetooth() {
        System.out.println("Conectado Bluetooth");
    }

    @Override
    public void definirToque() {
        System.out.println("Toque de Chamada Definido");
    }

    @Override
    public void enviarSMS() {
       System.out.println("SMS Enviada");
    }

    @Override
    public void receberSMS() {
        System.out.println("SMS Recebida");
    }
    
}
