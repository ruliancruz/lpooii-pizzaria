public class PizzaPortuguesa extends PizzaAbstrata
{
    public PizzaPortuguesa(String tamanho)
    {
        setSabor(Sabor.Portuguesa);
        setTamanho(tamanho);
        adicionarIngredientesBase();
        adicionarIngrediente("Presunto", 30, 0.2);
        adicionarIngrediente("Milho", 5, 0.5);
        adicionarIngrediente("Pimentão", 7, 0.1);
        adicionarIngrediente("Ovo", 0.3, 2.0);

        switch (tamanho)
        {
          case "P":
            setPreco(40.0);
            break;
          case "M":
            setPreco(42.0);
            break;
          case "G":
            setPreco(45.0);
            break;
        }
    }
}
