set -u
: "$VERSION"

docker build -t ghcr.io/jahnavi-vemuri/arithmetic-service:$VERSION --file ./Dockerfile .