kubectl apply -f ./conf/keycloak_postgres.yaml -n keycloak

kubectl create secret tls example-tls-secret --cert ./conf/certificate.pem --key ./conf/key.pem -n keycloak

kubectl create secret generic keycloak-db-secret --from-literal=username=admin --from-literal=password=admin -n keycloak

kubectl apply -f ./conf/keycloak_service.yaml -n keycloak

call Check_Status.bat
