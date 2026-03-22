package pattern1_creation.create3_abstract_factory.task.linux;

import pattern1_creation.create3_abstract_factory.task.Button;

public final class LinuxButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering a button in Linux style.");
    }
}
