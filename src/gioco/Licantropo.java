package gioco;


public class Licantropo implements attacco {
    String nome;
    int forza;
    int lunaPiena=(int)(Math.random()*2);


    public Licantropo(String nome){
        this.nome=nome;
        if(lunaPiena==0){
            forza=15;
        }
        else{
            forza=10;
        }
    }

    @Override
    public void morso () {
        System.out.println("il licantropo " + nome + " morde e perde 2 punti forza");
        forza -= 2;
    }

    @Override
    public void combattimento() {
        System.out.println("il licantropo "+nome+" combatte e perde 3 punti forza");
        forza-=3;
    }

    public void attacco(){

        if(lunaPiena==0) {
            morso();
        }
        else{
            combattimento();
        }
    }

    public int getForza() {
        return forza;
    }
}
