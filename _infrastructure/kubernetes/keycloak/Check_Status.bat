kubectl get keycloaks/example-kc -n keycloak -o go-template="{{range .status.conditions}}CONDITION: {{.type}}{{\"\n\"}}  STATUS: {{.status}}{{\"\n\"}}  MESSAGE: {{.message}}{{\"\n\"}}{{end}}"

pause