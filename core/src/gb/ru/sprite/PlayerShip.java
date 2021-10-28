package gb.ru.sprite;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import gb.ru.base.Sprite;
import gb.ru.math.Rect;
import gb.ru.math.Rnd;

public class PlayerShip extends Sprite {

    private static final float HEIGHT = 0.1f;
    private static final float SPEED = 0.5f;

    private final Vector2 leftMove = new Vector2(-SPEED, 0);
    private final Vector2 rightMove = new Vector2(SPEED, 0);
    private final Vector2 upMove = new Vector2(0, SPEED);
    private final Vector2 downMove = new Vector2(0, -SPEED);
    private final Vector2 v;

    public PlayerShip(TextureAtlas atlas) {
        super(atlas.findRegion("main_ship_black"));
        v = new Vector2();
    }

    private void toMoveLeft() {
        v.set(leftMove);
    }

    private void toMoveRight() {
        v.set(rightMove);
    }

    private void toMoveUp() {
        v.set(upMove);
    }

    private void toMoveDown() {
        v.set(downMove);
    }

    private void toStop() {
        v.setZero();
    }

    public boolean keyDown(int keycode) {
            switch (keycode) {
                case Input.Keys.A:
                case Input.Keys.LEFT:
                    toMoveLeft();
                    break;
                case Input.Keys.D:
                case Input.Keys.RIGHT:
                    toMoveRight();
                    break;
                case Input.Keys.W:
                case Input.Keys.UP:
                    toMoveUp();
                    break;
                case Input.Keys.S:
                case Input.Keys.DOWN:
                    toMoveDown();
                    break;
            }
        return false;
    }

    @Override
    public void update(float delta) {
        pos.mulAdd(v, delta);
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        return super.touchDown(touch, pointer, button);
    }

    @Override
    public boolean touchUp(Vector2 touch, int pointer, int button) {
        return super.touchUp(touch, pointer, button);
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(HEIGHT);
        setBottom(worldBounds.getBottom() + 0.05f);
    }

}
