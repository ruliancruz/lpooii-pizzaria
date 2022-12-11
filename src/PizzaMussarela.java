public class PizzaMussarela extends PizzaAbstrata
{
    public PizzaMussarela(String tamanho)
    {
        setSabor(Sabor.Mussarela);
        setTamanho(tamanho);
        adicionarIngredientesBase();

        switch(tamanho)
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
