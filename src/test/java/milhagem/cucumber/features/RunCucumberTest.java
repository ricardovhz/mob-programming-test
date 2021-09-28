package milhagem.cucumber.features;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/milhagem/cucumber/features", glue = "milhagem.cucumber", publish = true)
public class RunCucumberTest {

  @Dado("Horario é {int}:{int}")
  public void horario_é(Integer int1, Integer int2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  @Dado("Cliente realiza um pedido no valor de R$ {double}")
  public void cliente_realiza_um_pedido_no_valor_de_r$(Double double1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  @Dado("Cliente irá buscar pessoalmente o pedido")
  public void cliente_irá_buscar_pessoalmente_o_pedido() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  @Quando("Cliente enviar o pedido")
  public void cliente_enviar_o_pedido() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  @Então("É definido a hora para buscar {int}:{int}")
  public void é_definido_a_hora_para_buscar(Integer int1, Integer int2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  @Então("É cobrado o valor de R$ {double} ao cliente")
  public void é_cobrado_o_valor_de_r$_ao_cliente(Double double1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

}
