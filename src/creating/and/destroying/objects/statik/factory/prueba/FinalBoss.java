package creating.and.destroying.objects.statik.factory.prueba;

import creating.and.destroying.objects.statik.factory.Enemy;

public class FinalBoss implements Enemy {
    protected FinalBoss(){}
    @Override
    public FinalBoss create() {
        return new FinalBoss();
    }
}
