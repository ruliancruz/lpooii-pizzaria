import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Instant;

public class Registro
{
    private static Registro instancia;
    private String arquivo;
    
    public static Registro getInstancia(String arquivo)
    {
        if(instancia == null)
            instancia = new Registro(arquivo);

        return instancia;
    }
    
    private Registro(String arquivo)
    {
        this.arquivo = arquivo;
    }

    public void registrarPedido(Pedido pedido)
    {
        try(BufferedWriter bw = Files.newBufferedWriter(Path.of(arquivo), StandardCharsets.UTF_8, StandardOpenOption.APPEND))
        {
            bw.write(String.format("%s\n%s------\n", Instant.now(), pedido));
        }
        catch(IOException e)
        {
            System.err.println("Problema ao registrar o pedido. Por favor, tente novamente.");
        }
    }
}
