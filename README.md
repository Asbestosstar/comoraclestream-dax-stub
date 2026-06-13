# comoraclestream-dax-stub

Maven coordinates:

com.asbestosstar:comoraclestream-dax-stub:0.0.1

## Summary

Provides a minimal clean-room compatibility stub for Oracle Solaris SPARC DAX Stream Offload (`comOracleStream.jar`).

## Purpose

This artifact exists to allow software to compile against the public `com.oracle.stream` API without requiring access to Oracle's original Stream Offload package.

Oracle distributed a package named:

```
library/java/streamoffload
```

which contained:

```
/usr/lib/streamoffload/comOracleStream.jar
/usr/lib/streamoffload/libstreamoffload.so
```

The original implementation provided hardware-accelerated Java Stream operations for Oracle SPARC M7, S7 and M8 systems using the Data Analytics Accelerator (DAX).

This project provides a small compatibility layer that exposes the public API surface needed for compilation and development.

## What is included

Currently this project provides:

* `com.oracle.stream.DaxIntStream`
* `com.oracle.stream.DaxIntPipeline`

The implementation internally delegates to normal Java `IntStream` functionality.

## What is not included

This project does not include any of the internals, just signatures to compile against for developing on Sun Servers.


## Supported environments

This artifact is intended to compile and run on any device, but this jar will not do anything by itself, instead you will need to run your code on an actual SPARC Server with the streamoffload installed and added to classpath. It only exists on newer SPARC systems and does not do anything on non-SPARC systems.

## Basic usage

### 1. Add the dependency

Maven:

```xml
<dependency>
    <groupId>com.asbestosstar</groupId>
    <artifactId>comoraclestream-dax-stub</artifactId>
    <version>0.0.1</version>
</dependency>
```

### 2. Create a stream

Example:

```java
import com.oracle.stream.DaxIntStream;

public class Example {

    public static void main(String[] args) {

        long count =
                DaxIntStream.of(1, 2, 3, 4, 5)
                        .parallel()
                        .filter(i -> i > 2)
                        .count();

        System.out.println(count);
    }
}
```

### 3. Build and run

The project will compile and execute using standard Java Streams.

## Relationship to Oracle Stream Offload

Oracle Stream Offload supported a subset of Java Stream operations including:

* filter
* map
* count
* allMatch
* anyMatch
* noneMatch
* toArray

When running on supported SPARC systems with the Oracle DAX software stack installed, these operations could be offloaded to dedicated hardware accelerators.

This project does not attempt to reproduce that behavior and should not be expected to provide DAX acceleration.

## Important limitation

This artifact is a compatibility stub intended for compilation and basic execution.

It should not be considered a replacement for Oracle's original Stream Offload package, nor should it be expected to provide the same performance characteristics on SPARC hardware.

Applications requiring actual DAX hardware acceleration must obtain and install Oracle's original Stream Offload package and native libraries.

## Intended use

Use this artifact when:

* Compiling software that references `com.oracle.stream`
* Developing software intended to run on systems where Oracle Stream Offload may be present
* Creating portable software that can run with or without the original Oracle package
* Building open-source software that wishes to support the DAX API without redistributing Oracle binaries

## Legal notice

This project is an independent clean-room compatibility implementation.

It is not affiliated with, endorsed by, sponsored by, or distributed by Oracle Corporation.

No Oracle source code is included in this project.

