package listas;

public interface IListaDuplamenteEncadeada {
    
	NoSimples elementoSelecionado = null;
    public static final int lista[] = null;
    public static final int auxiliar = 0;

	/**
     * Adiciona um valor no final da lista
     * @param novoValor Valor que ser� adicionado no final da lista
     * @return Quantidade de elementos contidos na lista ap�s a inclus�o desse novo valor
     */
    int adicionarNoFinal(int novoValor);


    /**
     * Adiciona um valor no in�cio da lista
     * @param novoValor Valor que ser� adicionado no in�cio da lista
     * @return Quantidade de elementos contidos na lista ap�s a inclus�o desse novo valor
     */
    int adicionarNoInicio(int novoValor);


    /**
     * Recupera o valor contido na posi��o passada como par�metro. 
     * Caso a posi��o n�o exista na lista null � retornado.
     * A primeira posi��o � referenciada pelo n�mero 1.
     * @param posicao Posi��o para a qual o valor contido ser� retornado
     * @return Valor da posi��o ou null caso a posi��o desejada n�o exista.
     */
    Integer getValorNaPosicao(int posicao);


    /**
     * Define um novo valor na posi��o passada como par�metro. 
     * Caso a posi��o n�o exista na lista false � retornado.
     * A primeira posi��o � referenciada pelo n�mero 1.
     * @param valor Valor que ser� definido na lista na posi��o informada
     * @param posicao Posi��o na lista onde o novo valor ser� definido
     * @return False caso a posi��o n�o exista na lista e True se consegue definir o novo valor informado
     */
    boolean setValorNaPosicao(int valor, int posicao);
    

    /**
     * Recupera a quantidade de elementos presentes na lista
     * @return int Quantidade de elementos presentes na lista
     */
    int getQtdElementos();


    /**
     * Recupera a primeira posi��o encontrada para o valor buscado.
     * Caso o valor n�o seja encontrado, null � retornado.
     * A primeira posi��o � referenciada pelo n�mero 1.
     * @param valorBuscado Valor buscado na lista
     * @return Posi��o da primeira ocorr�ncia encontrada para o valor buscado. Retorna null caso o valor n�o seja encontrado na lista.
     */
    Integer getPosicaoDoValor(int valorBuscado);


    /**
     * Remove o primeiro elemento da lista
     * @return Valor removido. Caso a lista esteja vazia null � retornado
     */
    Integer removePrimeiro();


    /**
     * Remove o �ltimo elemento da lista
     * @return Valor removido. Caso a lista esteja vazia null � retornado
     */
    Integer removeUltimo();


    /**
     * Recupera uma string contendo todos os elementos da lista separados por v�rgula.
     * A lista e retornada na ordem original em que os elementos est�o nela dispostos.
     * Exemplo: primeiro � 2, 12, 5, 1 � �ltimo
     * @return String no formato "primeiro � valor1, valor2, ..., valorN � �ltimo". Se a lista estiver vazia retorna "a lista est� vazia"
     */
    String getListaCompleta();


    /**
     * Recupera uma string contendo todos os elementos da lista separados por v�rgula.
     * A lista e retornada na ordem inversa em que os elementos est�o nela dispostos.
     * Exemplo: �ltimo � 1, 5, 12, 2 � primeiro
     * @return String no formato "primeiro � valor1, valor2, ..., valorN � �ltimo". Se a lista estiver vazia retorna "a lista est� vazia"
     */
    String getListaCompletaInvertida();


    /**
     * Combina a lista passada como par�metro na lista atual, adicionando a nova lista no final da lista atual.
     * @param outraLista Outra lista a ser combinada com esta
     * @return esta pr�pria lista depois da combina��o ter sido realizada
     */
    IListaDuplamenteEncadeada combine(IListaDuplamenteEncadeada outraLista);


    /**
     * Move o ponteiro que aponta para o registro selecionado para a posi��o ZERO, antes do primeiro elemento da lista
     * @return sem retorno
     */
    void moverProInicio();


    /**
     * Move o ponteiro que aponta para o registro selecionado para o pr�ximo item da lista
     * @return True se conseguir mover para o pr�ximo e False caso contr�rio. N�o � poss�vel mover para o pr�ximo item da lista quando j� se est� no final dela ou quando a lista est� vazia.
     */
    boolean moverProProximo();


    /**
     * Recupera o valor do elemento atual da lista apontado pelo ponteiro de controle
     * @return O valor selecionado ou null caso a lista esteja vazia ou com o ponteiro apontando para uma de suas extremidades
     */
    Integer getValorSelecionado();
    
    /**
     * Move o ponteiro que aponta para o registro selecionado para a posi��o FIM, depois do �ltimo elemento da lista
     * @return sem retorno
     */
    void moverProFinal();


    /**
     * Move o ponteiro que aponta para o registro selecionado para o item anterior da lista
     * @return True se conseguir mover para o anterior e False caso contr�rio. N�o � poss�vel mover para o item anterior da lista quando j� se est� no in�cio dela ou quando a lista est� vazia.
     */
    boolean moverProAnterior(); 


    /**
     * Ordenada a lista usando o algor�tiomo Bubble Sort
     * @return esta pr�pria lista depois de ordenada
     */
    IListaDuplamenteEncadeada BubbleSort();


	IListaDuplamenteEncadeada BubbleSort(int[] listaAserOrdenada);


}