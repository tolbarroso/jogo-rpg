public class Monster extends Character{

    public Monster(int hp, int ataque, String status, int poderMagico) {
        super(hp, ataque, status, poderMagico);
    }

    Monster monster1 = new Monster(24, 4, "Normal", 6); 

    public void atacar(){
        //Atacar: Diminui do HP do Warrior um valor igual ao ataque o monstro (Ex: 4)
        warrior1.setHp = warrior1.setHp - monster1.ataque;

        System.out.println("Monster🧟‍♀️:");
        System.out.println("HP atual: "+ monster1.setHp);
        System.out.println("Poder Mágico atual: "+ monster1.setPoderMagico);
        System.out.println("Status: "+ monster1.status);
        System.out.println("Warrior🦸🏻‍♀️:");
        System.out.println("HP atual: "+ warrior1.setHp);
        System.out.println("Poder Mágico atual: "+ warrior1.setPoderMagico);
        System.out.println("Status: "+ warrior1.status);
    }

    public void recuperacao(){
        //Recuperação: Recupera o HP do Monster em até 2 unidades (O valor que ultrapassar o HP máximo será desconsiderado); 
        //Consome 1 de Poder Mágico; Se o Monster não tiver poder mágico o suficiente, o movimento não terá efeito.
        monster1.setPoderMagico(6);

        if (monster1.getPoderMagico() == 0) {
            System.out.println("Movimento inválido por falta de Poder Mágico!");            
        } else {
            monster1.setPoderMagico = monster1.poderMagico - 1;
            monster1.setHp = monster1.hp + 2;
        }

        System.out.println("Monster🧟‍♀️:");
        System.out.println("HP atual: "+ monster1.setHp);
        System.out.println("Poder Mágico atual: "+ monster1.setPoderMagico);
        System.out.println("Status: "+ monster1.setStatus);
        System.out.println("Warrior🦸🏻‍♀️:");
        System.out.println("HP atual: "+ warrior1.setHp);
        System.out.println("Poder Mágico atual: "+ warrior1.setPoderMagico);
        System.out.println("Status: "+ warrior1.setStatus);
    }

    public void endurecer(){
        //Endurecer: Altera o status para Fortificado e reduz o ataque recebido pelo monstro em 1 por 4 turnos;
        //Consome 2 de poder mágico; Se o Monster não tiver poder mágico o suficiente, o movimento não terá efeito.
        
        if (monster1.getPoderMagico() == 0) {
            System.out.println("Movimento inválido por falta de Poder Mágico!");            
        } else {
            monster1.setStatus("Fortificado");
            warrior1.setAtaque = 1;
        }

        System.out.println("Monster🧟‍♀️:");
        System.out.println("HP atual: "+ monster1.setHp);
        System.out.println("Poder Mágico atual: "+ monster1.setPoderMagico);
        System.out.println("Status: "+ monster1.setStatus);
        System.out.println("Warrior🦸🏻‍♀️:");
        System.out.println("HP atual: "+ warrior1.setHp);
        System.out.println("Poder Mágico atual: "+ warrior1.setPoderMagico);
        System.out.println("Status: "+ warrior1.setStatus);
    }


}
