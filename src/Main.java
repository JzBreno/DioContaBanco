import business.ClienteBusiness;
import model.Cliente;
import model.Conta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Conta contaCorrente = new Conta();
        contaCorrente.setNumero(12345);
        contaCorrente.setNomeCliente(c.getNome());
        contaCorrente.setAgencia("78790");
        c.setCpf("1234567890");
        c.setContaCorrente(contaCorrente);
        c.setNome("breno");
        ClienteBusiness.criarCliente(c, contaCorrente);
    }
}