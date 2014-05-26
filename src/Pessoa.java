
public class Pessoa {

	public String nome;
	public int idade;

	public void adicionaNome(String string) {
		nome=string;
		
	}

	
	public boolean isNome(String string) {
		if (nome.equals(string)){
			return true;
		}
		return false;
	}


	public void mudaNome(String string) {
		nome=string;
		
	}


	public Object getNome() {
		return nome;
	}


	public void adicionaIdade(int i) {
		idade = i;
		
	}


	public boolean isIdade(int i) {
		if (idade == i){
			return true;
		}
		return false;
	}


	public void mudaIdade(int i) {
		idade = i;
		
	}


	

}
