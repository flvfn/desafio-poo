/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.iphone.navegador;

/**
 *
 * @author flavio
 */
public class Safari implements Navegador {

    @Override
    public void realizarPesquisa() {
        System.out.println("Digitar pesquisa");
    }

    @Override
    public void carregarPagina() {
        System.out.println("Pagina Carregada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Nova Aba Aberta");
    }

    @Override
    public void fecharAba() {
        System.out.println("Aba Encerrada");
    }

    @Override
    public void carregarMapa2D() {
        System.out.println("Mapa Carregado");
    }

    @Override
    public void carregarMapaSatelite() {
        System.out.println("Mapa Satitelite Carregado");
    }

    @Override
    public void carregarRota() {
        System.out.println("Rota Carregada");
    }

    @Override
    public void enviarEmail() {
        System.out.println("Email Enviado");
    }

    @Override
    public void receberEmail() {
        System.out.println("Email Recebido");
    }

    @Override
    public void visualizarEmails() {
        System.out.println("Lista de Emails");
    }

    @Override
    public void notificacoesEmail() {
        System.out.println("Novo Email");
    }
    
}
