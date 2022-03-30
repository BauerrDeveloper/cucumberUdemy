package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class AprenderCucumberSteps {

    private int contador = 0;

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
    public void queOValorDoContador(int arg1) throws Throwable {
        contador = arg1;
        System.out.println("Valor do contador: " + contador);
    }

    @Quando("^eu incrementar em (\\d+)$")
    public void euIncrementarEm(int arg1) throws Throwable {
        contador += arg1;
        System.out.println("Valor do contador: " + contador);
    }

    @Então("^o valor do contador será (\\d+)$")
    public void oValorDoContadorSera(int arg1) throws Throwable {
        if (contador == 18) {
            System.out.println("Soma correta!");
        } else {
            Assert.fail("A soma foi: " + contador);
        }
    }


    @Dado("^que acesso a home do portal puravida prime$")
    public void queAcessoAHomeDoPortalPuravidaPrime() {
        System.out.println("Acessando o endereço https://app-prime.azurewebsites.net");
    }

    @Quando("^realizo login$")
    public void realizoLogin() {
        System.out.println(" Clicando no botão login\n Inserindo e-mail e senha\n Clicando em entrar");
    }

    @Então("^sou redirecionado para a home$")
    public void souRedirecionadoParaAHome() {
        System.out.println("Estou na home logada do portal");
    }
}
