:: Create required directories if they do not exist
mkdir dist
mkdir docs

:: Compile Java files
javac -d bin -sourcepath src src/com/softengdev/HelloWorld/*.java

:: Create final JAR file 
jar cfm dist/HelloWorld.jar manifest.txt -C bin .

:: Build documentation
javadoc -d docs src/com/softengdev/HelloWorld/*.java