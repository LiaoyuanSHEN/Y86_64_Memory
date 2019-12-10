package y86_64.memory;

import y86_64.Memory;
import y86_64.exceptions.MemoryException;
import y86_64.exceptions.MemoryOutOfBoundException;

import java.io.IOException;

public class MemoryImpl implements Memory {

    // 128MB total memory
    private static final int MAX_LENGTH = 1024 * 1024 * 128;
    private byte[] memory = new byte[MAX_LENGTH];

    @Override
    public byte readByte(long address) throws MemoryException {
        if (address < 0 || address > Integer.MAX_VALUE) {
            throw new MemoryOutOfBoundException();
        }
        return memory[(int) address];
    }

    @Override
    public void writeByte(long address, byte value) throws MemoryException {
        if (address < 0 || address > MAX_LENGTH) {
            throw new MemoryOutOfBoundException();
        }
        memory[(int) address] = value;
    }

    @Override
    public void stop() throws IOException {
        // do nothing
    }
}
