@echo off
setlocal enabledelayedexpansion

set "libsPath=libs"
set "groupId=com.shootoff.libs"
set "version=1.0.0"

for %%f in (%libsPath%\*.jar) do (
    set "jarPath=%%f"
    set "artifactId=%%~nf"
    call mvn install:install-file -Dfile=!jarPath! -DgroupId=%groupId% -DartifactId=!artifactId! -Dversion=%version% -Dpackaging=jar
)

endlocal