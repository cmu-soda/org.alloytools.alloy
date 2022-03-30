package org.alloytools.alloy.core.api;

import java.io.File;

/**
 * An Alloy Compiler that can compile a file or a source and provide a
 * {@link TModule}
 */
public interface Compiler {

    /**
     * Compile a source string into a module
     * 
     * @return a Module
     */
    TModule compileSource(String source);

    /**
     * Compile a path, the path is resolved via the resolver. Any explicit imports
     * in the content (specified using the 'open' keyword) will also be recursively
     * compiled.
     * 
     * @return a Module
     */
    TModule compile(String path);

    /**
     * Compile a file. Any explicit imports in the content (specified using the
     * 'open' keyword) will also be recursively compiled.
     * 
     * @param file the file
     * @return a Module
     */
    TModule compile(File file);
}
