package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Funcionario extends BasePessoaFisica {
    
    public String cracha;
    public String contaCorrente;
    public LocalDate dataVinculoInicial;
    public LocalDate dataVinculoFinal;
    public String registro;
    
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public LocalDate getDataVinculoInicial() {
        return dataVinculoInicial;
    }
    public void setDataVinculoInicial(LocalDate dataVinculoInicial) {
        this.dataVinculoInicial = dataVinculoInicial;
    }
    public LocalDate getDataVinculoFinal() {
        return dataVinculoFinal;
    }
    public void setDataVinculoFinal(LocalDate dataVinculoFinal) {
        this.dataVinculoFinal = dataVinculoFinal;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
    public Funcionario(int codigo, LocalDate dataInsercao, String nome, String telefone, String usuario, String senha,
            LocalDate dataNascimento, String cracha, String contaCorrente, LocalDate dataVinculoInicial,
            LocalDate dataVinculoFinal, String registro) {
        super(codigo, dataInsercao, nome, telefone, usuario, senha, dataNascimento);
        this.cracha = cracha;
        this.contaCorrente = contaCorrente;
        this.dataVinculoInicial = dataVinculoInicial;
        this.dataVinculoFinal = dataVinculoFinal;
        this.registro = registro;
    }

    public String toString() {
        return "codigo: " + getCodigo() +
               "\nNome: " + getNome() +
               "\nTelefone: " + getTelefone() +
               "\nData de Nascimento: " + getDataNascimento() + 
               "\nRegistro: " + getRegistro();
    }   
}
