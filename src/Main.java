import Persistance.JsonFileInteract;
import presentation.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MenuMain menu = new MenuMain();
        MenuComposer menuComposer = new MenuComposer();
        MenuConductor menuConductor = new MenuConductor();
        ControllerConductor controllerConductor = new ControllerConductor(menuConductor);
        ControllerComposer controllerComposer = new ControllerComposer(menuComposer);

        ControllerMain controllerMain = new ControllerMain(menu, controllerComposer, controllerConductor);
        controllerMain.run();

    }
}
