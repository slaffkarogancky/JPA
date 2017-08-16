package kharkov.kp.gic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kharkov.kp.gic.domain.Gopnik;
import kharkov.kp.gic.repository.GopnikRepository;

@Service
@Transactional
public class GopnikService {
	
	@Autowired
	private GopnikRepository repository;

	public void create(Gopnik gopnik) {
		repository.create(gopnik);
	}
	
	public void update(Gopnik gopnik) {
		repository.update(gopnik);
	}
	
	public void delete(int gopnikId) {
		repository.delete(gopnikId);
	}
	
	@Transactional(readOnly = true)
	public Gopnik getGopnikInfo(int gopnikId) {
		return repository.getGopnikInfo(gopnikId);
	}
	
	@Transactional(readOnly = true)
	public List<Gopnik> getAllGopniks(){
		return repository.getAllGopniks();
	}
}
