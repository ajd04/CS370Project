@echo off

javac -d ./build -cp ./lib/*;./build CarrotTODO.java
javac -d ./build -cp ./lib/*;./build CreateExcel.java
javac -d ./build -cp ./lib/*;./build ProjectHelp.java
javac -d ./build -cp ./lib/*;./build ProjectIntro.java
javac -d ./build -cp ./lib/*;./build UpdateExcel.java
javac -d ./build -cp ./lib/*;./build ItemCompFunction.java
javac -d ./build -cp ./lib/*;./build DeleteFunction.java
javac -d ./build -cp ./lib/*;./build ShowListFunction.java

java -cp ./lib/*;./build CarrotTODO < input.txt

pause