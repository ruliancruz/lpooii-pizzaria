import java.util.HashMap;
import java.util.Map;

public abstract class PizzaAbstrata implements Pizza
{
    private Sabor sabor;
    private String tamanho;
    private Map<Ingrediente, Double> ingredientes;
    private double preco;
    
    protected void adicionarIngredientesBase()
    {
        ingredientes = new HashMap<Ingrediente, Double>();
        ingredientes.put(new Ingrediente("Massa", 4.5), ajustaQuantidade(1.0, tamanho));
        ingredientes.put(new Ingrediente("Molho", 1.5), ajustaQuantidade(0.5, tamanho));
        ingredientes.put(new Ingrediente("Queijo", 45.0), ajustaQuantidade(0.2, tamanho));
    }
    
    private static double ajustaQuantidade(double quantidade, String tamanho) throws RuntimeException
    {
        int raio;

        switch (tamanho)
        {
        case "P":
            raio = 20;
            break;
        case "M":
            raio = 30;
            break;
        case "G":
            raio = 40;
            break;
        default:
            throw new RuntimeException("Tamanho não disponível");
        }

        return quantidade * (Math.pow(raio, 2) * Math.PI) / (Math.pow(30, 2) * Math.PI);
    }
    
    public double custoTotal()
    {
      double total = 0;
  
      for (var entry : ingredientes.entrySet())
      {
        Ingrediente i = entry.getKey();
        total += i.preco() * entry.getValue();
      }
  
      return Math.ceil(total * 100) / 100;
    }  

    protected void adicionarIngrediente(String nome, double preco, double quantidade)
    {
        ingredientes.put(new Ingrediente(nome, preco), ajustaQuantidade(quantidade, tamanho));
    }

    public String getTamanho()
    {
        return tamanho;
    }

    protected void setTamanho(String tamanho)
    {
        this.tamanho = tamanho;
    }

    public double getPreco()
    {
        return preco;
    }
    
    protected void setPreco(Double preco)
    {
        this.preco = preco;
    }

    public Sabor getSabor()
    {
        return sabor;
    }

    protected void setSabor(Sabor sabor)
    {
      this.sabor = sabor;
    }
}