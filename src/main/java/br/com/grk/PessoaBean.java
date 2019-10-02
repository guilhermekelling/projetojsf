package br.com.grk;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

//@RequestScoped : todos os objetos armazenados no escopo request, sobrevivem apenas a uma submissão ao ciclo de vida do JSF 
//@ViewScoped :  mantém o estado do bean enquanto houver requisições da mesma view/página, e quando ele muda de página o estado do bean é descartado
//@SessionScoped: o estado do ManagedBean é mantido até o fim da sessão do usuário.

@ManagedBean(name = "pessoaBean")
@SessionScoped
public class PessoaBean {
	
	private String nome;
			
	private List<String> nomes = new ArrayList<String>();
	
	public String addNome() {
		nomes.add(nome);
		return "";
	}
	
	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
	
	public List<String> getNomes() {
		return nomes;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
