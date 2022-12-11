public class PizzaFabrica
{
    public static Pizza criarPizza(Sabor sabor, String tamanho)
    {
        switch(sabor)
        {
            case Calabresa:
                return new PizzaCalabresa(tamanho);
            case Bacon:
                return new PizzaBacon(tamanho);
            case Portuguesa:
                return new PizzaPortuguesa(tamanho);
            case Milho:
                return new PizzaMilho(tamanho);
            case Mussarela:
                return new PizzaMussarela(tamanho);
            case Frango:
                return new PizzaFrango(tamanho);
        }
        
        throw new IllegalArgumentException("Sabor não disponível");
    }
}