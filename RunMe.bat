set projectLocation=C:\Users\sivak\Desktop\vani\MavenDemo

cd %projectLocation%


set classpath=%projectLocation%\pom.xml

java org.testng.TestNG %projectLocation%\testng.xml

pause