public class Warrior extends Character {

    public Warrior(int hp, int ataque, String status, int poderMagico) {
        super(hp, ataque, status, poderMagico);
    }

    Warrior warrior1 = new Warrior(20, 3, "Normal", 5);
    
    public void atacar(){
        //Atacar: Diminui do HP do monster um valor igual ao ataque do Warrior (Ex: 3).
        monster1.setHp = monster1.setHp - warror1.ataque;

        System.out.println("Warrior🦸🏻‍♀️:");
        System.out.println("HP atual: "+ warrior1.setHp);
        System.out.println("Poder Mágico atual: "+ warrior1.setPoderMagico);
        System.out.println("Status: "+ warrior1.status);
        System.out.println("Monster🧟‍♀️:");
        System.out.println("HP atual: "+ monster1.setHp);
        System.out.println("Poder Mágico atual: "+ monster1.setPoderMagico);
        System.out.println("Status: "+ monster1.status);
        
    }

    public void tomarPoçãoDeCura(){
        //Tomar poção de cura: Recupera o HP do guerreiro em até 10 unidades (O valor que ultrapassar o HP máximo será desconsiderado);
        //Consome 1 de Poção de Cura; Se o Warrior não tiver poção de cura, o movimento não terá efeito.
        monster1.setPoderMagico(5);

        if (warrior1.getPoderMagico() == 0) {
            System.out.println("Movimento inválido por falta de Poder Mágico!");            
        } else {
            warrior1.setPoderMagico = warrior1.poderMagico - 1;
            warrior1.setHp = warrior1.hp + 10;
        }

        System.out.println("Warrior🦸🏻‍♀️:");
        System.out.println("HP atual: "+ warrior1.setHp);
        System.out.println("Poder Mágico atual: "+ warrior1.setPoderMagico);
        System.out.println("Status: "+ warrior1.status);
        System.out.println("Monster🧟‍♀️:");
        System.out.println("HP atual: "+ monster1.setHp);
        System.out.println("Poder Mágico atual: "+ monster1.setPoderMagico);
        System.out.println("Status: "+ monster1.status);
        
    }

    public void fortificar(){
        //Fortificar: Poder mágico que muda o status do warrior para Fortificado; Aumenta o ataque o warrior em 2 (Ex: Vira 5) por 5 turnos;
        //Após os 5 turnos, tanto o status quanto o ataque voltam ao normal; Consome 5 de poder mágico;
        //Se o Warrior não tiver poder mágico o suficiente, o movimento não terá efeito. 
        if (warrior1.getPoderMagico() == 0) {
            System.out.println("Movimento inválido por falta de Poder Mágico!");            
        } else {
            warrior1.setStatus("Fortificado");
            warrior1.setAtaque = warrior1.setAtaque * 2;
        }

        System.out.println("Warrior🦸🏻‍♀️:");
        System.out.println("HP atual: "+ warrior1.setHp);
        System.out.println("Poder Mágico atual: "+ warrior1.setPoderMagico);
        System.out.println("Status: "+ warrior1.setStatus);
        System.out.println("Monster🧟‍♀️:");
        System.out.println("HP atual: "+ monster1.setHp);
        System.out.println("Poder Mágico atual: "+ monster1.setPoderMagico);
        System.out.println("Status: "+ monster1.setStatus);
    }
}