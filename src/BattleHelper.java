class BattleHelper{
    static Random rng = new Random();
    static Scanner in = new Scanner(System.in);


    public static BattleAction getBattleAction(Combatant user){
        System.out.printf("%s's turn\n",user.getName());
        System.out.println("Select an action");
        System.out.println("1. Attack | 2. Heal");
        int i;
        do{
            i = in.nextInt();
        }
        while(i != 1 && i != 2);

        if(i == 1){
            return new AttackAction();
        }
        else{
            return new HealAction();
        }
    }

    public static void displayTurnOutcome(String outcomeText){
        System.out.printf("%s",outcomeText);
    };




    public static int getRng(int range)
    {
        return rng.nextInt(range);
    }
}