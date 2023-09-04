package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoa extends BaseDadosComuns {
    
    protected String nome;
    protected String telefone;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public BasePessoa(int codigo, LocalDate dataInsercao, String nome, String telefone) {
        super(codigo, dataInsercao);
        this.nome = nome;
        this.telefone = telefone;
    }
}
