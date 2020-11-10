package listas;

public interface IListaDuplamenteEncadeada {
    
	NoSimples elementoSelecionado = null;
    public static final int lista[] = null;
    public static final int auxiliar = 0;

	/**
     * Adiciona um valor no final da lista
     * @param novoValor Valor que será adicionado no final da lista
     * @return Quantidade de elementos contidos na lista após a inclusão desse novo valor
     */
    int adicionarNoFinal(int novoValor);


    /**
     * Adiciona um valor no início da lista
     * @param novoValor Valor que será adicionado no início da lista
     * @return Quantidade de elementos contidos na lista após a inclusão desse novo valor
     */
    int adicionarNoInicio(int novoValor);


    /**
     * Recupera o valor contido na posição passada como parâmetro. 
     * Caso a posição não exista na lista null é retornado.
     * A primeira posição é referenciada pelo número 1.
     * @param posicao Posição para a qual o valor contido será retornado
     * @return Valor da posição ou null caso a posição desejada não exista.
     */
    Integer getValorNaPosicao(int posicao);


    /**
     * Define um novo valor na posição passada como parâmetro. 
     * Caso a posição não exista na lista false é retornado.
     * A primeira posição é referenciada pelo número 1.
     * @param valor Valor que será definido na lista na posição informada
     * @param posicao Posição na lista onde o novo valor será definido
     * @return False caso a posição não exista na lista e True se consegue definir o novo valor informado
     */
    boolean setValorNaPosicao(int valor, int posicao);
    

    /**
     * Recupera a quantidade de elementos presentes na lista
     * @return int Quantidade de elementos presentes na lista
     */
    int getQtdElementos();


    /**
     * Recupera a primeira posição encontrada para o valor buscado.
     * Caso o valor não seja encontrado, null é retornado.
     * A primeira posição é referenciada pelo número 1.
     * @param valorBuscado Valor buscado na lista
     * @return Posição da primeira ocorrência encontrada para o valor buscado. Retorna null caso o valor não seja encontrado na lista.
     */
    Integer getPosicaoDoValor(int valorBuscado);


    /**
     * Remove o primeiro elemento da lista
     * @return Valor removido. Caso a lista esteja vazia null é retornado
     */
    Integer removePrimeiro();


    /**
     * Remove o último elemento da lista
     * @return Valor removido. Caso a lista esteja vazia null é retornado
     */
    Integer removeUltimo();


    /**
     * Recupera uma string contendo todos os elementos da lista separados por vírgula.
     * A lista e retornada na ordem original em que os elementos estão nela dispostos.
     * Exemplo: primeiro » 2, 12, 5, 1 « último
     * @return String no formato "primeiro » valor1, valor2, ..., valorN « último". Se a lista estiver vazia retorna "a lista está vazia"
     */
    String getListaCompleta();


    /**
     * Recupera uma string contendo todos os elementos da lista separados por vírgula.
     * A lista e retornada na ordem inversa em que os elementos estão nela dispostos.
     * Exemplo: último » 1, 5, 12, 2 « primeiro
     * @return String no formato "primeiro » valor1, valor2, ..., valorN « último". Se a lista estiver vazia retorna "a lista está vazia"
     */
    String getListaCompletaInvertida();


    /**
     * Combina a lista passada como parâmetro na lista atual, adicionando a nova lista no final da lista atual.
     * @param outraLista Outra lista a ser combinada com esta
     * @return esta própria lista depois da combinação ter sido realizada
     */
    IListaDuplamenteEncadeada combine(IListaDuplamenteEncadeada outraLista);


    /**
     * Move o ponteiro que aponta para o registro selecionado para a posição ZERO, antes do primeiro elemento da lista
     * @return sem retorno
     */
    void moverProInicio();


    /**
     * Move o ponteiro que aponta para o registro selecionado para o próximo item da lista
     * @return True se conseguir mover para o próximo e False caso contrário. Não é possível mover para o próximo item da lista quando já se está no final dela ou quando a lista está vazia.
     */
    boolean moverProProximo();


    /**
     * Recupera o valor do elemento atual da lista apontado pelo ponteiro de controle
     * @return O valor selecionado ou null caso a lista esteja vazia ou com o ponteiro apontando para uma de suas extremidades
     */
    Integer getValorSelecionado();
    
    /**
     * Move o ponteiro que aponta para o registro selecionado para a posição FIM, depois do último elemento da lista
     * @return sem retorno
     */
    void moverProFinal();


    /**
     * Move o ponteiro que aponta para o registro selecionado para o item anterior da lista
     * @return True se conseguir mover para o anterior e False caso contrário. Não é possível mover para o item anterior da lista quando já se está no início dela ou quando a lista está vazia.
     */
    boolean moverProAnterior(); 


    /**
     * Ordenada a lista usando o algorítiomo Bubble Sort
     * @return esta própria lista depois de ordenada
     */
    IListaDuplamenteEncadeada BubbleSort();


	IListaDuplamenteEncadeada BubbleSort(int[] listaAserOrdenada);


}