package site.gr8.mattis.creatingminecraft.core.input;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWKeyCallback;

public class KeyboardInputCallback extends GLFWKeyCallback {

    private static boolean[] keys = new boolean[GLFW.GLFW_KEY_LAST];

    @Override
    public void invoke(long window, int key, int scancode, int action, int mods) {
        keys[key] = action != GLFW.GLFW_RELEASE;
    }

    public static boolean isKeyDown(int keycode) {
        return keys[keycode];
    }

    public static boolean isKeyPressed(int keycode) {
        boolean isDown = keys[keycode];
        keys[keycode] = false;
        return isDown;
    }

}
