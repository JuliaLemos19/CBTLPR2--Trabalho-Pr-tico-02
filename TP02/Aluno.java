import java.util.UUID;

//Julia Lemos

public class Aluno {
   
    private String endereco;
    private int idade;
    private String nome;
    private UUID id;


    public Aluno() {
        this.id = UUID.randomUUID(); 
    }

 

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    
    public void setNome(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
