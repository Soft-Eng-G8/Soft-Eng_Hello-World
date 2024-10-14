# Create the dist directory if it does not exist
mkdir -p dist

# Compile Java files
javac -d bin -sourcepath src src/com/softengdev/HelloWorld/*.java

# Create final JAR file 
jar cfm dist/HelloWorld.jar manifest.txt -C bin .