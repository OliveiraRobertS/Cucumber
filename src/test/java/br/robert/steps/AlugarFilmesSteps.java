package br.robert.steps;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.robert.entidades.Filme;
import br.robert.entidades.NotaAluguel;
import br.robert.servico.AluguelService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AlugarFilmesSteps {
	
	private Filme filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	
	@Given("Um filme com estoque de {int} unidades")
	public void um_filme_com_estoque_de_unidades(Integer int1) {
	    filme = new Filme();
	    filme.setEstoque(int1);
	}

	@Given("que o preco do aluguel seja R$ {int}")
	public void que_o_preco_do_aluguel_seja_R$(Integer int1) {
	    filme.setAluguel(int1);
	}

	@When("alugar")
	public void alugar() {
	    nota = aluguel.alugar(filme);
	}

	@Then("o preco do aluguel sera R$ {int}")
	public void o_preco_do_aluguel_sera_R$(Integer int1) {
	    Assert.assertEquals(int1, nota.getPreco());
	}

	@Then("data de entrega sera no dia seguinte")
	public void data_de_entrega_sera_no_dia_seguinte() {
	    Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DAY_OF_MONTH, 1);
	    
	    Date dataRetorno = nota.getDataEntrega();
	    Calendar calRetorno = Calendar.getInstance();
	    calRetorno.setTime((java.util.Date) dataRetorno); 
	    
	    Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
	    Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
	    Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));

	}

	@Then("estoque do filme sera {int} unidade")
	public void estoque_do_filme_sera_unidade(Integer int1) {
	    Assert.assertEquals(int1, filme.getEstoque());
	}




}
