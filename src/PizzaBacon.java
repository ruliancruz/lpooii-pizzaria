public class PizzaBacon extends PizzaAbstrata
{
    public PizzaBacon(String tamanho)
    {
        setSabor(Sabor.Bacon);
        setTamanho(tamanho);
        adicionarIngredientesBase();
        adicionarIngrediente("Bacon", 20, 0.2);

        switch(tamanho)
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
