import java.util.UUID;

public class Aluno {
    // Atributos
    private String endereco;
    private int idade;
    private String nome;
    private UUID id;

    // Construtor padrão
    public Aluno() {
        this.id = UUID.randomUUID(); // Gera um UUID único para cada instância
    }

    // Métodos getters e setters

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

    // Método para definir nome e idade ao mesmo tempo
    public void setNome(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
