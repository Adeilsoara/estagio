package br.ufc.quixada.npi.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import br.ufc.quixada.npi.model.Pessoa;
import br.ufc.quixada.npi.service.PessoaService;

@Component
public class Main3 {
	
	@Autowired
	private PessoaService cs;
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Main3 main = (Main3)ctx.getBean("main3");
		try {
			main.cs.insere();
		} catch (Exception e) {
			System.out.println("Não foi possível realizar a inserção");
		}
		
		List<Pessoa> li = main.cs.findAll();

	    for (Pessoa p : li) {
	    	System.out.println(p);
	    }
		ctx.close();
	}
	
}
