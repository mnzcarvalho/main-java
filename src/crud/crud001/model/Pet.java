package crud.crud001.model;

import crud.crud001.enums.Sexo;
import crud.crud001.enums.TipoAnimal;
import crud.crud001.util.Constantes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Pet {
    private String nome;
    private TipoAnimal tipo;
    private Sexo sexo;
    private Endereco endereco;
    private double idade;
    private double peso;
    private String raca;

    public Pet() {}

    public Pet(String nome, TipoAnimal tipo, Sexo sexo, Endereco endereco, double idade, double peso, String raca) {
        this.nome = nome;
        this.tipo = tipo;
        this.sexo = sexo;
        this.endereco = endereco;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    // === TDA: savePet (salva a si próprio) ===
    // Grava pet no arquivo usando generateFileName().
    // Formato: 7 linhas (nome, tipo, sexo, endereco, idade, peso, raca).
    public void savePet() throws IOException {
        Path arquivo = generateFileName();
        Files.createDirectories(arquivo.getParent());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo.toFile()))) {
            writer.write(this.nome);
            writer.newLine();
            writer.write(this.tipo.name());
            writer.newLine();
            writer.write(this.sexo.name());
            writer.newLine();
            String linhaEndereco = String.join(", ",
                    endereco.getRua(),
                    endereco.getNumero(),
                    endereco.getBairro(),
                    endereco.getCidade()
            );
            writer.write(linhaEndereco);
            writer.newLine();
            writer.write(this.idade + " anos");
            writer.newLine();
            writer.write(this.peso + "kg");
            writer.newLine();
            writer.write(this.raca);
        }
    }

    // === TDA: generateFileName ===
    // Gera nome do arquivo: yyyyMMdd'T'HHmm-NOME+SOBRENOME.TXT
    // Usa timestamp atual + nome do pet.
    public Path generateFileName() {
        String[] partesNome = this.nome.split(" ", 2);
        String nomeArquivo = partesNome[0];
        String sobreNomeArquivo = partesNome.length > 1 ? partesNome[1] : "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");
        String timestamp = LocalDateTime.now().format(formatter);
        String nomeArquivoFinal = timestamp + "-" + nomeArquivo + "+" + sobreNomeArquivo + ".TXT";
        return Paths.get(Constantes.PASTA_PETS, nomeArquivoFinal);
    }

    // === TDA: loadPet (static) ===
    // Carrega pet de arquivo. Faz parse das 7 linhas.
    // Retorna null se arquivo inválido ou erro de parse.
    public static Pet loadPet(Path arquivo) throws IOException {
        List<String> linhas = Files.readAllLines(arquivo);
        if (linhas == null || linhas.size() < 7) return null;

        String nome = linhas.get(0).trim();
        TipoAnimal tipo;
        try { tipo = TipoAnimal.valueOf(linhas.get(1).trim()); } catch (Exception e) { return null; }

        Sexo sexo;
        try { sexo = Sexo.valueOf(linhas.get(2).trim()); } catch (Exception e) { return null; }

        String[] parts = linhas.get(3).trim().split("\\s*,\\s*");
        String rua = parts.length > 0 ? parts[0] : "";
        String numero = parts.length > 1 ? parts[1] : "";
        String bairro = parts.length > 2 ? parts[2] : "";
        String cidade = parts.length > 3 ? parts[3] : "";
        Endereco endereco = new Endereco(rua, bairro, cidade);
        endereco.setNumero(numero);

        double idade = 0.0;
        try {
            String s = linhas.get(4).trim().replace(" anos", "");
            idade = Double.parseDouble(s);
        } catch (Exception e) { idade = 0.0; }

        double peso = 0.0;
        try {
            String s = linhas.get(5).trim().replace("kg", "");
            peso = Double.parseDouble(s);
        } catch (Exception e) { peso = 0.0; }

        String raca = linhas.get(6).trim();

        return new Pet(nome, tipo, sexo, endereco, idade, peso, raca);
    }

    // Getters e Setters: acesso aos campos do pet.
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public TipoAnimal getTipo() { return tipo; }
    public void setTipo(TipoAnimal tipo) { this.tipo = tipo; }
    public Sexo getSexo() { return sexo; }
    public void setSexo(Sexo sexo) { this.sexo = sexo; }
    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }
    public double getIdade() { return idade; }
    public void setIdade(double idade) { this.idade = idade; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", sexo=" + sexo +
                ", endereco=" + endereco +
                ", idade=" + idade +
                ", peso=" + peso +
                ", raca='" + raca + '\'' +
                '}';
    }
}
