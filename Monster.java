public class Monster extends Character{

    public Monster(int hp, int ataque, String status, int poderMagico) {
        super(hp, ataque, status, poderMagico);
    }

    Monster monster1 = new Monster(24, 4, "Normal", 6); 

    public static void atacar(){
        //Atacar: Diminui do HP do Warrior um valor igual ao ataque o monstro (Ex: 4)

        System.out.println("");
    }

    public static void recuperacao(){
        //Recuperação: Recupera o HP do Monster em até 2 unidades (O valor que ultrapassar o HP máximo será desconsiderado); 
        //Consome 1 de Poder Mágico; Se o Monster não tiver poder mágico o suficiente, o movimento não terá efeito.

        System.out.println();
    }

    public static void endurecer(){
        //Endurecer: Altera o status para Fortificado e reduz o ataque recebido pelo monstro em 1 por 4 turnos;
        //Consome 2 de poder mágico; Se o Monster não tiver poder mágico o suficiente, o movimento não terá efeito.

        System.out.println();
    }


}
