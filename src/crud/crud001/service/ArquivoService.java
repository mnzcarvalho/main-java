package crud.crud001.service;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//leitura e escrita de arquivos
public class ArquivoService {

   public List<String> leitorArquivo (String caminhoArquivo) throws IOException {
      return Files.readAllLines(Paths.get(caminhoArquivo));
   }
}
