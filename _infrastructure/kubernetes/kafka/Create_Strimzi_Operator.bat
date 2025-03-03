call Validate_Minikube_Kubectl.bat
kubectl create namespace kafka
kubectl create -f https://strimzi.io/install/latest?namespace=kafka -n kafka
pause