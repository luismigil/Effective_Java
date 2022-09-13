package creating.and.destroying.objects.statik.factory.prueba;

import creating.and.destroying.objects.statik.factory.Enemy;

public class Boss implements Enemy {
    protected Boss(){}
    @Override
    public Enemy create() {
        return new Boss();
    }
}
