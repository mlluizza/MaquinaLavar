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
        maquina.ligar();
        maquina.fecharTampa();
        maquina.lavar();
        maquina.iniciarCentrifugacao();
        maquina.concluirLavagem();
        maquina.iniciarCentrifugacao();
        maquina.lavar();
        maquina.ligar();
        maquina.lavar(); 
        maquina.fecharTampa();
        maquina.lavar(); 
        maquina.pausarLavagem();
        maquina.abrirTampa(); 
        maquina.fecharTampa();
        maquina.retomarLavagem();
        maquina.iniciarCentrifugacao(); 
        
    }
}
