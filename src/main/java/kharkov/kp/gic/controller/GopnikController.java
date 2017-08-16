package kharkov.kp.gic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kharkov.kp.gic.domain.Gopnik;
import kharkov.kp.gic.service.GopnikService;

@RestController
@RequestMapping("/gopota/api/v1")
public class GopnikController {

	@Autowired
	private GopnikService service;

	// http://localhost:3000/gopota/api/v1/rogan
	@RequestMapping(value = "/rogan", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Gopnik>> getAllGopota() {
		List<Gopnik> gopniks = service.getAllGopniks();
		return new ResponseEntity<>(gopniks, HttpStatus.OK);
	}
}
