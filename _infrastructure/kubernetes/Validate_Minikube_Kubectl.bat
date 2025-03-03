@echo off
REM Check if Minikube has started
echo Checking if Minikube has started...
minikube status | findstr /C:"host: Running" >nul
IF ERRORLEVEL 1 (

    REM If "host: Running" is not found, Minikube is not running
    echo Minikube is not running. Starting Minikube...
    minikube start
    IF ERRORLEVEL 1 (
        echo Failed to start Minikube. Exiting.
        pause
        exit /b 1
    )

) ELSE (
    REM If "host: Running" is found, Minikube is running
    echo Minikube is already running.
)
