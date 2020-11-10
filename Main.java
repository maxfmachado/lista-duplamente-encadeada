package listas;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        IListaDuplamenteEncadeada lista = new Lista();

        lista.adicionarNoFinal(5);    // Retorna 1. A lista fica assim: 5
        lista.adicionarNoFinal(7);    // Retorna 2. A lista fica assim: 5, 7
        lista.getQtdElementos();       // Retorna 2

        lista.adicionarNoInicio(12);  // Retorna 3. A lista fica assim: 12, 5, 7
        lista.adicionarNoInicio(-25);  // Retorna 4. A lista fica assim: -25, 12, 5, 7
        lista.getQtdElementos();       // Retorna 4

        lista.getValorNaPosicao(0);    // Retorna null
        lista.getValorNaPosicao(1);    // Retorna -25
        lista.getValorNaPosicao(3);    // Retorna 5
        lista.getValorNaPosicao(5);    // Retorna null

        lista.setValorNaPosicao(2, 1); // Retorna true.  A lista fica assim: 2, 12, 5, 7
        lista.setValorNaPosicao(1, 4); // Retorna true.  A lista fica assim: 2, 12, 5, 1
        lista.setValorNaPosicao(1, 5); // Retorna false. A lista fica assim: 2, 12, 5, 1

        System.out.println("\nPosição do valor 12: "  + lista.getPosicaoDoValor(12));   // Retorna 2
        System.out.println(  "Posição do valor -25: " + lista.getPosicaoDoValor(-25));  // Retorna null, pois o item não existe na lista

        System.out.println("\n" + lista.getListaCompleta()); // Imprime na tela: "Primeiro » 2, 12, 5, 1 « Último"

        lista.removePrimeiro();        // Retorna -25. A lista fica assim: 12, 5, 1
        System.out.println("\nRemovendo o primeiro elemento ('2')\n" + lista.getListaCompleta());
        lista.removeUltimo  ();        // Retorna   1. A lista fica assim: 12, 5
        System.out.println("\nRemovendo o último elemento ('1')\n" + lista.getListaCompleta());
        lista.removeUltimo  ();        // Retorna   5. A lista fica assim: 12
        System.out.println("\nRemovendo o último elemento ('5')\n" + lista.getListaCompleta());
        lista.removeUltimo  ();        // Retorna  12. A lista fica vazia
        lista.removeUltimo  ();        // Retorna null pois a lista está vazia
        lista.removePrimeiro();        // Retorna null pois a lista está vazia
        
        System.out.println("\n" + lista.getListaCompleta());

        var outraLista = new Lista();

        outraLista.adicionarNoFinal( 30); // 30
        outraLista.adicionarNoFinal(200); // 30, 200
        outraLista.adicionarNoFinal( 10); // 30, 200, 10
        
        System.out.println("\n" + outraLista.getListaCompleta());

//        outraLista.getListaCompletaInvertida(); // Imprime na tela: "último » 10, 200, 30 « primeiro"

        outraLista.combine(lista);      // outraLista » 30, 200, 10

        lista.adicionarNoFinal(110);    // Retorna 1. A lista fica assim: 110
        lista.adicionarNoFinal(120);    // Retorna 2. A lista fica assim: 110, 120
        lista.adicionarNoFinal(130);    // Retorna 3. A lista fica assim: 110, 120, 130
        lista.adicionarNoFinal(  5);    // Retorna 4. A lista fica assim: 110, 120, 130, 5

        outraLista.combine(lista);      // outraLista » 30, 200, 10, 110, 120, 130, 5
        
        System.out.println("\n" + outraLista.getListaCompleta());
		
		// Percorrendo toda "outraLista" e exibindo os valores na ordem originalmente definida
//		String outraListaOrnadenada = "";
//		outraLista.moverProInicio();
//        while(outraLista.moverProProximo())
//			outraListaOrnadenada += ", "+ outraLista.getValorSelecionado();
//		outraListaOrnadenada = outraListaOrnadenada.length() == 0
//            ? "a lista está vazia"
//            : "ini » " + outraListaOrnadenada.substring(2) + " « fim"; // .substring(2) remove os dois primeiros caracteres ", "
//        System.out.println("outraLista ordenada: "+ outraListaOrnadenada); // outraLista ordenada: "ini » 30, 200, 10, 110, 120, 130, 5 « fim"
		
		
				
		// Percorrendo toda "outraLista" e exibindo os valores na ordem inversa aquela originalmente definida
//		String outraListaInvertida = "";
//		outraLista.moverProFinal();
//        while(outraLista.moverProAnterior())
//			outraListaInvertida += ", "+ outraLista.getValorSelecionado();
//		outraListaInvertida = outraListaInvertida.length() == 0
//            ? "a lista está vazia"
//            : "fim » " + outraListaInvertida.substring(2) + " « ini"; // .substring(2) remove os dois primeiros caracteres ", "
//        System.out.println("outraLista invertida: "+ outraListaInvertida); // outraLista invertida: "fim » 5, 130, 120, 110, 10, 200, 30 « ini"


//	    outraLista.BubbleSort();
//      System.out.println("\nLista ordenada pelo BubbleSort(): "+ outraLista.getListaCompleta()); // Imprime na tela: "primeiro » 5, 10, 30, 110, 120, 130, 200 « último"        
    
    }
}
    
