import uniderp.poo.escola.dominio.BasePessoaFisica;
import uniderp.poo.escola.dominio.Funcionario;
import uniderp.poo.escola.dominio.Passageiro;

import java.time.LocalDate; //importando biblioteca de data

public class App { // execução do programa principal
    public static void main(String[] args) {
        
        LocalDate dataNascimentoFunc = LocalDate.of(1990, 4, 30);
        LocalDate dataVinculoInicial = LocalDate.now();
        LocalDate dataInsercao = LocalDate.now();
        LocalDate dataVinculoFinal = LocalDate.of(2023, 6, 30);

        BasePessoaFisica funcionario1 = new Funcionario (1, dataInsercao, "João", "(67) 99223-4566",
        "Carlos_Funcionario", "@senha", dataNascimentoFunc, "crachaCarlos", 
        "78945-6", dataVinculoInicial, dataVinculoFinal, "registro1");
        
        String nomeFuncionario = funcionario1.getNome();
        System.out.println("Nome: " + nomeFuncionario);

        funcionario1.setNome("Carlos");
        System.out.println("Novo nome: " + funcionario1.getNome());
        System.out.println("\nNovo funcionário inserido: \n");   
        System.out.println(funcionario1); 


        LocalDate dataNascimentoPas = LocalDate.of(1994, 3, 18);
        
        BasePessoaFisica passageiro1 = new Passageiro(2, dataInsercao, "Luana", "(67) 99376-9800", 
        "luana_passageira", "#senha", dataNascimentoPas, "luanapassageira@gmail.com", 
        "cartao4325", "rg: 867-452");

        String nomePassageiro = passageiro1.getNome();
        System.out.println("\n\nNome: " + nomePassageiro);

        System.out.println("\nNovo passageiro inserido: \n");   
        System.out.println(passageiro1); 
    }
}
