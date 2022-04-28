@echo off

javac -d ./build -cp ./lib/*;./build CarrotTODO.java
javac -d ./build -cp ./lib/*;./build CreateExcel.java
javac -d ./build -cp ./lib/*;./build ProjectHelp.java
javac -d ./build -cp ./lib/*;./build ProjectIntro.java
javac -d ./build -cp ./lib/*;./build UpdateExcel.java
javac -d ./build -cp ./lib/*;./build ItemCompFunction.java
javac -d ./build -cp ./lib/*;./build DeleteFunction.java
javac -d ./build -cp ./lib/*;./build ShowListFunction.java

java -cp ./lib/*;./build CarrotTODO < CreateTest1.txt
java -cp ./lib/*;./build CarrotTODO < CreateTest2.txt
java -cp ./lib/*;./build CarrotTODO < UpdateTest1.txt
java -cp ./lib/*;./build CarrotTODO < UpdateTest2.txt
java -cp ./lib/*;./build CarrotTODO < MarkTest1.txt
java -cp ./lib/*;./build CarrotTODO < MarkTest2.txt
java -cp ./lib/*;./build CarrotTODO < DisplayTest1.txt
java -cp ./lib/*;./build CarrotTODO < DisplayTest2.txt
java -cp ./lib/*;./build CarrotTODO < DeleteTest1.txt
java -cp ./lib/*;./build CarrotTODO < DeleteTest2.txt


pause