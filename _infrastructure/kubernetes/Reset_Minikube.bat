@echo off
echo Stoppe Minikube...
minikube stop

echo Loesche Minikube...
minikube delete

echo Entferne Minikube Konfigurationsdateien...
rd /s /q "%HOMEPATH%\.minikube"
rd /s /q "%HOMEPATH%\.kube"

echo Minikube wird zurueckgesetzt und ist bereit zur Neuinstallation.

minikube start 
minikube addons enable ingress