set projectLocation=C:\Users\USER\eclipse-workspace\BrokenLink
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause