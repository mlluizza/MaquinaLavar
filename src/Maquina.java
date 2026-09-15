public class Maquina {
    private Estado estado;
    private boolean tampaFechada;

    public Maquina(){
        this.tampaFechada = false;
        this.estado = Estado.DESLIGADA;
    }
    public void ligar(){
        if (estado == Estado.DESLIGADA){
            estado = Estado.LIGADA;
            System.out.println("A máquina foi ligada!");
        }else {
            System.out.println("A máquina já está ligada!");
        }
    }

    public void desligar(){
        if(estado == Estado.CENTRIFUGANDO || estado == Estado.LAVANDO) {
            System.out.println("Não é possivel desligar enquanto a maquina estiver lavando ou centrifugando");}
        else if ( estado == Estado.LIGADA || estado == Estado.CENTRIFUGACAOCONCLUIDA){
            estado = Estado.DESLIGADA;
            System.out.println("A máquina foi desligada!");
        }else{
            System.out.println("A máquina já está desligada");
        }
    }


    public enum Estado {
        DESLIGADA,
        LIGADA,
        CENTRIFUGANDO,
        LAVANDO,
        CENTRIFUGACAOCONCLUIDA
    }


}