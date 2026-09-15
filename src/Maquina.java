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

    public void lavar(){
        if (estado == Estado.DESLIGADA){
            System.out.println("Não é possível lavar com a máquina desligada");
        }
        else if (!tampaFechada){
            System.out.println("Não é possível lavar com a tampa aberta");
            return;
        } else if (estado == Estado.LAVANDO) {
            System.out.println("A máquina já está lavando");
        }else{
            estado = Estado.LAVANDO;
            System.out.println("A máquina começou a lavar");
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