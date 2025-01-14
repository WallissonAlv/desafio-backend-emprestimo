package br.com.wallissonalves.desafio_emprestimo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wallissonalves.desafio_emprestimo.dto.CustomerRequestDTO;
import br.com.wallissonalves.desafio_emprestimo.dto.LoanResponseDTO;
import br.com.wallissonalves.desafio_emprestimo.service.LoanService;


@RestController
@RequestMapping("/customer-loans")
public class LoanController {
	
	@Autowired
	private LoanService loanService;
	
	@PostMapping
	public Map<String, Object> getAvailableLoans(@RequestBody CustomerRequestDTO customerRequestDTO) {
		
		List<LoanResponseDTO> loans = loanService.determineLoans(customerRequestDTO);
		Map<String, Object> response = new HashMap<>();
		response.put("customer", customerRequestDTO.getName());
		response.put("loans", loans);
		
		return response;
	}
}
