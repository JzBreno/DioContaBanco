package business;

import model.Cliente;
import model.Conta;

import java.util.logging.Logger;

public class ContaBusiness {
    private static final Logger logger = Logger.getLogger(ContaBusiness.class.getName());

    public static Conta CriarContaCorrente(Cliente cliente, Conta contaCorrente) {
        if(validaContaCorrente(cliente, contaCorrente)){
            return contaCorrente;
        }
        return contaCorrente;
    }

    private static boolean validaContaCorrente(Cliente cliente, Conta c) {
        try{
            if(c.getAgencia() != null && !c.getAgencia().equals(" ")){
                logger.info("Agencia Validada");
            }else{
                return  false;
            }
            if(c.getNumero() != 0){
                logger.info("Numero Validada");
            }else{
                return  false;
            }
            if(c.getNomeCliente() == null || !c.getNomeCliente().isEmpty()){
                c.setNomeCliente(cliente.getNome());
            }else{
                return  false;
            }

        }catch (Exception e){
            logger.info("Erro ao criar conta corrente");
        }
        return true;
    }
}
