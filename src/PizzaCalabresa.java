public class PizzaCalabresa extends PizzaAbstrata
{
    public PizzaCalabresa(String tamanho)
    {
        setSabor(Sabor.Calabresa);
        setTamanho(tamanho);
        adicionarIngredientesBase();
        adicionarIngrediente("Calabresa", 15, 0.3);
        adicionarIngrediente("Azeitona", 20, 0.05);

        switch (tamanho)
        {
          case "P":
            setPreco(30.0);
            break;
          case "M":
            setPreco(32.0);
            break;
          case "G":
            setPreco(35.0);
            break;
        }
    }
}