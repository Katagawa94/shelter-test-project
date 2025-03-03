# Kubernetes
Kubernetes wurde lokal mit Hilfe von [Strimzi](https://strimzi.io/quickstarts/), Docker Desktop und [Minikube](https://minikube.sigs.k8s.io/docs/start/?arch=%2Fwindows%2Fx86-64%2Fstable%2F.exe+download) eingerichtet. <br>
Minikube ist eine single node Kubernetes-Lösung, bei der der einzelne Knoten sowohl als Master,
als auch als Slave fungiert. Eine kleine Kubernetes-Test-Spielwiese sozusagen.

## Kafka
Strimzi ist ein Kafka Operator, der auf dieser kleinen Spielwiese operieren kann.
Docker Desktop kümmert sich um die Verwaltung von diesem einzelnen Minikube-Container.

## Keycloak
Neben Kafka soll auf Minikube noch eine [Keycloak](https://www.keycloak.org/getting-started/getting-started-kube)-Instanz laufen. Dieser soll als allgemeiner Authentifizierungs-Dienst dienen und für SSOs genutzt werden.
