package listas;

public class Lista implements IListaDuplamenteEncadeada{
	
    public Cabeca    cabeca;
    public NoSimples elementoSelecionado;
    public int		 qtdElementos = 0;
    
    NoSimples ultimoElemento;
    
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
        
        ultimoElemento = novoNo;
               
		return novoValor;
	}

	@Override
	public int adicionarNoInicio(int novoValor) {
        var novoNo = new NoSimples(novoValor);
        if(cabeca.primeiroElemento == null)
            cabeca.primeiroElemento = novoNo;
        
        else{
        	elementoSelecionado = cabeca.primeiroElemento;
        	cabeca.primeiroElemento = novoNo;
        	novoNo.proximoElemento = elementoSelecionado;
        	moverProProximo();
        	
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
        System.out.println("Valor na posição " + posicao + ": " + valorBuscado);
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
		System.out.println("Quantidade de Elementos da Lista: " + qtdElementos + "\n");
		
		return qtdElementos;
	}

	@Override
	public Integer getPosicaoDoValor(int valorBuscado) {
      
        int i = 0;
        moverProInicio();
        while (moverProProximo()){
            i++;
            if(elementoSelecionado.valor == valorBuscado)
                return i;
        }
        
        return null;
             
	}

	@Override
	public Integer removePrimeiro() {
        if(qtdElementos == 0) return null;

        NoSimples primeiroElemento = cabeca.primeiroElemento;

        cabeca.primeiroElemento = cabeca.primeiroElemento.proximoElemento;
        
        return primeiroElemento.valor;
	}

	@Override
	public Integer removeUltimo() {
		if(qtdElementos == 0) return null;
		
//		moverProFinal();
		NoSimples elementoAuxiliar = cabeca.primeiroElemento;
		NoSimples elementoAnterior = cabeca.primeiroElemento;

		while(elementoAuxiliar.proximoElemento != null) {
			elementoAnterior = elementoAuxiliar;
			elementoAuxiliar = elementoAuxiliar.proximoElemento;
		}
		
		elementoAnterior.proximoElemento = null;
		ultimoElemento = elementoAnterior;
		
		return ultimoElemento.valor;
			
	}
	
	@Override
	public String getListaCompleta() {
        String filaCompleta = "";
        moverProInicio();
        while(moverProProximo()){
            filaCompleta += ", "+ elementoSelecionado.valor;
        }
        return filaCompleta.length() == 0
            ? "A fila está vazia"
            : "Primeiro » " + filaCompleta.substring(2) + " « Último"; // .substring(2) remove os dois primeiros caracteres ", "
	}

	@Override
	public String getListaCompletaInvertida() {
		
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
