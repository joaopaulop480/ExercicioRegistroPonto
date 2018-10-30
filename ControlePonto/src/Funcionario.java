import java.util.Scanner;

public abstract class Funcionario {

	static int idsequencial;
	private int id;
	private String nome;
	private String email;
	private String documento;
	
	
	public Funcionario() {
	
		Funcionario.idsequencial++;
		this.id = idsequencial;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	protected void popularDados() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do Funcionario: ");
		this.nome = sc.nextLine();
		System.out.println("Digite o email do Funcionario: ");
		this.email = sc.nextLine();
		System.out.println("Digite o documento do Funcionario: ");
		this.documento = sc.nextLine();
		
		sc.close();
		
	
		
	}
	
	
	
	
	
	
}
