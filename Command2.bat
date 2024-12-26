@echo off
setlocal enabledelayedexpansion

set "libsPath=libs"
set "groupId=com.shootoff.libs"
set "version=1.0.0"

for %%f in (%libsPath%\*.jar) do (
    set "jarPath=%%f"
    set "artifactId=%%~nf"
    call mvn org.apache.maven.plugins:maven-install-plugin:2.3.1:install-file -Dfile=!jarPath! -DgroupId=%groupId% -DartifactId=!artifactId! -Dversion=%version% -Dpackaging=jar -DlocalRepositoryPath=%localRepoPath$
)

endlocal