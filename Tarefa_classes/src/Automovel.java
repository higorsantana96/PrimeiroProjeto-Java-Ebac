public class Automovel {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Carro carro = new Carro();
        carro.setMarca("Audi");
        System.out.println(carro.getMarca());
        carro.setModelo("PB18 E-Tron");
        System.out.println(carro.getModelo());
        carro.setAno(2023);
        System.out.println(carro.getAno());
        carro.setFabricante("Volkswagen");
        System.out.println(carro.getFabricante());
    }
}

