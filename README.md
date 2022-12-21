### Catalog API repository

#### K8s manifest files in k8s folder

* catalog-api.yaml
* catalog-postgres.yaml
* config-map.yaml
* secret.yaml

#### Docker configuration

* Dockerfile

##### start Minikube and check status

    minikube start --driver docker 
    minikube status

##### Create catalog api docker image

    mvn clean install
    docker build -t catalog-image:dev-0.2 . 
    docker tag catalog-image:dev-0.2 imadberkati/catalog-image:dev-0.2
    docker push imadberkati/catalog-image:dev-0.2

##### Run postgres and catalog-image:dev-0.2 pods

    kubectl apply -f secret.yaml 
    kubectl apply -f config-map.yaml
    kubectl apply -f catalog-postgres.yaml
    kubectl apply -f catalog-api.yaml

<br />

> /!\ **Known issue - Minikube IP not accessible** /!\

If you can't access the NodePort service webapp with `MinikubeIP:NodePort`, execute the following command:

    minikube service catalog-service

<br />

##### get minikube node's ip address

    minikube ip

##### get basic info about k8s components

    kubectl get node 
    kubectl get pod
    kubectl get svc
    kubectl get all
    kubectl logs {pod-name}

##### get extended info about components

    kubectl get pod -o wide
    kubectl get node -o wide

##### get detailed info about a specific component

    kubectl describe svc {svc-name}
    kubectl describe pod {pod-name}

##### Delete k8s configuration

    kubectl delete -f secret.yaml 
    kubectl delete -f config-map.yaml
    kubectl delete -f catalog-postgres.yaml
    kubectl delete -f catalog-api.yaml

##### stop your Minikube cluster

    minikube stop

#### Links
* postgres image on Docker Hub: https://hub.docker.com/_/postgres
* catalog api image on Docker Hub: https://hub.docker.com/repository/docker/imadberkati/catalog-image