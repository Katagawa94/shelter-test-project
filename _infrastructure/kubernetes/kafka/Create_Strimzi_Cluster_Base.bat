call Validate_Minikube_Kubectl.bat

kubectl apply -f https://strimzi.io/examples/latest/kafka/kraft/kafka-single-node.yaml -n kafka 

kubectl wait kafka/my-cluster --for=condition=Ready --timeout=300s -n kafka 

pause
