call Validate_Minikube_Kubectl.bat

for /f "tokens=*" %%i in ('kubectl get strimzi -o name -n kafka') do (
    kubectl -n kafka delete %%i
)

kubectl delete pvc -l strimzi.io/name=my-cluster-kafka -n kafka