package gb.ru.sprite;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import gb.ru.base.BaseButton;
import gb.ru.math.Rect;
import gb.ru.screen.GameScreen;
import gb.ru.screen.MenuScreen;

public class NewGameButton extends BaseButton {

    private GameScreen gameScreen;

    public NewGameButton(TextureAtlas atlas, GameScreen gameScreen) {
        super(atlas.findRegion("button_new_game"));
        this.gameScreen = gameScreen;
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(0.05f);
    }

    @Override
    public void action() {
        gameScreen.startNewGame();
    }
}
