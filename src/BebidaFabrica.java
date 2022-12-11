public class BebidaFabrica
{
    public static Bebida criarBebida(String nome)
    {
        switch(nome)
        {
            case "agua":
            case "água":
                return new Agua();
            case "coca":
            case "coca-cola":
            case "cocacola":
                return new CocaCola();
            case "pepsi":
                return new Pepsi();
            case "fanta":
                return new Fanta();
            case "guarana":
            case "guaraná":
                return new Guarana();
            case "tubaina":
            case "tubaína":
                return new Tubaina();
        }
        
        throw new IllegalArgumentException("Bebida não disponível");
    }
}
