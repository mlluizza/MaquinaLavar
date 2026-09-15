public class Estado {
    public static final Estado DESLIGADA = ;
    public static final Estado LIGADA = ;

    public static void main(String[] args) {
        Maquina maquina = new Maquina();

        maquina.ligar();
        maquina.ligar();
        maquina.desligar();
        maquina.desligar();
    }
}