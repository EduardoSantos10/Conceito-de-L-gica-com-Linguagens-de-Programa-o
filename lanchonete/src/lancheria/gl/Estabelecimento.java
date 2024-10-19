package lancheria.gl;

import lancheria.gl.area.clientes.Clientela;
import lancheria.gl.atendimento.Atendente;
import lancheria.gl.atendimento.cozinha.Cozinheiro;

// Estabelecimento vai interagir com todas as outras classes que representam objetos em suas ações
public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro(); // Conexão com o cozinheiro

        // Ações que estabelecimentos precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();

        atendente.receberPagamento();
        atendente.servindoMesa();

        Clientela clientela = new Clientela();
        clientela.escolherLanche();
        clientela.fazerPedido();

    }
}
