package com.cienet.decorator.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SkipSpaceOutputStream extends FilterOutputStream {

    public SkipSpaceOutputStream(OutputStream out) {
        super(out);
    }

    public void write(int b) throws IOException {
        if (b != ' ') {
            super.write(b);
        }
    }
}
