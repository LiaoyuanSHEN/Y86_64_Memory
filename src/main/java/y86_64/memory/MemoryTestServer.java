package y86_64.memory;

import y86_64.Bus;
import y86_64.ComponentId;
import y86_64.bus.BusFactory;

public class MemoryTestServer {

    public static void main(String[] args) {
        Bus bus = BusFactory.getBus();
        bus.registerComponent(ComponentId.MEMORY, new MemoryImpl());
    }

}
