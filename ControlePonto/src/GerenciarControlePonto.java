import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class GerenciarControlePonto {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		Gerente g = new Gerente();
		
		
		
		System.out.println("Digite o nome do Funcionario: ");
		g.setNome(sc.nextLine());
				
		Secretaria s = new Secretaria();
		
		System.out.println("Digite o nome do Funcionario: ");
		s.setNome(sc.nextLine());
		
		Operador op = new Operador();
		
		System.out.println("Digite o nome do Funcionario: ");
		op.setNome(sc.nextLine());
		
		RegistroPonto r1 = new RegistroPonto(g);
		r1.setDataRegistro(LocalDate.now());
		r1.setHoraEntrada(LocalDateTime.now());
		r1.apresentarRegistroPonto();
		
		Thread.sleep(1000);
		
		RegistroPonto r2 = new RegistroPonto(op);
		r2.setDataRegistro(LocalDate.now());
		r2.setHoraEntrada(LocalDateTime.now());
		r2.apresentarRegistroPonto();
		
		Thread.sleep(1000);
		
		RegistroPonto r3 = new RegistroPonto(s);
		r3.setDataRegistro(LocalDate.now());
		r3.setHoraEntrada(LocalDateTime.now());
		r3.apresentarRegistroPonto();
		
		Thread.sleep(3000);
		
		r1.setHoraSaida(LocalDateTime.now());
		r1.apresentarRegistroPonto();
		
		Thread.sleep(1000);
		
		r2.setHoraSaida(LocalDateTime.now());
		r2.apresentarRegistroPonto();
		
		Thread.sleep(1000);
		
		r3.setHoraSaida(LocalDateTime.now());
		r3.apresentarRegistroPonto();
		
		
		
		
		sc.close();
	}

}
