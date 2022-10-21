public class Battle{
    private Combatant player;
    private Combatant enemy;
    private BattleAction playerAction;

    public Battle(Combatant thePlayer, Combatant theEnemy){
        player = thePlayer;
        enemy = theEnemy;
        fight();
    }


    private void fight(){
        while(player.getHealth() > 0 && enemy.getHealth() > 0){
            playerAction = BattleHelper.getBattleAction(player);    //poll for input to get choie of action
            player.takeTurn(playerAction, enemy);                       //pass the enemy encase decision was to attack
            BattleHelper.displayTurnOutcome(player.battleAction.toString());    //toString method returns result of chosen action
        }
    }

}
