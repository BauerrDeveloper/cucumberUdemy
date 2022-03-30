package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AprenderCucumberSteps {

    private int contador = 0;
    Date entrega = new Date();

    @Dado("^que criei o arquivo corretamente$")
    public void queCrieiOArquivoCorretamente() {
        System.out.println("Criei o arquivo corretamente");
    }

    @Quando("^executa-lo$")
    public void executaLo() {
        System.out.println("Executei");
    }

    @Então("^a especificacao deve finalizar com sucesso$")
    public void aEspecificacaoDeveFinalizarComSucesso() {
        System.out.println("Finalizou com sucesso.");
    }

    @Dado("^que o valor do contador é (\\d+)$")
    public void queOValorDoContador(int arg1) {
        contador = arg1;
        System.out.println("Valor do contador: " + contador);
    }

    @Quando("^eu incrementar em (\\d+)$")
    public void euIncrementarEm(int arg1) {
        contador += arg1;
        System.out.println("Valor do contador: " + contador);
    }

    @Então("^o valor do contador será (\\d+)$")
    public void oValorDoContadorSera(int arg1) {
        if (contador == 18) {
            System.out.println("Soma correta!");
        } else {
            Assert.fail("A soma foi: " + contador);
        }
    }

    @Dado("^que a entrega dve ser feita no dia (\\d+)/(\\d+)/(\\d+)$")
    public void queAEntregaDveSerFeitaNoDia(int dia, int mes, int ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, dia);
        calendar.set(Calendar.MONTH, mes - 1);
        calendar.set(Calendar.YEAR, ano);
        entrega = calendar.getTime();
    }

    @Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
    public void aEntregaAtrasarEmDias(int arg0, String tempo) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(entrega);
        if (tempo.equals("dias")) {
            calendar.add(Calendar.DAY_OF_MONTH, arg0);
        }
        if (tempo.equals("meses")) {
            calendar.add(Calendar.MONTH, arg0);
        }
        entrega = calendar.getTime();
    }

    @Então("^a entrega deve ser efetuada dia (\\d{2}/\\d{2}/\\d{4})$")
    public void aEntregaDeveSerEfetuadaDia(String data) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = format.format(entrega);
        Assert.assertEquals(data, dataFormatada);
    }
}
