#!/bin/bash
# Make sure to do chmod +x build.sh before executing the script

# Create the dist directory if it doesn't exist
mkdir -p dist

# Compile the Java source files
javac -d bin -sourcepath src src/com/softengdev/HelloWorld/*.java

# Create the JAR file with the specified manifest
jar cfm dist/HelloWorld.jar manifest.txt -C bin .

# Build documentation
javadoc -d docs src/com/softengdev/HelloWorld/*.java