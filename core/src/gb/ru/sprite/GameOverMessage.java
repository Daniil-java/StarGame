package gb.ru.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import gb.ru.base.Sprite;
import gb.ru.math.Rect;

public class GameOverMessage extends Sprite {

    public GameOverMessage(TextureAtlas atlas) {
        super(atlas.findRegion("message_game_over"));
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(0.09f);
        setBottom(0.05f);
    }
}
