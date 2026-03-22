package pattern1_creation.create3_abstract_factory.task.win;

import pattern1_creation.create3_abstract_factory.task.Button;

public final class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a button in Windows style.");
    }
}
