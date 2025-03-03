call Validate_Minikube_Kubectl.bat

kubectl -n kafka delete -f https://strimzi.io/install/latest?namespace=kafka

kubectl delete namespace kafka

pause