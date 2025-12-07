@echo off

javac -sourcepath .\%1 .\%1\*.java -d %1
