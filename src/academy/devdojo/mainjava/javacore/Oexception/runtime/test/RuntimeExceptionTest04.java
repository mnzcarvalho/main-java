package academy.devdojo.mainjava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

//Capturando múltiplas exceções
//Não se pode colocar um tipo mais genérico acima dos outros catch's
//Exceções mais genéricas tem que vim no final
public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException e) {              //Exception {mais genérica}

        } catch (FileNotFoundException e) {     //IOException

        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
