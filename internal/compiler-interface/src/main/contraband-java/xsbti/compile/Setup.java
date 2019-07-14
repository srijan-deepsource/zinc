/**
 * This code is generated using [[http://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package xsbti.compile;
/** Configures incremental recompilation. */
public final class Setup implements java.io.Serializable {
    
    public static Setup create(xsbti.compile.PerClasspathEntryLookup _perClasspathEntryLookup, boolean _skip, java.io.File _cacheFile, xsbti.compile.GlobalsCache _cache, xsbti.compile.IncOptions _incrementalCompilerOptions, xsbti.Reporter _reporter, java.util.Optional<xsbti.compile.CompileProgress> _progress, xsbti.T2<String, String>[] _extra) {
        return new Setup(_perClasspathEntryLookup, _skip, _cacheFile, _cache, _incrementalCompilerOptions, _reporter, _progress, _extra);
    }
    public static Setup of(xsbti.compile.PerClasspathEntryLookup _perClasspathEntryLookup, boolean _skip, java.io.File _cacheFile, xsbti.compile.GlobalsCache _cache, xsbti.compile.IncOptions _incrementalCompilerOptions, xsbti.Reporter _reporter, java.util.Optional<xsbti.compile.CompileProgress> _progress, xsbti.T2<String, String>[] _extra) {
        return new Setup(_perClasspathEntryLookup, _skip, _cacheFile, _cache, _incrementalCompilerOptions, _reporter, _progress, _extra);
    }
    private xsbti.compile.PerClasspathEntryLookup perClasspathEntryLookup;
    private boolean skip;
    private java.io.File cacheFile;
    private xsbti.compile.GlobalsCache cache;
    private xsbti.compile.IncOptions incrementalCompilerOptions;
    private xsbti.Reporter reporter;
    private java.util.Optional<xsbti.compile.CompileProgress> progress;
    private xsbti.T2<String, String>[] extra;
    protected Setup(xsbti.compile.PerClasspathEntryLookup _perClasspathEntryLookup, boolean _skip, java.io.File _cacheFile, xsbti.compile.GlobalsCache _cache, xsbti.compile.IncOptions _incrementalCompilerOptions, xsbti.Reporter _reporter, java.util.Optional<xsbti.compile.CompileProgress> _progress, xsbti.T2<String, String>[] _extra) {
        super();
        perClasspathEntryLookup = _perClasspathEntryLookup;
        skip = _skip;
        cacheFile = _cacheFile;
        cache = _cache;
        incrementalCompilerOptions = _incrementalCompilerOptions;
        reporter = _reporter;
        progress = _progress;
        extra = _extra;
    }
    /** Provides a lookup of data structures and operations associated with a single classpath entry. */
    public xsbti.compile.PerClasspathEntryLookup perClasspathEntryLookup() {
        return this.perClasspathEntryLookup;
    }
    /** If true, no sources are actually compiled and the Analysis from the previous compilation is returned. */
    public boolean skip() {
        return this.skip;
    }
    /**
     * The file used to cache information across compilations.
     * This file can be removed to force a full recompilation.
     * The file should be unique and not shared between compilations.
     */
    public java.io.File cacheFile() {
        return this.cacheFile;
    }
    public xsbti.compile.GlobalsCache cache() {
        return this.cache;
    }
    public xsbti.compile.IncOptions incrementalCompilerOptions() {
        return this.incrementalCompilerOptions;
    }
    /** The reporter that should be used to report scala compilation to. */
    public xsbti.Reporter reporter() {
        return this.reporter;
    }
    /** Optionally provide progress indication. */
    public java.util.Optional<xsbti.compile.CompileProgress> progress() {
        return this.progress;
    }
    public xsbti.T2<String, String>[] extra() {
        return this.extra;
    }
    public Setup withPerClasspathEntryLookup(xsbti.compile.PerClasspathEntryLookup perClasspathEntryLookup) {
        return new Setup(perClasspathEntryLookup, skip, cacheFile, cache, incrementalCompilerOptions, reporter, progress, extra);
    }
    public Setup withSkip(boolean skip) {
        return new Setup(perClasspathEntryLookup, skip, cacheFile, cache, incrementalCompilerOptions, reporter, progress, extra);
    }
    public Setup withCacheFile(java.io.File cacheFile) {
        return new Setup(perClasspathEntryLookup, skip, cacheFile, cache, incrementalCompilerOptions, reporter, progress, extra);
    }
    public Setup withCache(xsbti.compile.GlobalsCache cache) {
        return new Setup(perClasspathEntryLookup, skip, cacheFile, cache, incrementalCompilerOptions, reporter, progress, extra);
    }
    public Setup withIncrementalCompilerOptions(xsbti.compile.IncOptions incrementalCompilerOptions) {
        return new Setup(perClasspathEntryLookup, skip, cacheFile, cache, incrementalCompilerOptions, reporter, progress, extra);
    }
    public Setup withReporter(xsbti.Reporter reporter) {
        return new Setup(perClasspathEntryLookup, skip, cacheFile, cache, incrementalCompilerOptions, reporter, progress, extra);
    }
    public Setup withProgress(java.util.Optional<xsbti.compile.CompileProgress> progress) {
        return new Setup(perClasspathEntryLookup, skip, cacheFile, cache, incrementalCompilerOptions, reporter, progress, extra);
    }
    public Setup withExtra(xsbti.T2<String, String>[] extra) {
        return new Setup(perClasspathEntryLookup, skip, cacheFile, cache, incrementalCompilerOptions, reporter, progress, extra);
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Setup)) {
            return false;
        } else {
            Setup o = (Setup)obj;
            return this.perClasspathEntryLookup().equals(o.perClasspathEntryLookup()) && (this.skip() == o.skip()) && this.cacheFile().equals(o.cacheFile()) && this.cache().equals(o.cache()) && this.incrementalCompilerOptions().equals(o.incrementalCompilerOptions()) && this.reporter().equals(o.reporter()) && this.progress().equals(o.progress()) && java.util.Arrays.deepEquals(this.extra(), o.extra());
        }
    }
    public int hashCode() {
        return 37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (17 + "xsbti.compile.Setup".hashCode()) + perClasspathEntryLookup().hashCode()) + Boolean.valueOf(skip()).hashCode()) + cacheFile().hashCode()) + cache().hashCode()) + incrementalCompilerOptions().hashCode()) + reporter().hashCode()) + progress().hashCode()) + java.util.Arrays.deepHashCode(extra()));
    }
    public String toString() {
        return "Setup("  + "perClasspathEntryLookup: " + perClasspathEntryLookup() + ", " + "skip: " + skip() + ", " + "cacheFile: " + cacheFile() + ", " + "cache: " + cache() + ", " + "incrementalCompilerOptions: " + incrementalCompilerOptions() + ", " + "reporter: " + reporter() + ", " + "progress: " + progress() + ", " + "extra: " + extra() + ")";
    }
}
