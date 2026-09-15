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
            System.out.println("A máquina foi Ligada");
        }else {
            System.out.println("A máquina já esta ligada");
        }
    }


    public enum Estado {
        DESLIGADA,
        LIGADA
    }


}