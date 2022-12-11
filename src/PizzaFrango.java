public class PizzaFrango extends PizzaAbstrata
{
    public PizzaFrango(String tamanho)
    {
        setSabor(Sabor.Frango);
        setTamanho(tamanho);
        adicionarIngredientesBase();
        adicionarIngrediente("Frango", 15, 0.2);

        switch (tamanho)
        {
          case "P":
            setPreco(25.0);
            break;
          case "M":
            setPreco(27.0);
            break;
          case "G":
            setPreco(30.0);
            break;
        }
    }
}
