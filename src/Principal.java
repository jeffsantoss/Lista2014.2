import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Principal {
	
	public static void main(String[] args) {
	
		Perfil p1 = new Usuario(123,"Jefferson","Masculino");
		Perfil p2 = new Usuario(124,"Eron","Masculino");
		Perfil p3 = new Moderador(125,"Alice","Feminino");
		
		Comunidade c1 = new Comunidade();
		c1.setNome("Alunos FFB");
		
		try {
			c1.IncluirPerfil(p1);
			System.out.println("Aluno Incluido c/ sucesso" + p1.getNome());
		} catch (PerfilDuplicadoException e) {
			System.out.println("Alunos duplicados na mesma comunidade: " +e.GetPerfil().getNome() + "  "  +e.GetComunidade().getNome());
		}
		
		try {
			c1.IncluirPerfil(p3);
			System.out.println("Aluno Incluido c/ sucesso" + p3.getNome());
		} catch (PerfilDuplicadoException e) {
			System.out.println("Alunos duplicados na mesma comunidade: " +e.GetPerfil().getNome() + "  "  +e.GetComunidade().getNome());
		}
		
		try {
			c1.IncluirPerfil(p3);
			System.out.println("Aluno Incluido c/ sucesso" + p3.getNome());
		} catch (PerfilDuplicadoException e) {
			System.out.println("Aluno duplicados na mesma comunidade  : " +e.GetPerfil().getNome() + "  "  +e.GetComunidade().getNome());
		}
		try {
		File f = new File("redesocial.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
			
			
			oos.close();
			fos.close();
		}
		
		catch(FileNotFoundException e) {
		}
		catch (IOException e) {
		}
		
	}

}
