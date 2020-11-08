package listas;

public class Lista implements IListaDuplamenteEncadeada{
	
    public Cabeca    cabeca;
    public NoSimples elementoSelecionado;
    public int		 qtdElementos;
    
    public Lista(){
        cabeca = new Cabeca();
    }
    
    public void add(int valor){
        var novoNo = new NoSimples(valor);
        if(cabeca.primeiroElemento == null)
            cabeca.primeiroElemento = novoNo;
        else{
        	moverProFinal();
            elementoSelecionado.proximoElemento = novoNo;
        }
        
        qtdElementos++;
    }

	@Override
	public int adicionarNoFinal(int novoValor) {

        var novoNo = new NoSimples(novoValor);
        if(cabeca.primeiroElemento == null)
            cabeca.primeiroElemento = novoNo;
        else{
        	moverProFinal();
            elementoSelecionado.proximoElemento = novoNo;
        }
        
        qtdElementos++;
        
		return novoValor;
	}

	@Override
	public int adicionarNoInicio(int novoValor) {
        var novoNo = new NoSimples(novoValor);
        if(cabeca.primeiroElemento == null)
            cabeca.primeiroElemento = novoNo;
        else{
        	moverProInicio();
        	cabeca.primeiroElemento = novoNo;
//            elementoSelecionado = elementoSelecionado.proximoElemento;
        }
        
        qtdElementos++;
        
		return novoValor;
	}

	@Override
	public Integer getValorNaPosicao(int posicao) {
        int i = 0;
        Integer valorBuscado = null;

        moverProInicio();
        while(moverProProximo() && i <= posicao){
            i++;
            if(i == posicao) valorBuscado = elementoSelecionado.valor;
        }

        return valorBuscado;
	}

	@Override
	public boolean setValorNaPosicao(int valor, int posicao) {
        int i = 0;

        moverProInicio();
        while(moverProProximo() && i <= posicao){
            i++;
            if(i == posicao){
                elementoSelecionado.valor = valor;
                return true;
            }
        }

        return false;
	}

	@Override
	public int getQtdElementos() {

		return qtdElementos;
	}

	@Override
	public Integer getPosicaoDoValor(int valorBuscado) {
        int i = 0;
        Integer posicao = null;

        moverProInicio();
        while(moverProProximo() && i <= valorBuscado){
            i++;
            if(i == valorBuscado) posicao = elementoSelecionado.valor;
        }

        return posicao;
	}

	@Override
	public Integer removePrimeiro() {
		// TODO Auto-generated method stub
		
		qtdElementos--;
		
		return null;
	}

	@Override
	public Integer removeUltimo() {
		// TODO Auto-generated method stub
		
		qtdElementos--;
		
		return null;
	}

	@Override
	public String getListaCompleta() {
        String filaCompleta = "";
        moverProInicio();
        while(moverProProximo()){
            filaCompleta += ", "+ elementoSelecionado.valor;
        }
        return filaCompleta.length() == 0
            ? "a fila está vazia"
            : "primeiro » " + filaCompleta.substring(2) + " « último"; // .substring(2) remove os dois primeiros caracteres ", "
	}

	@Override
	public String getListaCompletaInvertida() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public IListaDuplamenteEncadeada combine(IListaDuplamenteEncadeada outraLista) {
        outraLista.moverProInicio();
        while (outraLista.moverProProximo())
            add(outraLista.elementoSelecionado.valor);
        
		return outraLista;
	}

	@Override
	public void moverProInicio() {
        elementoSelecionado = null;
	}

	@Override
	public boolean moverProProximo() {
        if(cabeca.primeiroElemento == null){
            return false;
        }else if(elementoSelecionado == null){
            elementoSelecionado = cabeca.primeiroElemento;
            return true;
        }else if(elementoSelecionado.proximoElemento != null){
            elementoSelecionado = elementoSelecionado.proximoElemento;
            return true;
        }else
            return false;
	}

	@Override
	public Integer getValorSelecionado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void moverProFinal() {
        do{
        }while(moverProProximo());
	}

	@Override
	public boolean moverProAnterior() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IListaDuplamenteEncadeada BubbleSort(int[] listaAserOrdenada) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IListaDuplamenteEncadeada BubbleSort() {
		// TODO Auto-generated method stub
		return null;
	}

}
