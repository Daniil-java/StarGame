package gb.ru.sprite;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import gb.ru.base.BaseButton;
import gb.ru.math.Rect;
import gb.ru.screen.GameScreen;

public class PlayButton extends BaseButton {

    private static final float HEIGHT = 0.25f;
    private static final float PADDING = 0.03f;

    private final Game game;

    public PlayButton(TextureAtlas atlas, Game game) {
        super(atlas.findRegion("btPlay"));
        this.game = game;
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(HEIGHT);
        setLeft(worldBounds.getLeft() + PADDING);
        setBottom(worldBounds.getBottom() + PADDING);
    }

    @Override
    public void action() {
        game.setScreen(new GameScreen());
    }
}
