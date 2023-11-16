package AvFormativa;

public class Principal {
	
	public static void main(String[] args) {

		Fisica pessoa = new Fisica("Julia", "45684896", "86869585");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getCpf());
		System.out.println(pessoa.getRg());

	}
}