package gioco;

public class superEroe extends umano{
    String nome;


    public superEroe(String nome){
        this.nome=nome;
    }
    @Override
    public void Combattimento() {
        System.out.println("il supereroe "+nome+" combatte e perde 3 punti forza");
        forza-=3;
    }
    public int getForza(){
        return forza;
    }
}
