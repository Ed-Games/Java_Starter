public abstract class Pessoa {
    //atributos:
    private String nome;
    private Integer idade;
    private String sexo;

    //métodos especiais:


    public  String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    //Métodos abstratos:
    public void fazerAniversario(){
        this.setIdade(getIdade() + 1);
    }

}
