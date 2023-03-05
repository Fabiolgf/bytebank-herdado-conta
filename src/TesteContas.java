
public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1111, 12345);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(2222, 67890);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp); 
		cc.saca(10.0);
		
		System.out.println("CC: " + cc.getSaldo()); 
		System.out.println("CP: " + cp.getSaldo());
		
	}
		
}
