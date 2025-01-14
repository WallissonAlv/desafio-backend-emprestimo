package br.com.wallissonalves.desafio_emprestimo.dto;

public class LoanResponseDTO {

	private String type;
	private int interestRate;
	
	public LoanResponseDTO(String type, int interestRate) {
		this.type = type;
		this.interestRate = interestRate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	
}
