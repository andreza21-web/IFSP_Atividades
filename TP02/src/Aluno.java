import java.util.UUID;

/**
 * @version 1.0
 * @author Andreza Pessoa  Cb3012191
 * @author Lidiane Soare  CB3012026
 * 
 */
public class Aluno {
    private String nome;
    private int idade;
    private String endereco;
    private UUID uuid;

      public Aluno(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.uuid = UUID.randomUUID();
    }

    
    public String getEndereco() {
        return endereco;
    }
     public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
     public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
     public void setIdade(int idade) {
        this.idade = idade;
    }

    public UUID getUUID() {
        return uuid;
    } 
     public void setUUID(UUID uuid) {
        this.uuid = uuid;
    }

}
