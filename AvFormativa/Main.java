package AvFormativa;

public class Main {
	
	public static void main(String[] args) {
	
	Usuario user1 = new Usuario(1, "Sofia Amaral", 1029, "Adm", "Sofia");
	
	System.out.println(user1.getId());
	System.out.println(user1.getNome());
	System.out.println(user1.getPassword());
	System.out.println(user1.getPermissao());
	System.out.println(user1.getUsuario());

	}
}
