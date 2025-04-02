set -u
: "$VERSION"

echo ${{secrets.ACCESS_TOCKEN}} | docker login ghcr.io --username jahnavi-vemuri --password-stdin
docker push ghcr.io/jahnavi-vemuri/arithmetic-service:$VERSION