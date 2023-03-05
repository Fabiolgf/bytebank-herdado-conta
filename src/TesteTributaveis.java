
public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1234, 999999);
		cc.deposita(100.00);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println("o valor do imposto é: " + calc.getTotalImposto());

	}

}
