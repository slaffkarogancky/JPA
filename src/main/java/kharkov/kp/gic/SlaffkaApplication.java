package kharkov.kp.gic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kharkov.kp.gic.domain.Gopnik;
import kharkov.kp.gic.service.GopnikService;

@SpringBootApplication
public class SlaffkaApplication implements CommandLineRunner{
	
	@Autowired
	private GopnikService service;

	public static void main(String[] args) {
		SpringApplication.run(SlaffkaApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		/*Gopnik gopnik = new Gopnik("Славка роганский");
		service.create(gopnik);
		
		Gopnik existingGopnik = new Gopnik("Славка роганский - стрижка уркаганская");
		existingGopnik.setId(2);
		service.update(existingGopnik);
		
		List<Gopnik> list = service.getAllGopniks();
		for(Gopnik g : list) {
			System.out.println(g);
		}
		
		Gopnik g1 = service.getGopnikInfo(2);
		System.out.println(g1);
		
		Gopnik g2 = service.getGopnikInfo(500);
		System.out.println(g2);
		
		service.delete(4);		
		service.delete(400);*/
		
		List<Gopnik> list = service.getAllGopniks();
		for(Gopnik g : list) {
			System.out.println(g);
		}		
	}	
}
