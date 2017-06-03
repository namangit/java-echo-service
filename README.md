
This is a simple application based on SpringBoot used as an example in the following post:

`http://blog.stack.foundation/2017/06/03/how-to-use-docker-without-knowing-docker/`

As mentioned there, the approach discussed to bundle this application's artifact is not the ideal one, so will now describe what 
that would be in a real life scenario. The file `Dockerfile-post` in this project corresponds to that approach.

At least, when bundling java artifacts within a docker image, the recommended approach is to bundle all your dependencies
within the project jar, and then execute it the good old way by running: `java -jar ARTIFACT.jar`.

There are several maven plugins that will help you accomplish this, but given that we're building a SpringBoot application,
we'll use the spring-boot-maven-plugin for doing so. If you were not using the SpringBoot stack, you could use the maven shade
plugin (https://maven.apache.org/plugins/maven-shade-plugin/) to achieve the same goal.

With this setup, running `mvn clean package` within the root project will generate the bundle jar that we'll be adding to
our docker image. After that, we can build the image `docker build -t sandbox/echo .` and run the container 
`docker run --rm --name=echo -p 8888:8080 sandbox/echo` with the same commands we used in the post.


