# dl4j-ui-server

Just a project to make a uber-jar of DL4J's UI server.

## Building

You can generate an uberjar with `sbt assembly`

## Usage

To use the UI server in your own project just run the server with:
    java jar dl4j-ui-server-0.9.1-assembly.jar --enableRemote --uiPort 9001
    
Then connect to it from Java code using the instructions [here](https://deeplearning4j.org/visualization)

    StatsStorageRouter remoteUIRouter = new RemoteUIStatsStorageRouter("http://UI_MACHINE_IP:9000");
    model.setListeners(remoteUIRouter, Collections.singletonList(new StatsListener(null)));
    
Your DL4J project no longer needs to depend on deeplearning4j-ui.
