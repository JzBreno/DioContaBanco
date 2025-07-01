package business;

import model.Cliente;
import model.Conta;

import java.util.logging.Logger;

public class ClienteBusiness {

    private static final Logger logger = Logger.getLogger(ClienteBusiness.class.getName());


    @Override
    public String toString() {
        return "ClienteBusiness{}";
    }

    public ClienteBusiness() {}
    public static void criarCliente(Cliente c, Conta contaCorrente){
        if(validaContaCorrente(c)){
            Conta conta = criarContaCorrente(c, contaCorrente);
            c.setContaCorrente(conta);
            finalizarCriacaoCliente(c, contaCorrente);
        }

    }

    private static Conta criarContaCorrente(Cliente cliente,Conta contaCorrente) {
        try{
            return ContaBusiness.CriarContaCorrente(cliente,contaCorrente);
        }catch (Exception e){
            logger.info("Erro ao criar conta corrente");
        }
        return contaCorrente;
    }

    private static boolean validaContaCorrente(Cliente c) {
        if(c.getCpf() != null && !c.getCpf().isEmpty()) {
            logger.info("Cpf esta ok");
        }
        if(c.getNome() != null && !c.getNome().isEmpty()) {
            logger.info("Nome esta ok");
        }
        if (c.getContaCorrente() != null) {
            logger.info("ContaCorrente esta ok");
        }
        return true;
    }

    private static void finalizarCriacaoCliente(Cliente cliente, Conta contaCorrente) {
        logger.info("Finalizando Cliente Business");
        logger.info("Criando Cliente Business"+ cliente);
        logger.info("Criando Conta Business" + contaCorrente);
    }
}
