public abstract class Perfil {
	
	private int cod;
	private String nome;
	private String sex;
	
	public Perfil(int cod, String nome, String sex) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.sex = sex;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	

}
