public class Estado {
    public static void main(String[] args) {
        Maquina maquina = new Maquina();

        maquina.lavar();
        maquina.ligar();
        maquina.lavar();
        maquina.abrirTampa();
        maquina.pausarLavagem();
        maquina.abrirTampa();
        maquina.desligar();
    }
}