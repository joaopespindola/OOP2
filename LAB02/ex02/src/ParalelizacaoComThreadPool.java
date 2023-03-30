import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ParalelizacaoComThreadPool implements Runnable{

    public ParalelizacaoComThreadPool() {

    }
    public long run(int i) {
        long count = 0;
        long aux = 0;
        try {

            //localizando o arquivo
            Path file = Paths.get("C:\\Users\\joaop\\OneDrive - Universidade Federal de Uberlândia\\É O PROGRAMAS\\Faculdade\\POO2\\LAB02\\textosParaLAB02\\texto" + i + ".txt");
            //o metodo lines irá ler todas as linhas de um arquivo como um stream
            //o metodo count retornará o numero de elementos em um stream
            count = Files.lines(file).count();
            aux = count + aux;
            return aux;

        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
            return 0;
        } catch (Exception e) {
            e.getStackTrace();
            return 0;
        }
    }

    @Override
    public void run() {

    }
}