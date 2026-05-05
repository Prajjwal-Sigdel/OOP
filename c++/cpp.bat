@echo off
REM Batch script to compile and run C++ files
REM Usage: cpp filename.cpp

if "%~1"=="" (
    echo Usage: cpp filename.cpp
    exit /b 1
)

set "source=%~1"
set "exe=%~dpn1.exe"

echo Compiling %source%...
C:\MinGW\bin\g++.exe -std=c++17 -g "%source%" -o "%exe%"

if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed!
    exit /b %ERRORLEVEL%
)

echo Compilation successful! Running %exe%...
echo.
start cmd /k "%exe%"
