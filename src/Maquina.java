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

    public void abrirTampa() {
        if(estado == Estado.CENTRIFUGANDO || estado == Estado.LAVANDO) {
            System.out.println("Não é possível abrir a tampa enquanto ela estiver centrifugando ou lavandoo");
        }else{
            tampaFechada = true;
            System.out.println(" A tampa foi aberta.");
        }
    }

    public void fecharTampa() {
        if (!tampaFechada) {
            tampaFechada = true;
            System.out.println("A tampa foi fechada.");
        } else {
            System.out.println("A tampa já está fechada.");
        }
    }

    public void pausarLavagem() {
        if (estado == Estado.DESLIGADA) {
            System.out.println("Não é possível pausar uma máquina desligada.");
            return;
        }
        else if (estado == Estado.CENTRIFUGANDO) {
            System.out.println("Não dá para pausar enquanto a máquina estiver centrifugando.");
            return;
        }
        else if (estado == Estado.PAUSADA) {
            System.out.println("A máquina já está pausada.");
        }
        else {
            estado = Estado.PAUSADA;
            System.out.println("A máquina foi pausada.");
        }
    }

    public void retomarLavagem() {
        if (estado == Estado.DESLIGADA) {
            System.out.println("Não é possível retomar a lavagem com a máquina desligada.");
        }
        else if (estado == Estado.PAUSADA) {
            estado = Estado.LAVANDO;
            System.out.println("Retomando a lavagem.");
        }
        else {
            System.out.println("A máquina não está pausada.");
        }
    }

    public void iniciarCentrifugacao() {
        if (estado == Estado.DESLIGADA) {
            System.out.println("Não é possível centrifugar com a máquina desligada.");
            return;
        }
        else if (!tampaFechada) {
            System.out.println("Não é possível centrifugar com a tampa aberta.");
            return;
        }
        else if (estado == Estado.LAVAGEMCONCLUIDA) {
            estado = Estado.CENTRIFUGANDO;
            System.out.println("A máquina está centrifugando.");
        }
        else {
            System.out.println("A centrifugação só irá iniciar quando a lavagem estiver finalizada.");
        }
    }


    public enum Estado {
        DESLIGADA,
        LIGADA,
        CENTRIFUGANDO,
        LAVANDO,
        CENTRIFUGACAOCONCLUIDA,
        PAUSADA,
        LAVAGEMCONCLUIDA

    }


}