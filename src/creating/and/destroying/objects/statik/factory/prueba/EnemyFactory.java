package creating.and.destroying.objects.statik.factory.prueba;

import creating.and.destroying.objects.statik.factory.Enemy;

public class EnemyFactory {

    private EnemyFactory(){}

    public static Enemy createMob(){
        return new Mob();
    }

    public static Enemy createBoss(){
        return new Boss();
    }

    public static Enemy createFinalBoss(){
        return new FinalBoss();
    }


}
