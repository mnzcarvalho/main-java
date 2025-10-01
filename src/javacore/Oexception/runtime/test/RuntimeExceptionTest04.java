package javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

//Capturando múltiplas exceções
//Não se pode colocar um tipo mais genérico acima dos outros catch's
//Exceções mais genéricas tem que vim no final
public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
