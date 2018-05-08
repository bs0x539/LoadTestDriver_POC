loadtestdriver_poc
==============

Simple Vaadin application which demonstrates some bugs in the LoadTestDriver.

Workflow
========

Compile
-------
To compile the entire project, run `mvn install`.

To run the application, run `mvn jetty:run` and open http://localhost:8080/ .

Prepare for Test
----------------

Download PhantomJS and place `phantomjs` executable in `$PATH`.
* Statically linked binary: https://bitbucket.org/ariya/phantomjs/downloads/phantomjs-2.1.1-linux-x86_64.tar.bz2

**Caveats:**

* PhantomJS >=2.0.0 must be installed
* Java 8
* `ScreenshotOnFailureRule` has to be used because otherwise the scala scripts are not being saved as files.
* Due to PhantomJS limitations the AUT must **not** be accessed using `localhost` or `127.0.0.1`. Use real Hostname/IP instead.
* Gatling-Recorder requires a GUI. Can be disabled when initializing the WebDriver but that does not work.


Test
----

* Run `mvn test`
* Gatling-Recorder window should show up
* Scala scripts as well as HTTP request and response files will be places in `./gatling/` directory


Execute Load Tests with Gatling
-------------------------------

* Download Gatling: https://gatling.io/download/
* Extract downloaded zip file
* Change into extracted `bin` directory
* Run Gatling with following command specifying the `gatling` directory generated in the previous step:

```
./gatling.sh -sf <path to project directory>/gatling
```

* Inspect any errors on the command line

