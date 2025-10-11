package javacore.Rdatas.test;
//qnd se cria um objeto instatnt, o objeto é imutável, cada alteração feita no objeto vai gerar uma nova instância
//nanosegundos
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();

        System.out.println(now);
        System.out.println(LocalDateTime.now());

        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); //nanosegundo do segundo 999.999.999
        System.out.println(Instant.ofEpochSecond(3, 0));
        System.out.println(Instant.ofEpochSecond(3, 5));
        System.out.println(Instant.ofEpochSecond(3, 1000000000));
        System.out.println(Instant.ofEpochSecond(3, -1000000000));
    }
}
