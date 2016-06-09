public class PerfilDuplicadoException extends Exception {
	
	private Perfil pException;
	private Comunidade cException;
	
	public PerfilDuplicadoException(Perfil pConstrutor, Comunidade cConstrutor)
	{
		this.pException = pConstrutor;
		this.cException = cConstrutor;
	}

	public Perfil GetPerfil()
	{
		return pException;
	}
	
	public Comunidade GetComunidade()
	{
		return cException;
	}
	
}
