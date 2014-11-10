spring-coach
============

This repository contains the code to teach the spring or the beginners.

Ecplise Set Up
==============

Following options are available to setup the project to import into ecplise IDE.

Option A: Classic Eclipse Project
---------
  Generate Eclipse settings for all samples (run inside each & every folder of tutorial application including parent):
  
            mvn eclipse:clean eclipse:eclipse

  Import the projects into Eclipse.
  
  The Eclipse preferences must have an M2_REPO under "Java", "Build Path", "Classpath Variables".
  
Option B: m2e (Maven Integration for Eclipse) Plugin
---------
    Import the projects into Eclipse: File -> Import -> Maven -> Existing Maven Projects

    On Parent, Right click > Configure > Convert to Maven Project
