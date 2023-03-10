@echo off


::: ______                  _   _____           _       _   
::: |  _  \                | | /  ___|         (_)     | |  
::: | | | |___  _ __  _   _| |_\ `--.  ___ _ __ _ _ __ | |_ 
::: | | | / _ \| '_ \| | | | __|`--. \/ __| '__| | '_ \| __|
::: | |/ / (_) | | | | |_| | |_/\__/ / (__| |  | | |_) | |_ 
::: |___/ \___/|_| |_|\__,_|\__\____/ \___|_|  |_| .__/ \__|
:::                                              | |        
:::                                              |_|       

for /f "delims=: tokens=*" %%A in ('findstr /b ::: "%~f0"') do @echo(%%A

if "%1"=="about" (
  echo:
  echo DonutScript is a script language based on ActionScript that compiles to JVM and AVM
  echo It is created by FlashContent for creating games, applications and websites.
  echo:
) 
if "%1"=="version" (
  echo:
  echo DonutScript 1.0.0
  echo:
) 
if "%1"=="java" (
  echo:
  echo Currently not avaible :(
  echo:
)
if "%1"=="help" (
  echo:
  echo Help:
  echo version: show version
  echo help: show this
  echo java: compile a .donut file to a .jar file.
  echo about: show about DonutScript
  echo:
)
if "%1"=="" (
   echo:
   echo Use: donut -command- -options-
   echo Are you looking for the commands? Use help instead.
  echo:
)
 
