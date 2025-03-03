call Validate_Minikube_Kubectl.bat

kubectl apply -f "./conf/base.yaml" -n kafka 

kubectl wait kafka/my-cluster --for=condition=Ready --timeout=300s -n kafka 

pause
