public class Rpg {

    static int rodadas = 0;
    static int movimentoWarrior;
    static int movimentoMonster;
    static int contFort = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Batalha de RPG🛡️⚔️");
    
        while (warrior1.setHp > 0 || monster1.setHp > 0){
            rodadas = rodadas + 1;
        
            System.out.println("Rodada "+ rodadas);
            System.out.println("Warrior, escolha seu próximo movimento: 🦸🏻‍♀️");
            System.out.println("1 - Atacar");
            System.out.println("2 - Tomar Poção de cura");
            System.out.println("3 - Fortificar");
            movimentoWarrior = in.nextInt();

            if(movimentoWarrior > 3){
                System.out.println("Insira um movimento válido!");
                System.out.println("Opções: ");
                System.out.println("1 - Atacar");
                System.out.println("2 - Tomar Poção de cura");
                System.out.println("3 - Fortificar");
                movimentoWarrior = in.nextInt();
            }

            if(movimentoWarrior == 1){
                warrior1.atacar();
            }

            if (movimentoWarrior == 2) {
                warrior1.tomarPoçãoDeCura();

            }

            if (movimentoWarrior == 3) {
                while (contFort <= 5){
                    contFort = contFort + 1;
                    warrior1.fortificar();
                }
            }

            System.out.println("Monster, escolha seu próximo movimento: ");
            System.out.println("1 - Atacar");
            System.out.println("2 - Recuperação");
            System.out.println("3 - Endurecer");
            movimentoMonster = in.nextInt();

            if(movimentoMonster > 3){
                System.out.println("Insira um movimento válido!");
                System.out.println("Opções: ");
                System.out.println("1 - Atacar");
                System.out.println("2 - Recuperação");
                System.out.println("3 - Endurecer");
                movimentoMonster = in.nextInt();
            }

            if (movimentoMonster == 1){
                monster1.atacar();
            }

            if (movimentoMonster == 2) {
                monster1.recuperacao();

            }

            if (movimentoMonster == 3) {
                while (contFort <= 4){
                    contFort = contFort + 1;
                    monster1.endurecer();
                }
            }
    
        }
        
        if (monster1.sethp == 0) {
            System.out.println("Monstro morreu!🤕☠️ Warrior venceu!🦸🏻‍♀️🏆");
            
        }

        if (warrior1.sethp == 0) {
            System.out.println("Warrior morreu!🤕☠️ Monstro venceu!🦸🏻‍♀️🏆");
            
        }

    }
}