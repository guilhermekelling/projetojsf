package br.com.grk;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

//@RequestScoped : todos os objetos armazenados no escopo request, sobrevivem apenas a uma submissão ao ciclo de vida do JSF 
//@ViewScoped :  mantém o estado do bean enquanto houver requisições da mesma view/página, e quando ele muda de página o estado do bean é descartado
//@SessionScoped: o estado do ManagedBean é mantido até o fim da sessão do usuário.
//@ApplicationScoped: os dados serão compartilhados por todos os usuários

@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaBean {
	
	private String nome;
	
	private HtmlCommandButton commandButton;
			
	private List<String> nomes = new ArrayList<String>();
	
	public String addNome() {
		nomes.add(nome);
		
		if (nomes.size() > 3) {
			commandButton.setDisabled(true);
		}
		
		return "";
	}
	
	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}
	
	public HtmlCommandButton getCommandButton() {
		return commandButton;
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
