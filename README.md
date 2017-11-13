Small Java application utillizing multi-stage build

## Single-stage

* Build: `docker image build -f Dockerfile.single -t people:singlestage .`
* Run: `docker container run -it -p 8080:8080 people:singlestage`
* Access: `curl http://localhost:8080/people/resources/persons`

== Multi-stage

* Build: `docker image build -f Dockerfile -t people:multistage .`
* Run: `docker container run -it -p 8080:8080 people:multistage`
* Access: `curl http://localhost:8080/people/resources/persons`

