import java.util.ArrayList;

public class Comunidade {
	
	private String nome;
	Moderador moderador;
	ArrayList <Perfil> lista_perfil = new ArrayList <Perfil>();
	
	
	public void IncluirPerfil(Perfil a) throws PerfilDuplicadoException
	{
		if (lista_perfil.contains(a))
			throw new PerfilDuplicadoException(a,this);
		else
			lista_perfil.add(a);
	}
	
	public void DefinirModerador (Perfil a)
	{
		this.moderador = (Moderador) a;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Moderador getModerador() {
		return moderador;
	}

	public void setModerador(Moderador moderador) {
		this.moderador = moderador;
	}
	
	

}
