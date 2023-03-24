import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main (String[] args) throws IOException {
        //localizando o arquivo
        Path file = Paths.get("C:\\Users\\joaop\\OneDrive\\Documentos\\textosParaLAB02\\texto1.txt");
        Path file1 = Paths.get("C:\\Users\\joaop\\OneDrive\\Documentos\\textosParaLAB02\\texto2.txt");
        Path file2 = Paths.get("C:\\Users\\joaop\\OneDrive\\Documentos\\textosParaLAB02\\texto3.txt");
        //o metodo lines irá ler todas as linhas de um arquivo como um stream
        //o metodo count retornará o numero de elementos em um stream
        long count = Files.lines(file).count();
        long count1 = Files.lines(file1).count();
        long count2 = Files.lines(file2).count();
        Paralelizacao para = new Paralelizacao();
        Thread thread = new Thread(para);

        thread.start();
    }
}
