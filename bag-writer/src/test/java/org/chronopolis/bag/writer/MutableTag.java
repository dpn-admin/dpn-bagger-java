package org.chronopolis.bag.writer;

import org.chronopolis.bag.core.TagFile;

import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by shake on 5/17/16.
 */
class MutableTag implements TagFile {
    Set<String> strings = new HashSet<>();

    @Override
    public long getSize() {
        return 10;
    }

    @Override
    public Path getPath() {
        return Paths.get("mutable.txt");
    }

    @Override
    public InputStream getInputStream() {
        // TODO: May test this eventually
        return new IOExceptionStream();
    }
}
