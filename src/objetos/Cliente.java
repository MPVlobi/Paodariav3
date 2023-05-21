/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;


/**
 *
 * @author Macrr
 */
public class Cliente {

    /**
     * @return the SenhaLogin
     */
    public String getSenhaLogin() {
        return SenhaLogin;
    }

    /**
     * @param SenhaLogin the SenhaLogin to set
     */
    public void setSenhaLogin(String SenhaLogin) {
        this.SenhaLogin = SenhaLogin;
    }
    
    //atributos
    private String nome = "";
    private String cpf = "";
    private String telefone = "";
    private String senha = "";
    private String email = "";
    private String DataNasc = "";
    private String endereco = "";
    private String Rua ="";
    private String Cidade = "";
    private String Estado = "";
    private String Rg = "";
    private String Cargo = "";
    private String Bairro = "";
    private String CpfLogin= "";
    private String SenhaLogin = "";
    //GET e SET
    
    public String getRua(){
        return Rua;
    }
    public String setRua(){
        return getRua();}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

  

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
      /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the DataNasc
     */
    public String getDataNasc() {
        return DataNasc;
    }

    /**
     * @param DataNasc the DataNasc to set
     */
    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }
    
    public void limparCamposCadastro(){
        setNome("");
        setCpf("");
       setSenha ("");
        setEndereco("");
       setTelefone  ("");
       setEmail ("");
       setDataNasc ("");
    }   

    /**
     * @param Rua the Rua to set
     */
    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the Rg
     */
    public String getRg() {
        return Rg;
    }

    /**
     * @param Rg the Rg to set
     */
    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    /**
     * @return the Cargo
     */
    public String getCargo() {
        return Cargo;
    }

    /**
     * @param Cargo the Cargo to set
     */
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    /**
     * @return the CpfLogin
     */
    public String getCpfLogin() {
        return CpfLogin;
    }

    /**
     * @param CpfLogin the CpfLogin to set
     */
    public void setCpfLogin(String CpfLogin) {
        this.CpfLogin = CpfLogin;
    }

  
}
