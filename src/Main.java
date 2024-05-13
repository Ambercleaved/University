import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create instances of components using factory methods
        CPU cpu1 = Factory.createCPU(1,"cpu","Intel","i5-8400",6,"Lga",3.6);
        GPU gpu1 = Factory.createGPU(2,"gpu","Nvidia", "RTX 2060s","pci 3.0", 16000);
        Motherboard mb1 = Factory.createMotherboard(3,"motherboard","Asus","Asrock z345","pci 3.0","Lga");
        CPU cpu2 = Factory.createCPU(4,"cpu","AMD","Ryzen 7 5800X",8,"AM4",4.7);
        GPU gpu2 = Factory.createGPU(5,"gpu","AMD", "RX 6700 XT","pci 4.0", 24200);
        Motherboard mb2 = Factory.createMotherboard(6,"motherboard","Gigabyte","B550 Aorus Elite","pci 4.0","AM4");
        CPU cpu3 = Factory.createCPU(7,"cpu","Intel","I7 - 11500K",10,"Lga",4.2);
        GPU gpu3 = Factory.createGPU(8,"gpu","Nvidia", "GTX 1660","pci 3.0", 10000);
        Motherboard mb3 = Factory.createMotherboard(9,"motherboard","Lenovo","564","pci 3.0","Lga");

        // Create lists of motherboards, CPUs, and GPUs
        List<Motherboard> motherboards = new ArrayList<>();
        motherboards.add(mb1);
        motherboards.add(mb2);
        motherboards.add(mb3);

        List<CPU> cpus = new ArrayList<>();
        cpus.add(cpu1);
        cpus.add(cpu2);
        cpus.add(cpu3);

        List<GPU> gpus = new ArrayList<>();
        gpus.add(gpu1);
        gpus.add(gpu2);
        gpus.add(gpu3);

        // Create a SystemFacade instance with the lists of components
        SystemFacade systemFacade = new SystemFacade(motherboards, cpus, gpus);

        // Create a ComponentVisitor instance
        ComponentVisitor componentVisitor = new ComponentVisitor();

        // Build systems and output their details using the ComponentVisitor
        systemFacade.buildAndOutputSystems(componentVisitor);
    }
}