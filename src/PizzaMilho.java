public class PizzaMilho extends PizzaAbstrata
{
    public PizzaMilho(String tamanho)
    {
        setSabor(Sabor.Milho);
        setTamanho(tamanho);
        adicionarIngredientesBase();
        adicionarIngrediente("Milho", 5, 0.5);

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
