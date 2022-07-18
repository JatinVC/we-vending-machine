package com.mthree;

import com.mthree.Controller.VendingMachineController;
import com.mthree.DAO.Inventory;
import com.mthree.DAO.InventoryImpl;
import com.mthree.DTO.VendingMachineItem;
import com.mthree.Service.VendingMachineService;
import com.mthree.View.UserIO;
import com.mthree.View.UserIOConsoleImpl;
import com.mthree.View.VendingMachineView;

public class App {
    public static void main( String[] args ){
        UserIO io = new UserIOConsoleImpl();
        VendingMachineView view = new VendingMachineView(io);
        Inventory inventory = new InventoryImpl();
        VendingMachineService service = new VendingMachineService(inventory);
        
        VendingMachineController controller = new VendingMachineController(view, service, inventory);

        controller.run();
    }
}
