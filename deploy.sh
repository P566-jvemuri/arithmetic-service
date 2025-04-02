set -u
: "p566spring2025.azurecr.io"
: "$VERSION"

envsubst < ./deploy.yaml | kubectl apply -f -
