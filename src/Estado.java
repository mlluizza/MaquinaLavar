public class Estado {
    public static void main(String[] args) {
        Maquina maquina = new Maquina();

        System.out.println("TESTE MÁQUINA 1");
        maquina.lavar();
        maquina.ligar();
        maquina.lavar();
        maquina.abrirTampa();
        maquina.pausarLavagem();
        maquina.abrirTampa();
        maquina.desligar();

        System.out.println("TESTE MÁQUINA 2");
        Maquina maquina2 = new Maquina();
        maquina2.ligar();
        maquina2.fecharTampa();
        maquina2.lavar();

        System.out.println("TESTE CENTRIFUGAÇÃO");
        maquina2.iniciarCentrifugacao();

        System.out.println("TESTE MÀQUINA 3");
        maquina.pausarLavagem();
        maquina.abrirTampa();
        maquina.fecharTampa();
        maquina.retomarLavagem();

    }
}