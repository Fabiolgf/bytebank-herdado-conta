
public class ContaCorrente extends Conta implements Tributavel { 
	
	//metodo construtor, que instacia esta classe tem que informar a agencia e conta 
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor){
	    double valorASacar = valor + 0.2;
	    return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
