package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoaFisica extends BasePessoa {
    
    protected String usuario;
    protected String senha;
    protected LocalDate dataNascimento;
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public BasePessoaFisica(int codigo, LocalDate dataInsercao, String nome, String telefone, String usuario,
        String senha, LocalDate dataNascimento) {
        super(codigo, dataInsercao, nome, telefone);
        this.usuario = usuario;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    } 
}
