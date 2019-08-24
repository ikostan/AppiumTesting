## Intro to Mobile automation testing for IOS and Android with Appium

### Dev config:<br/>
- [Win 10 64 bit](https://www.microsoft.com/en-ca/software-download/windows10)<br/>
- [GitHub Desktop v2.1.2](https://desktop.github.com/)<br/>
- [Git v2.22.0.windows.1](https://git-scm.com/downloads)<br/>
- [Eclipse IDE for Java Developers Version: 2019-06 (4.12.0)](https://www.eclipse.org/downloads/packages/installer)<br/>
- [Android Studio v3.5](https://developer.android.com/studio)<br/>
- [Java SE Development Kit 8 Update 221 (64-bit)](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)<br/>
- [Node.js v10.6.3](https://nodejs.org/en/download/current/)<br/>
- [Appium Server GUI client v1.13.0](http://appium.io/)<br/>
- [nmp v6.9.0](https://nodejs.org/en/download/)<br/>
- [Maven 3.6.1](https://maven.apache.org/download.cgi)<br/>

### Nice to have tools:<br/>
- [TeamViewer](https://www.teamviewer.com/en/?pcc_keyword=teamviewer&gclid=CjwKCAjwnf7qBRAtEiwAseBO_KX932ojJ2gLJlB0LXHzDgtRmizzK8Hps7460wGhuOVlpp9Ea70ukxoCUgYQAvD_BwE)<br/>
- [TeamViewer QuickSupport](https://play.google.com/store/apps/details?id=com.teamviewer.quicksupport.market&hl=en_CA)<br/>
- [AirDroid: Remote access & File](https://play.google.com/store/apps/details?id=com.sand.airdroid&hl=en_CA)<br/>
- [Selendroid Test App](http://search.maven.org/remotecontent?filepath=io/selendroid/selendroid-test-app/0.17.0/selendroid-test-app-0.17.0.apk)<br/>

### Documentation:<br/>
- [Appium API Documentation](http://appium.io/docs/en/about-appium/api/)

### How To:<br/>

<details>
  
  <summary><b>JAVA_HOME PATH</b></summary>
  <br/>
<b>A. In order to configure JAVA_HOME path do the following:</b><br/>
  1. Go to "Advanced System Settings" > Advanced Tab > Environment Variables<br/>
  2. Go to System Variables section > click on New... button<br/>
  3. Type Variable name: JAVA_HOME<br/>
  4. Enter Variable Value: C:\Program Files\Java\jdk1.8.0_221<br/>
  5. Press OK button<br/><br/>
  <div align="center"> 
  <img width="90%" height="90%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/java_home.jpg" hspace="10">
  </div>
  
<b>B. Edit environment variable:</b><br/>
  1. From System variables list select path > Press Edit... button<br/>
  2. Press on New button > type: %JAVA_HOME%\bin<br/>
  3. Press OK button<br/>
  
  <div align="center"> 
  <img width="90%" height="90%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/java_home_2.jpg" hspace="10">
  </div>
  
</details>


<details>
  
  <summary><b>Environment variables for Android ADB</b></summary>
   <br/>
<b>A. In order to configure ANDROID_HOME path do the following:</b><br/>
  1. Go to "Advanced System Settings" > Advanced Tab > Environment Variables<br/>
  2. Go to System Variables section > click on New... button<br/>
  3. Type Variable name: ANDROID_HOME<br/>
  4. Enter Variable Value: C:\Users\username\AppData\Local\Android\Sdk<br/>
  5. Press OK button<br/><br/>
  <div align="center"> 
  <img width="90%" height="90%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/maven_home.jpg" hspace="10">
  </div>
  
  <b>B. Edit environment variable:</b><br/>
  1. From System variables list select path > Press Edit... button<br/>
  2. Press on New button > type: %ANDROID_HOME%\tools<br/>
  3. Press OK button<br/>
  4. Press on New button > type: %ANDROID_HOME%\platform-tools<br/>
  5. Press OK button<br/>
  
  <div align="center"> 
  <img width="90%" height="90%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/android_home_2.JPG" hspace="10">
  </div>
  
  <b>C. Test:</b>
  1. Open CMD > run "adb devices"<br/>
  2. If everifyng is configured properly you will something like this:<br/>
  
  <div align="center"> 
  <img width="50%" height="50%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/adb_devices.JPG" hspace="10">
  </div>
  
</details>


<details>
  
  <summary><b>Maven PATH</b></summary>
  <br/>
  <b>A. In order to configure MVN_HOME path do the following:</b><br/>
  1. Go to "Advanced System Settings" > Advanced Tab > Environment Variables<br/>
  2. Go to System Variables section > click on New... button<br/>
  3. Type Variable name: MVN_HOME<br/>
  4. Enter Variable Value: C:\Users\username\AppData\Local\Android\Sdk<br/>
  5. Press OK button<br/><br/>
  <div align="center"> 
  <img width="90%" height="90%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/maven_home.jpg" hspace="10">
  </div>
  
  <b>B. Edit environment variable:</b><br/>
  1. From System variables list select path > Press Edit... button<br/>
  2. Press on New button > type: %MVN_HOME%\bin<br/>
  3. Press OK button<br/>
  
  <div align="center"> 
  <img width="90%" height="90%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/maven_home_2.jpg" hspace="10">
  </div>
  
  <b>C. Test:</b>
  1. Open CMD > run "mvn --version"<br/>
  2. If everifyng is configured properly you will something like this:<br/>
  
  <div align="center"> 
  <img width="50%" height="50%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/maven_cmd.JPG" hspace="10">
  </div>
  
</details>


<details>
  
  <summary><b>Adding Dependencies: Java Client</b></summary>
  <br/>
  <div align="center"> 
  <img width="90%" height="90%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/pom_dependencies.JPG" hspace="10">
  </div>
  
  Source: https://mvnrepository.com/artifact/io.appium/java-client
</details>


<details>
  
  <summary><b>Inspect with Chrome Developer</b></summary>
  <br/>
  1. Open Chrome web browser > new tab<br/>
  2. Paste following address: chrome:..inspect/#devices<br/>
  
  <br/>If evryfing connected properly you will see something like this:<br>
  <div align="center"> 
  <img width="90%" height="90%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/inspect_devices.JPG" hspace="10">
  </div>
  
  Source: 
</details>


<details>
  
  <summary><b>API Java Documentation Integration</b></summary>
  <br/>
  1. Open context menu > Go to Build Path > Configure Build Path...<br/>
  2. Open Libraries tab > Expand Maven dependencies >  Go to java-client > Javadoc > Press on Edit button<br/>
  3. Add following path: https://appium.github.io/java-client/<br/>
  4. Click OK<br/>
  
  <br/><div align="center"> 
  <img width="70%" height="70%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/api_doc.JPG" hspace="10">
  </div>
  
  <br/><div align="center"> 
  <img width="70%" height="70%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/properties.JPG" hspace="10">
  </div>
  
  <br/><div align="center"> 
  <img width="70%" height="70%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/edit_java_doc.JPG" hspace="10">
  </div>
  
  <br/><div align="center"> 
  <img width="70%" height="70%" src="https://github.com/ikostan/AppiumTesting/blob/master/img/edit.JPG" hspace="10">
  </div>
  
</details>

