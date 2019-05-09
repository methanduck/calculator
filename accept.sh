#!/bin/bash
#test $(curl localhost:8090/sum?a=1\&b=2) -eq 3 || \
#test $(curl $(docker network inspect -f '{{range .IPAM.Config}}{{.Gateway}}{{end}}'bridge):8090/sum?=1\&b=2) -eq 3
CALCULATOR_PORT=$(docker-compose port calc 8090 | cut -d: -f2)
test curl -X GET localhost:$CALCULATOR_PORT/sum?a=10\&b=2) -eq 12

