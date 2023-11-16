package AvFormativa;

public class Pessoa {
	private String nome; // Alterar o argumento de "public" para "private" impede que outras classes tenham acesso a ele.
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome; // O "this" tem a função de associar o "nome" do setNome com o "nome" da classe "Pessoa".
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
