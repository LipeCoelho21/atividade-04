package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Passageiro extends BasePessoaFisica {
    
    public String email;
    public String numeroCartao;
    public String documento;
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public Passageiro(int codigo, LocalDate dataInsercao, String nome, String telefone, String usuario, String senha,
            LocalDate dataNascimento, String email, String numeroCartao, String documento) {
        super(codigo, dataInsercao, nome, telefone, usuario, senha, dataNascimento);
        this.email = email;
        this.numeroCartao = numeroCartao;
        this.documento = documento;
    }
    public String toString() {
        return "codigo: " + getCodigo() +
               "\nNome: " + getNome() +
               "\nTelefone: " + getTelefone() +
               "\nData de Nascimento: " + getDataNascimento() +
               "\ne-mail: " + getEmail() +
               "\ndocumento: " + getDocumento();
    }
}
