package creating.and.destroying.objects.statik.factory.prueba;

import creating.and.destroying.objects.statik.factory.Enemy;

public class Mob implements Enemy {

    protected Mob(){}

    @Override
    public Enemy create() {
        return new Mob();
    }
}
