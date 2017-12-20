# dl4j-ui-server

Just a project to make a uber-jar of DL4J's UI server.

## Building

You can generate an uberjar with `sbt assembly`

## Usage

To use the UI server in your own project just run the server with:
    java jar dl4j-ui-server-0.9.1-assembly.jar --enableRemote --uiPort 9001
    
Then connect to it from Java code using the instructions [here](https://deeplearning4j.org/visualization)

    // Add these imports
    // import org.deeplearning4j.ui.stats.StatsListener;
    // import org.deeplearning4j.api.storage.impl.RemoteUIStatsStorageRouter;
       
    StatsStorageRouter remoteUIRouter = new RemoteUIStatsStorageRouter("http://localhost:9001");
    StatsListener stats = new StatsListener(remoteUIRouter, null, null, null, "some session Name", null);
    model.setListeners(Collections.singletonList(stats));

    // Or for Spark:    
    // sparkModel.setListeners(remoteUiRouter, Collections.singletonList(new StatsListener(null)));
       
Your DL4J project no longer needs to depend on deeplearning4j-ui.
