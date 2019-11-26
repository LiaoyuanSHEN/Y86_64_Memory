package y86_64.memory;

import y86_64.Bus;
import y86_64.ComponentId;
import y86_64.Memory;
import y86_64.bus.BusFactory;
import y86_64.exceptions.ComponentException;

public class MemoryTestClient {

    public static void main(String[] args) throws ComponentException {
        Bus bus = BusFactory.getBus();
        Memory memory = bus.getComponent(ComponentId.MEMORY);
        memory.write(0, 123);
        System.out.println(memory.read(0));
        System.out.println(memory.read(1L + Integer.MAX_VALUE));
    }

}
