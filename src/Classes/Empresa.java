package Classes;


public class Empresa {
    private String nome;
    private String cnpj;
    private String responsavelTecnico;
    private String empresaResponsavelTecnico;

    //Contrutores

    public Empresa(){
    }
    public Empresa(String nome, String cnpj, String responsavelTecnico, String empresaResponsavelTecnico) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.responsavelTecnico = responsavelTecnico;
        this.empresaResponsavelTecnico = empresaResponsavelTecnico;
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getResponsavelTecnico() {
        return responsavelTecnico;
    }
    public void setResponsavelTecnico(String responsavelTecnico) {
        this.responsavelTecnico = responsavelTecnico;
    }
    public String getEmpresaResponsavelTecnico() {
        return empresaResponsavelTecnico;
    }
    public void setEmpresaResponsavelTecnico(String empresaResponsavelTecnico) {
        this.empresaResponsavelTecnico = empresaResponsavelTecnico;
    }

    @Override
    public String toString() {
        return "Empresa [nome=" + nome + ", cnpj=" + cnpj + ", responsavelTecnico=" + responsavelTecnico
                + ", empresaResponsavelTecnico=" + empresaResponsavelTecnico + "]";
    }
    
    


    



    
}
