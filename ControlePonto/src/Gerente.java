import java.util.Scanner;

public class Gerente extends Funcionario {
	
	private String login;
	private String senha;
	
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public void popularDados() {
		
		super.popularDados();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o login do Gerente: ");
		this.login = sc.nextLine();
		System.out.println("Digite a senha do Gerente: ");
		this.senha = sc.nextLine();
		
		sc.close();
		
	}
	

		
	
		
	
	
	

}
