import java.util.Scanner;

public class Secretaria extends Funcionario {
	
	private String telefone;
	private String ramal;
	
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getRamal() {
		return ramal;
	}
	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	
	
	public void popularDados() {
		
		super.popularDados();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o telefone da Secretaria: ");
		this.telefone = sc.nextLine();
		System.out.println("Digite o ramal da Secretaria: ");
		this.ramal = sc.nextLine();
		
		sc.close();
		
	}
	
	
	
	

}
