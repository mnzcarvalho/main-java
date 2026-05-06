package crud.crud001.service;

import crud.crud001.model.Pet;
import crud.crud001.enums.Sexo;
import crud.crud001.enums.TipoAnimal;
import crud.crud001.util.Constantes;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PetSearchService implements PetSearch {

    @Override
    // Busca pets por tipo (obrigatório) e até 2 critérios adicionais.
    // Critérios: nome, sexo, idade, peso, raça, endereço.
    // Usa Normalizer para remover acentos (case-insensitive).
    // Implementação de PetSearch.buscar().
    public List<Pet> buscar(TipoAnimal tipo, Map<String, String> criterios) throws IOException {
        if (tipo == null) throw new IllegalArgumentException("Tipo de animal é obrigatório");
        if (criterios == null) criterios = Map.of();
        if (criterios.size() > 2) throw new IllegalArgumentException("Máximo de 2 critérios adicionais");

        Path pasta = Paths.get(Constantes.PASTA_PETS);
        if (!Files.exists(pasta)) return new ArrayList<>();

        List<Pet> results = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(pasta, "*.txt")) {
            for (Path arquivo : stream) {
                Pet p = Pet.loadPet(arquivo);
                if (p == null) continue;
                if (p.getTipo() != tipo) continue;
                if (!criterios.isEmpty() && !matches(p, criterios)) continue;
                results.add(p);
            }
        }
        return results;
    }

    // Verifica se pet atende aos critérios de busca.
    // Usa containsIgnoreAccents() para nome/raça/endereço.
    private boolean matches(Pet p, Map<String, String> criterios) {
        for (Map.Entry<String, String> entry : criterios.entrySet()) {
            String key = entry.getKey().toLowerCase();
            String value = entry.getValue() == null ? "" : entry.getValue().trim();
            switch (key) {
                case "nome":
                case "sobrenome":
                    if (!containsIgnoreAccents(p.getNome(), value)) return false;
                    break;
                case "sexo":
                    try {
                        Sexo s = Sexo.valueOf(value.toUpperCase());
                        if (p.getSexo() != s) return false;
                    } catch (IllegalArgumentException ex) { return false; }
                    break;
                case "idade":
                    try {
                        double v = Double.parseDouble(value);
                        if (Math.abs(p.getIdade() - v) > 0.001) return false;
                    } catch (Exception ex) { return false; }
                    break;
                case "peso":
                    try {
                        double v = Double.parseDouble(value);
                        if (Math.abs(p.getPeso() - v) > 0.001) return false;
                    } catch (Exception ex) { return false; }
                    break;
                case "raca":
                    if (!containsIgnoreAccents(p.getRaca(), value)) return false;
                    break;
                case "endereco":
                    String end = p.getEndereco() != null ?
                        p.getEndereco().getRua() + " " + p.getEndereco().getNumero() + " " +
                        p.getEndereco().getBairro() + " " + p.getEndereco().getCidade() : "";
                    if (!containsIgnoreAccents(end, value)) return false;
                    break;
                default: return false;
            }
        }
        return true;
    }

    // Verifica se source contém query, ignorando acentos e case.
    private boolean containsIgnoreAccents(String source, String query) {
        return normalize(source).toLowerCase().contains(normalize(query).toLowerCase());
    }

    // Normaliza string: remove acentos via Normalizer.
    private String normalize(String s) {
        if (s == null) return "";
        return Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    @Override
    // Formata lista de pets para exibição numerada e formatada.
    // Implementação de PetSearch.formatarResultados().
    public String formatarResultados(List<Pet> pets) {
        if (pets == null || pets.isEmpty()) return "Nenhum pet encontrado.";
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Pet p : pets) {
            sb.append(i++).append(". ")
              .append("Nome: ").append(p.getNome()).append(" | ")
              .append("Tipo: ").append(p.getTipo()).append(" | ")
              .append("Sexo: ").append(p.getSexo()).append(" | ")
              .append("Endereço: ").append(p.getEndereco().getRua()).append(" ")
              .append(p.getEndereco().getNumero()).append(", ")
              .append(p.getEndereco().getBairro()).append(", ")
              .append(p.getEndereco().getCidade()).append(" | ")
              .append("Idade: ").append(p.getIdade()).append(" anos | ")
              .append("Peso: ").append(p.getPeso()).append("kg | ")
              .append("Raça: ").append(p.getRaca()).append("\n");
        }
        return sb.toString();
    }
}
