kubectl create namespace keycloak

kubectl apply -f ./conf/keycloak_crd.yaml -n keycloak
kubectl apply -f ./conf/keycloak_realmimporter_crd.yaml -n keycloak
kubectl apply -f ./conf/keycloak_operator.yaml -n keycloak

pause