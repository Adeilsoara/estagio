package br.ufc.quixada.npi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Pessoa;
import br.ufc.quixada.npi.repository.PessoaRepository;


@Service
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	private PessoaRepository pessoaRepository;

	public void PessoaRepository() {
	}
	
	@Transactional
	public void insere() {
		pessoaRepository.save(new Pessoa("Carlos", "(88)6666-4567"));
		pessoaRepository.save(new Pessoa("Marcondes", "(88)3452-6666"));
		pessoaRepository.save(new Pessoa("Raimundiha", "(88)3452-6669"));
	}

	public List<Pessoa> findAll() {
		List<Pessoa> p = pessoaRepository.findAll();
		return p;
	}
}
