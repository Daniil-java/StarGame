package gb.ru.sprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import gb.ru.base.Sprite;
import gb.ru.math.Rect;

public class Logo extends Sprite {

    private Vector2 touch;
    private Vector2 v;

    private static float V_LEN = 0.01f;


    public Logo(Texture texture) {
        super(new TextureRegion(texture));
        touch = new Vector2();
        v = new Vector2();
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.1f);
    }

    @Override
    public void update(float delta) {
        if ( pos.dst(touch) <= v.len()) {
            pos.set(touch);
        } else {
            pos.add(v);
        }
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        this.touch.set(touch);
        v.set(touch.cpy().sub(pos)).setLength(V_LEN);
        return false;
    }
}
