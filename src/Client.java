import creating.and.destroying.objects.statik.factory.Enemy;
import creating.and.destroying.objects.statik.factory.Player;
import creating.and.destroying.objects.statik.factory.prueba.EnemyFactory;

public class Client {
    public static void main (String [ ] args) {
        Enemy enemy = EnemyFactory.createMob();

        Player player = new Player();
        player.getDamged(enemy);
    }
}
