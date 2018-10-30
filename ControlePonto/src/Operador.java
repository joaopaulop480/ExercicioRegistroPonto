import java.util.Scanner;

public class Operador extends Funcionario {
	
	
	private double valorHora;
	
	

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public void popularDados() {
		
		super.popularDados();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora do Operador: ");
		this.valorHora = Double.parseDouble(sc.nextLine());

		sc.close();
		
	}
	
	

}
